/**
 * MazeLocation
 * Created for CSC 115 Assignment Three
 * Authored by Mike Zastre, required to run Maze.java
 */

/**
 * MazeLocation objects contain a row & column value indicating
 * a cell position in a 2D maze.
 */
public class MazeLocation {
    int row;
    int column;

    MazeLocation(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public String toString() {
        return "(" + this.row + ", " + this.column + ")";
    }

    public boolean equals(MazeLocation loc) {
        return (this.row == loc.row && this.column == loc.column);
    }
}
