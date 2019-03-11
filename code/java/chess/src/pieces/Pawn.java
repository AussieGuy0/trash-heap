package pieces;


/**
 * Created by anthony on 16/07/16.
 */
public class Pawn extends Piece {

    public Pawn(boolean white) {
        super(white);
        if (white) {
            visualRepresentation = "\u2659";
        } else {
            visualRepresentation = "\u265F";
        }
        moveLimit = 2;
        straightLineMovement = true;
        diagonalLineMovement = false;
    }

    public void moved() {
        moveLimit = 1;
    }
}
