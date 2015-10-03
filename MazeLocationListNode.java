/**
 * MazeLocationListNode.java
 *
 * Created for CSC 115 Assignment Three
 * Authored by Mike Zastre, required to run Maze.java
 */

class MazeLocationListNode {
    MazeLocation loc;
    MazeLocationListNode next;

    MazeLocationListNode(MazeLocation loc) {
        this.loc = loc;
        this.next = null;
    }

    boolean equals(MazeLocation loc) {
        return ((this.loc.row == loc.row) &&
               (this.loc.column == loc.column));
    }
}
