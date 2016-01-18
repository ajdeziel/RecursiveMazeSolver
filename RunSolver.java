/**
 * RunSolver.java
 *
 * Authored by Mike Zastre, required to run Maze.java
 *
 * This top-level program takes the name of a file containing maze
 * information, and then reads this into a integers and an array
 * of strings. The Maze object is instantiated, solve() called on it
 * and the results (if any) are output on the console.
 *
 * This code will not compile until there is an implementation of
 * the Maze.java class that has at least a constructor and a
 * bare-bones implementation of solve() (i.e., bare-bones means that
 * the method simply returns null).
 */

import java.io.*;
import java.util.*;


public class RunSolver {
    public static void main(String args[]) {
        if (args.length < 1) {
            System.err.println("usage: java RunSolver <mazefile");
            System.exit(1);
        }

        try {
            String infileName = args[0];
            Scanner infileScanner;
            int rows, columns;
            int startRow, startColumn;
            int finishRow, finishColumn;

            infileScanner = new Scanner(new File(infileName));

            rows = infileScanner.nextInt();
            columns = infileScanner.nextInt();
            startRow = infileScanner.nextInt();
            startColumn = infileScanner.nextInt();
            finishRow = infileScanner.nextInt();
            finishColumn = infileScanner.nextInt();
         
            infileScanner.nextLine();
 
            String mazeData[] = new String[rows];
       
            for (int row = 0; row < rows; row++) {
                String line = infileScanner.nextLine();
                mazeData[row] = line.trim();
            }

            Maze maze = new Maze(mazeData, startRow, startColumn,
                finishRow, finishColumn);

            MazeLocationList path = maze.solve();

            if (path == null) {
                System.out.println("No path!!");
            } else {
                for (int i = 0; i < path.getLength(); i++) {
                    System.out.println(path.retrieve(i).toString());
                }
            } 
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1); 
        }        
        
    }
}
