package pieces;

/**
 * Created by anthony on 16/07/16.
 */
public class Knight extends Piece {

    public Knight(boolean white) {
        super(white);
        if (white) {
            visualRepresentation = "\u2658";
        } else {
            visualRepresentation = "\u265E";
        }
        straightLineMovement = false;
        diagonalLineMovement = false;
    }
}
