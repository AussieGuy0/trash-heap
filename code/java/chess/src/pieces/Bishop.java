package pieces;

/**
 * Created by anthony on 16/07/16.
 */
public class Bishop extends Piece {

    public Bishop(boolean white) {
        super(white);
        if (white) {
            visualRepresentation = "\u2657";
        } else {
            visualRepresentation = "\u265D";
        }
        straightLineMovement = false;
        diagonalLineMovement = true;
        moveLimit = 8;
    }
}
