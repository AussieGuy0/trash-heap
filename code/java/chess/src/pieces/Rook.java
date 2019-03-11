package pieces;

/**
 * Created by anthony on 16/07/16.
 */
public class Rook extends Piece {

    public Rook(boolean white) {
        super(white);
        if (white) {
            visualRepresentation = "\u2656";
        } else {
            visualRepresentation = "\u265C";
        }
        diagonalLineMovement = false;
        straightLineMovement = true;
        moveLimit = 8;
    }
}
