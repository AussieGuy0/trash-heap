package pieces;

import javax.swing.*;
import java.awt.*;

/**
 * Created by anthony on 16/07/16.
 */
public abstract class Piece {
    private final boolean white;
    public static final boolean WHITE = true;
    public static final boolean BLACK = false;
    String visualRepresentation;
    boolean straightLineMovement;
    boolean diagonalLineMovement;
    int moveLimit;


    Piece(boolean white) {
        this.white = white;
    }

    public boolean isWhite() {
        return white;
    }

    public JLabel display() {
        JLabel label = new JLabel(visualRepresentation);
        label.setFont(new Font(label.getFont().getName(), Font.PLAIN, 40));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(white ? Color.white : Color.black);
        return label;
    }

    public boolean canMoveStraight() {
        return straightLineMovement;
    }

    public boolean canMoveDiagonal() {
        return diagonalLineMovement;
    }

    public int getMoveLimit() {
        return moveLimit;
    }
}
