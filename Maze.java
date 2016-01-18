/** 
 * Maze.java
 * Author: AJ Po-Deziel
 */
 
 public class Maze {

	private String[] textMaze;
	private int startRow;
	private int startCol;
	private int finishRow;
	private int finishCol;
	private int dir;
	private char[][] mazeArray;
	private MazeLocationListRefBased inputHere;
 
	public Maze(String[] textMaze, int startRow, int startCol, 
		int finishRow, int finishCol) {
		this.textMaze = textMaze;
		this.startRow = startRow;
		this.startCol = startCol;
		this.finishRow = finishRow;
		this.finishCol = finishCol;
		inputHere = new MazeLocationListRefBased();
		mazeArray = new char[textMaze.length][textMaze[0].length()];
		mazeArray = convertStringToChar2D(textMaze);
		System.out.println(this);
	}//end Maze (constructor)
	
	
	public MazeLocationList solve() {
	
		//Solve path through maze by calling findPath.
		
		if (findPath(startRow, startCol, finishRow, finishCol) == false) {
			return null;
		} else {
			return inputHere;
		}//end if else
	}//end solve
	
	
	private boolean findPath(int fromRow, int fromCol,
		int toRow, int toCol) {
		
		//This method creates the solution that solves the path through the maze.
		
		boolean solved = false;
		
		//Set up to evaluate within maze walls
		if ((fromRow < 0) || (fromRow >= mazeArray.length) 
			|| (fromCol < 0) || (fromCol >= mazeArray[0].length)) {
			return false;
		}//end if
		
		//Check for maze walls
		if (mazeArray[fromRow][fromCol] == '*') {
			return false;
		} else {mazeArray[fromRow][fromCol] = '*';}
		
		System.out.println(fromRow + " " + fromCol);
		
		MazeLocation current = new MazeLocation(fromRow, fromCol);
		inputHere.insertTail(current);
		
		if (fromRow == toRow && fromCol == toCol) { // When current point equals finish point
			return true;
		}//end if
		
		if (findPath(fromRow, fromCol + 1, toRow, toCol)) { //Go right
			solved = true;
		} else if (findPath(fromRow - 1, fromCol, toRow, toCol)) { //Go up
			solved = true;
		} else if (findPath(fromRow, fromCol - 1, toRow, toCol)) { //Go left
			solved = true;
		} else if (findPath(fromRow + 1, fromCol, toRow, toCol)) { //Go down
			solved = true;
		}//end if else
		
		if (!solved) {
			inputHere.removeTail();
		}//end if
		
		return solved;
	}//end findPath (inspired in part by code found @ http://rosettacode.org/wiki/Maze_solving#Java)
	
	
	private char[][] convertStringToChar2D(String[] strArray) {
	
		//Since String is immutable, String is converted into 2D Char Array.
		
		if (strArray == null || strArray[0] == null) {
			return null;
		}
		
		int strLength = strArray[0].length();
		char[][] array = new char[strArray.length][strLength];
		
		//Provided that all strings are the same length
		for (int i = 0; i < strArray.length; i++) {
			for (int j = 0; j < strLength; j++) {
				array[i][j] = strArray[i].charAt(j);
			}//end for
		}//end for
		System.out.println(this);
		return array;
	}//end convertStringToChar2D

	
	public String toString() {
		StringBuilder sb = new StringBuilder(); //use StringBuilder when building String in a loop
		for (int i = 0; i < mazeArray.length; i++) {
			for (int j = 0; j < mazeArray[i].length; j++) {
				sb.append(mazeArray[i][j]);
			}//end for
			sb.append("\n");
		}//end for
		return sb.toString();
	}//end toString
 }//end class Maze
