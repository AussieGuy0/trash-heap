package au.com.anthonybruno.maze;

import au.com.anthonybruno.maze.square.Square;

import java.util.List;

public class Maze {

    private final List<List<Square>> squares;

    public Maze(List<List<Square>> squares) {
        this.squares = squares;
    }

    public Square getSquareAt(Position position) {
        return squares.get(position.getY()).get(position.getX());
    }
}
