import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anthony on 1/08/16.
 */
public class MovementHandler {
    private final List<Square> movementCandidates = new ArrayList<>();
    private final Map<Square,Square> whiteOwnedSquares = new HashMap<>();
    private final Map<Square,Square> blackOwnedSquares = new HashMap<>();
    private boolean rotated;
    private Square[][] squares;
    private Piece pieceSelected;
    private Piece currentPiece;
    private int type = 0;
    private Square whiteKingSquare;
    private Square blackKingSquare;

    public MovementHandler(Square[][] squares) {
        rotated = false;
        this.squares = squares;
    }

    public void setRotated(boolean rotated) {
        this.rotated = rotated;
    }

    public void setSquares(Square[][] squares) {
        this.squares = squares;
    }

    public void setPieceSelected(Piece pieceSelected) {
        this.pieceSelected = pieceSelected;
    }

    public void setWhiteKingSquare(Square whiteKingSquare) {
       this.whiteKingSquare = whiteKingSquare;
    }

    public void setBlackKingSquare(Square blackKingSquare) {
        this.blackKingSquare = blackKingSquare;
    }

    public void determineDiagonalMovement(int currentXPositionSquare, int currentYPositionSquare,int movement) {
        boolean blockedNorthEast = false;
        boolean blockedSouthEast = false;
        boolean blockedSouthWest = false;
        boolean blockedNorthWest = false;
        for (int i = 1; i <= movement; i++) {
            if (!blockedNorthEast && currentXPositionSquare - i >= 0 && currentYPositionSquare - i >= 0) {
                blockedNorthEast = determineMovement(currentXPositionSquare - i, currentYPositionSquare - i);
            }
            if (!blockedSouthEast && currentXPositionSquare - i >= 0 && currentYPositionSquare + i <= 7) {
                blockedSouthEast = determineMovement(currentXPositionSquare - i, currentYPositionSquare + i);
            }
            if (!blockedSouthWest && currentXPositionSquare + i <= 7 && currentYPositionSquare - i >= 0) {
                blockedSouthWest = determineMovement(currentXPositionSquare + i, currentYPositionSquare - i);
            }
            if (!blockedNorthWest && currentXPositionSquare + i <= 7 && currentYPositionSquare + i <= 7) {
                blockedNorthWest = determineMovement(currentXPositionSquare + i, currentYPositionSquare + i);
            }
        }
    }

    public void determineStraightMovement(int currentXPositionSquare, int currentYPositionSquare,int movement) {
        boolean blockedNorth = false;
        boolean blockedEast = false;
        boolean blockedSouth = false;
        boolean blockedWest = false;
        for (int i = 1; i <= movement; i++) {
            if (!blockedNorth && currentXPositionSquare - i >= 0) {
                blockedNorth = determineMovement(currentXPositionSquare - i, currentYPositionSquare);
            }
            if (!blockedSouth && currentXPositionSquare + i <= 7) {
                blockedSouth = determineMovement(currentXPositionSquare + i, currentYPositionSquare);
            }
            if (!blockedEast && currentYPositionSquare - i >= 0) {
                blockedEast = determineMovement(currentXPositionSquare, currentYPositionSquare - i);
            }
            if (!blockedWest && currentYPositionSquare + i <= 7) {
                blockedWest = determineMovement(currentXPositionSquare, currentYPositionSquare + i);
            }
        }
    }
    public void determinePawnCaptureCandidates(int currentHorizontalSquare, int currentVerticalSquare, boolean pieceWhite) {
        int direction;
        int forward = rotated ? -1 : 1;
        if (pieceWhite) { //need to change line
            direction = -1 * forward; //will look north for captures
        } else {
            direction = forward;  //will look south for captures
        }
        if (currentVerticalSquare != 7 && currentVerticalSquare != 0 && squares[currentHorizontalSquare + direction][currentVerticalSquare + 1].getPiece() != null) {
            determineMovement(currentHorizontalSquare + direction, currentVerticalSquare + 1);
        } else if (currentVerticalSquare !=7 && currentVerticalSquare != 0){
            Square rightSquare = squares[currentHorizontalSquare + direction][currentVerticalSquare + 1];
           if (type == 1)  {
              whiteOwnedSquares.put(rightSquare,rightSquare);
           } else if (type == 2) {
               blackOwnedSquares.put(rightSquare,rightSquare);
           }
        }

        if (currentVerticalSquare != 0 && squares[currentHorizontalSquare + direction][currentVerticalSquare - 1].getPiece() != null) {
            determineMovement(currentHorizontalSquare +direction, currentVerticalSquare-1);
        } else if (currentVerticalSquare != 0) {
            Square leftSquare = squares[currentHorizontalSquare + direction][currentVerticalSquare - 1];
            if (type == 1)  {
                whiteOwnedSquares.put(leftSquare,leftSquare);
            } else if (type == 2) {
                blackOwnedSquares.put(leftSquare, leftSquare);
            }
        }
    }

    public void determineKnightMovement(int currentXPositionSquare, int currentYPositionSquare) {
        if (currentXPositionSquare + 2 <= 7) {
            if (currentYPositionSquare - 1 >= 0) {
                determineMovement(currentXPositionSquare + 2, currentYPositionSquare - 1);
            }
            if (currentYPositionSquare + 1 <= 7) {
                determineMovement(currentXPositionSquare + 2, currentYPositionSquare + 1);
            }
        }
        if (currentXPositionSquare - 2 >= 0) {
            if (currentYPositionSquare - 1 >= 0) {
                determineMovement(currentXPositionSquare - 2, currentYPositionSquare - 1);
            }
            if (currentYPositionSquare + 1 <= 7) {
                determineMovement(currentXPositionSquare - 2, currentYPositionSquare + 1);
            }
        }
        if (currentYPositionSquare + 2 <= 7) {
            if (currentXPositionSquare - 1 >= 0) {
                determineMovement(currentXPositionSquare - 1, currentYPositionSquare + 2);
            }
            if (currentXPositionSquare + 1 <= 7) {
                determineMovement(currentXPositionSquare + 1, currentYPositionSquare + 2);
            }
        }
        if (currentYPositionSquare - 2 >= 0) {
            if (currentXPositionSquare - 1 >= 0) {
                determineMovement(currentXPositionSquare - 1, currentYPositionSquare - 2);
            }
            if (currentXPositionSquare + 1 <= 7) {
                determineMovement(currentXPositionSquare + 1, currentYPositionSquare - 2);
            }
        }
    }

    private boolean determineMovement(int xPosition, int yPosition) {
        Square movementCandidate = squares[xPosition][yPosition];
        if (movementCandidate.getPiece() == null) {
            if (type == 0) {
                if (pieceSelected instanceof King) {
                    //checking if moving into check
                   if (pieceSelected.isWhite() && blackOwnedSquares.get(movementCandidate) != null) {
                       return false;
                   } else if (!pieceSelected.isWhite() && whiteOwnedSquares.get(movementCandidate) != null) {
                       return false;
                   }
                }
                movementCandidate.setMovementCanidate(true);
                movementCandidates.add(movementCandidate);
            } else if (type == 1){
                whiteOwnedSquares.put(movementCandidate,movementCandidate);
            } else {
                blackOwnedSquares.put(movementCandidate,movementCandidate);
            }
            return false;
        } else if (movementCandidate.getPiece().isWhite() != pieceSelected.isWhite() && type == 0) {
                movementCandidate.setMovementCanidate(true);
                movementCandidates.add(movementCandidate);
            return true;
        } else if (type > 0 && currentPiece != null && (currentPiece.isWhite() != movementCandidate.getPiece().isWhite())) {
            if (type == 1){
                whiteOwnedSquares.put(movementCandidate,movementCandidate);
            } else {
                blackOwnedSquares.put(movementCandidate,movementCandidate);
            }
           return true;
        }
            else {
            return true;
        }
    }

    public void determinePawnForwardMovement(int movement, int currentXPositionSquare, int currentYPositionSquare) {
        Square movementCandidate;
        for (int i = 0; i < movement; i++) { //forward movement
            int forward = rotated ? -1 : 1;
            if (pieceSelected.isWhite()) {
                movementCandidate = squares[currentXPositionSquare += -1 * forward][currentYPositionSquare];
            } else {
                movementCandidate = squares[currentXPositionSquare += forward][currentYPositionSquare];
            }
            if (movementCandidate.getPiece() == null) {
                movementCandidate.setMovementCanidate(true);
                movementCandidates.add(movementCandidate);
            } else {
                break; //piece blocking movement
            }
        }
    }


    public List<Square> getMovementCandidates() {
        return movementCandidates;
    }

    public void determineOwnedSquares() {
        whiteOwnedSquares.clear();
        blackOwnedSquares.clear();
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {
                Piece piece = squares[i][j].getPiece();
                if (piece != null) {
                    int movement = piece.getMoveLimit();
                    type = piece.isWhite() ? 1 : 2;
                    currentPiece = piece;
                    addOwnedSquares(piece,i,j,movement);
                }
            }
        }
//        System.out.println("Black owned squares: " + blackOwnedSquares.toString());
//        System.out.println("White owned squares: " + whiteOwnedSquares.toString());
        if (whiteOwnedSquares.get(blackKingSquare) != null) {
            blackKingSquare.setChecked();
        }

        if (blackOwnedSquares.get(whiteKingSquare) != null) {
            whiteKingSquare.setChecked();
        }
        type = 0;
    }

    private void addOwnedSquares(Piece piece, int xPosition, int yPosition, int moveLimit) {
        if (piece instanceof Pawn) {
            determinePawnCaptureCandidates(xPosition,yPosition,piece.isWhite());
        } else if (piece instanceof Knight) {
            determineKnightMovement(xPosition,yPosition);
        } else {
            if (piece.canMoveStraight()) {
                determineStraightMovement(xPosition, yPosition, moveLimit);
            }
            if (piece.canMoveDiagonal()) {
                determineDiagonalMovement(xPosition,yPosition,moveLimit);
            }
        }
    }
}
