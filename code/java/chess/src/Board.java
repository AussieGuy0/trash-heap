import pieces.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 * Created by anthony on 16/07/16.
 */
public class Board extends JPanel implements MouseListener {
    //first: x position, second y postion
    private final Square[][] squares = new Square[8][8];
    private Square squareClicked;
    private Piece pieceSelected;
    private boolean whitePlayersTurn;
    private boolean rotated;
    private final MovementHandler movementHandler;

    Board() {
        movementHandler = new MovementHandler(squares);
        setLayout(new GridLayout(8, 8));
        int number = 8;
        for (int i = 0; i < squares.length; i++) {
            char letter = 'a';
            for (int j = 0; j < squares[i].length; j++) {
                Color color;
                if ((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) {
                    color = Color.gray;
                } else {
                    color = Color.lightGray;
                }
                Square square = new Square(letter++ + "" + number, color);
                square.addMouseListener(this);
                squares[i][j] = square;
                add(square);
                if (square.getPiece() instanceof King) {
                   if (square.getPiece().isWhite()) {
                      movementHandler.setWhiteKingSquare(square);
                   } else {
                       movementHandler.setBlackKingSquare(square);
                   }
                }
            }
            number--;
        }
        whitePlayersTurn = true;
        rotated = false;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(((Square) e.getComponent()).getGridPosition());
        if (squareClicked != null) { //piece on square
            if (squareClicked.equals(e.getComponent()) && squareClicked.isSelected()) {
                //clicking on same piece deselects it
                squareClicked.setSelected(false);
                deselectMovementCandidates();
                return;
            }
            squareClicked.setSelected(false);
        }
        Square newSquareClicked = (Square) e.getComponent();
        if (pieceSelected != null && newSquareClicked.isMovementCanidate()) { //moving piece
            if (pieceSelected instanceof Pawn) {
                ((Pawn) pieceSelected).moved();
                if (newSquareClicked.getGridPosition().contains("1")) { //testing promotion
//                    JDialog dialog = new JDialog((JFrame)SwingUtilities.getWindowAncestor(this), "Select Promotion Piece", true);
//                    dialog.setVisible(true);
                    pieceSelected = new Queen(pieceSelected.isWhite());
                }
            }
            if (pieceSelected instanceof King) {
                if (pieceSelected.isWhite()) {
                    movementHandler.setWhiteKingSquare(newSquareClicked);
                } else {
                    movementHandler.setBlackKingSquare(newSquareClicked);
                }
            }
            newSquareClicked.setPiece(pieceSelected);
            squareClicked.setPiece(null);
            deselectMovementCandidates();
            whitePlayersTurn = !whitePlayersTurn;
            //everytime piece moves, determine the owned squares
            movementHandler.determineOwnedSquares();
            return;
        }
        deselectMovementCandidates();

        squareClicked = newSquareClicked;
        if ((pieceSelected = squareClicked.getPiece()) != null && pieceSelected.isWhite() == whitePlayersTurn) { //determine movement of piece
            squareClicked.setSelected(true);
            movementHandler.setPieceSelected(pieceSelected);
            int[] arrayPosition = getArrayPosition(squareClicked);
            int currentXPositionSquare = arrayPosition[0];
            int currentYPositionSquare = arrayPosition[1];
            int movement = squareClicked.getPiece().getMoveLimit();
            if (squareClicked.getPiece() instanceof Pawn) {
                movementHandler.determinePawnCaptureCandidates(currentXPositionSquare, currentYPositionSquare, pieceSelected.isWhite());
                movementHandler.determinePawnForwardMovement(movement, currentXPositionSquare,currentYPositionSquare);
            } else if (squareClicked.getPiece() instanceof Knight) {
                //knight stuff
                movementHandler.determineKnightMovement(currentXPositionSquare, currentYPositionSquare);
            } else {
                //Rook, Bishop, King, Queen
                if (pieceSelected.canMoveDiagonal()) {
                    movementHandler.determineDiagonalMovement(currentXPositionSquare, currentYPositionSquare, movement);
                }
                if (pieceSelected.canMoveStraight()) {
                    movementHandler.determineStraightMovement(currentXPositionSquare, currentYPositionSquare, movement);
                }
            }
        } else {
            //clicking on opposite color piece
            pieceSelected = null;
            squareClicked = null;
        }
    }



    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    /**
     * Clears any movement candidates.
     */
    private void deselectMovementCandidates() {
        for (Square movementSquares : movementHandler.getMovementCandidates()) {
            movementSquares.setMovementCanidate(false);
        }
    }

    /**
     * Gets the array position in the squares array for the specified square. Determines position via the gridposition
     * string contained within a Square
     *
     * @param square The Square where the array position for which will be returned.
     * @return an 2 element array where the first element is the xPosition and the second element is the yPostion of the array.
     */
    private int[] getArrayPosition(Square square) {
        String gridPosition = square.getGridPosition();
        int yPosition;
        int xPosition;
        if (rotated) {
            xPosition = Integer.parseInt(gridPosition.charAt(1) + "") - 1;
            yPosition = 7 - (gridPosition.charAt(0) - 97);
        } else {
            xPosition = 8 - Integer.parseInt(gridPosition.charAt(1) + "");
            yPosition = (gridPosition.charAt(0) - 97);
        }
        return new int[]{xPosition, yPosition};
    }

    /**
     *
     */
    public void rotateBoard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                Square temp = squares[i][j];
                squares[i][j] = squares[7 - i][j];
                squares[7 - i][j] = temp;
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                Square temp = squares[i][j];
                squares[i][j] = squares[i][7 - j];
                squares[i][7 - j] = temp;
            }
        }
        reAddSquares();
        repaint();
        revalidate();
        rotated = !rotated;
        movementHandler.setRotated(rotated);
        movementHandler.setSquares(squares);
    }

    /**
     * Removes and re-adds the squares. Used by rotate board to visually rotate the board
     */
    private void reAddSquares() {
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {
                remove(squares[i][j]);
            }
        }
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {
                add(squares[i][j]);
            }
        }
    }

}

