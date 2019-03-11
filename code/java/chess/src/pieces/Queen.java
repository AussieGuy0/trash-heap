package pieces;

/**
 * Created by anthony on 16/07/16.
 */
public class Queen extends Piece {

    public Queen(boolean white) {
        super(white);
        if (white) {
            visualRepresentation = "\u2655";
        } else {
            visualRepresentation = "\u265B";
        }
        diagonalLineMovement = true;
        straightLineMovement = true;
        moveLimit = 8;
    }
}
