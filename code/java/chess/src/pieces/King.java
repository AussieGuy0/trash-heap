package pieces;

/**
 * Created by anthony on 16/07/16.
 */
public class King extends Piece {

    public King(boolean white) {
        super(white);
        if (white) {
            visualRepresentation = "\u2654";
        } else {
            visualRepresentation = "\u265A";
        }
        moveLimit = 1;
        diagonalLineMovement = true;
        straightLineMovement = true;
    }
}
