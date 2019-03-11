import pieces.*;

import javax.swing.*;
import java.awt.*;

/**
 * Created by anthony on 16/07/16.
 */
public class Square extends JPanel {

    private final String gridPosition;
    private Piece piece;
    private boolean selected;
    private boolean movementCanidate;
    private JLabel label;

    public Square(String gridPosition, Color color) {
        setLayout(new GridLayout(1, 1));
        Piece piece = null;
        if (gridPosition.endsWith("8")) {
            piece = determinePiece(gridPosition.charAt(0), false);
        } else if (gridPosition.endsWith("7")) {
            piece = new Pawn(Pawn.BLACK);
        } else if (gridPosition.endsWith("2")) {
            piece = new Pawn(Pawn.WHITE);
        } else if (gridPosition.endsWith("1")) {
            piece = determinePiece(gridPosition.charAt(0), true);
        }
        if (piece != null) {
            label = piece.display();
            add(label);
            this.piece = piece;
        }
        this.gridPosition = gridPosition;
        selected = false;
        movementCanidate = false;
        setBackground(color);
    }

    public Piece getPiece() {
        return piece;
    }

    public String getGridPosition() {
        return gridPosition;
    }

    public void setPiece(Piece piece) {
        if (label != null) {
            remove(label);
        }
        if (piece != null) {
            label = piece.display();
            add(label);
        }
        this.piece = piece;
        repaint();
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        if (selected) {
            setBorder(BorderFactory.createLineBorder(Color.green));
        } else {
            setBorder(BorderFactory.createEmptyBorder());
        }
        this.selected = selected;
    }

    public boolean isMovementCanidate() {
        return movementCanidate;
    }

    public void setMovementCanidate(boolean set) {
        if (set) {
            setBorder(BorderFactory.createLineBorder(Color.yellow));
        } else {
            setBorder(BorderFactory.createEmptyBorder());
        }
        movementCanidate = set;
    }

    public void setChecked() {
        setBorder(BorderFactory.createLineBorder(Color.red));
    }

    private Piece determinePiece(char position, boolean white) {
        boolean color = white ? Piece.WHITE : Piece.BLACK;
        Piece piece = null;
        switch (position) {
            case 'a':
            case 'h':
                piece = new Rook(color);
                break;
            case 'b':
            case 'g':
                piece = new Knight(color);
                break;
            case 'c':
            case 'f':
                piece = new Bishop(color);
                break;
            case 'd':
                piece = new Queen(color);
                break;
            case 'e':
                piece = new King(color);

        }
        return piece;

    }

    public String toString() {
        return gridPosition;
    }
}
