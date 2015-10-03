/**
 * MazeTester.java
 * CSC 115 - Assignment 3
 * MazeTester.java will test the methods implemented in Maze.java
 * Author: Alain-Joseph Po-Deziel
 * UVic ID: V00815622
 * Date: 04/03/2015
 */
 
 public class MazeTester {
	
	public static void main (String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
		test7();
	}//end main
	
	private static void test1() {
		boolean pass = true;
		
		String testMaze1[] = {"** ****",
							  "*  ****",
							  "* *****",
							  "*    **",
							  "**** **"};
	
		Maze maze = new Maze(testMaze1, 0, 2, 4, 4);
	
		MazeLocation expected[] = new MazeLocation[9];
		expected[0] = new MazeLocation(0, 2);
		expected[1] = new MazeLocation(1, 2);
		expected[2] = new MazeLocation(1, 1);
		expected[3] = new MazeLocation(2, 1);
		expected[4] = new MazeLocation(3, 1);
		expected[5] = new MazeLocation(3, 2);
		expected[6] = new MazeLocation(3, 3);
		expected[7] = new MazeLocation(3, 4);
		expected[8] = new MazeLocation(4, 4);
	
		MazeLocationList solution = maze.solve();
		
		if (solution == null) {
			pass = false;
		} else if (solution.isEmpty() == true) {
			pass = false;
		} else {
			for (int i = 0; i < solution.getLength(); i++) {
				MazeLocation location = solution.retrieve(i);
				if (location.equals(expected[i]) == false) {
					pass = false;
					break;
				}//end if
			}//end for
		}//end if else statement
		
		if (pass) {
			System.out.println("test1: PASSED!");
		} else {
			System.out.println("test1: FAILED.");
		}//end if declaring System print statements
		
	}//end test1
	
	
	private static void test2() {
		boolean pass = true;
		
		String testMaze2[] = {"* ******",
							  "*  *   *",
							  "**   ***",
							  "**** ***"};
	
		Maze maze = new Maze(testMaze2, 0, 1, 3, 4);
	
		MazeLocation expected[] = new MazeLocation[7];
		expected[0] = new MazeLocation(0, 1);
		expected[1] = new MazeLocation(1, 1);
		expected[2] = new MazeLocation(1, 2);
		expected[3] = new MazeLocation(2, 2);
		expected[4] = new MazeLocation(2, 3);
		expected[5] = new MazeLocation(2, 4);
		expected[6] = new MazeLocation(3, 4);
	
		MazeLocationList solution = maze.solve();
		
		if (solution == null) {
			pass = false;
		} else if (solution.isEmpty() == true) {
			pass = false;
		} else {
			for (int i = 0; i < solution.getLength(); i++) {
				MazeLocation location = solution.retrieve(i);
				if (location.equals(expected[i]) == false) {
					pass = false;
					break;
				}//end if
			}//end for
		}//end if else statement
		
		if (pass) {
			System.out.println("test2: PASSED!");
		} else {
			System.out.println("test2: FAILED.");
		}//end if declaring System print statements
		
	}//end test2
	
	
	private static void test3() {
		boolean pass = true;
		
		String testMaze3[] = {"*** ****",
							  "*    ***",
							  "**** ***",
							  "*     **",
							  "***** **"};
	
		Maze maze = new Maze(testMaze3, 0, 3, 4, 5);
	
		MazeLocation expected[] = new MazeLocation[7];
		expected[0] = new MazeLocation(0, 3);
		expected[1] = new MazeLocation(1, 3);
		expected[2] = new MazeLocation(1, 4);
		expected[3] = new MazeLocation(2, 4);
		expected[4] = new MazeLocation(3, 4);
		expected[5] = new MazeLocation(3, 5);
		expected[6] = new MazeLocation(4, 5);
	
		MazeLocationList solution = maze.solve();
		
		if (solution == null) {
			pass = false;
		} else if (solution.isEmpty() == true) {
			pass = false;
		} else {
			for (int i = 0; i < solution.getLength(); i++) {
				MazeLocation location = solution.retrieve(i);
				if (location.equals(expected[i]) == false) {
					pass = false;
					break;
				}//end if
			}//end for
		}//end if else statement
		
		if (pass) {
			System.out.println("test3: PASSED!");
		} else {
			System.out.println("test3: FAILED.");
		}//end if declaring System print statements
		
	}//end test3


	private static void test4() {
		boolean pass = true;
		
		String testMaze4[] = {"** ***",
							  "*   **",
							  "* *  *",
							  "**** *"};
	
		Maze maze = new Maze(testMaze4, 0, 2, 3, 4);
	
		MazeLocation expected[] = new MazeLocation[6];
		expected[0] = new MazeLocation(0, 2);
		expected[1] = new MazeLocation(1, 2);
		expected[2] = new MazeLocation(1, 3);
		expected[3] = new MazeLocation(2, 3);
		expected[4] = new MazeLocation(2, 4);
		expected[5] = new MazeLocation(3, 4);
	
		MazeLocationList solution = maze.solve();
		
		if (solution == null) {
			pass = false;
		} else if (solution.isEmpty() == true) {
			pass = false;
		} else {
			for (int i = 0; i < solution.getLength(); i++) {
				MazeLocation location = solution.retrieve(i);
				if (location.equals(expected[i]) == false) {
					pass = false;
					break;
				}//end if
			}//end for
		}//end if else statement
		
		if (pass) {
			System.out.println("test4: PASSED!");
		} else {
			System.out.println("test4: FAILED.");
		}//end if declaring System print statements
		
	}//end test4	
	
	
	private static void test5() {
		boolean pass = true;
		
		String testMaze5[] = {"*** ****",
							  "*     **",
							  "* * *  *",
							  "***** **",};
	
		Maze maze = new Maze(testMaze5, 0, 3, 3, 5);
	
		MazeLocation expected[] = new MazeLocation[6];
		expected[0] = new MazeLocation(0, 3);
		expected[1] = new MazeLocation(1, 3);
		expected[2] = new MazeLocation(1, 4);
		expected[3] = new MazeLocation(1, 5);
		expected[4] = new MazeLocation(2, 5);
		expected[5] = new MazeLocation(3, 5);
	
		MazeLocationList solution = maze.solve();
		
		if (solution == null) {
			pass = false;
		} else if (solution.isEmpty() == true) {
			pass = false;
		} else {
			for (int i = 0; i < solution.getLength(); i++) {
				MazeLocation location = solution.retrieve(i);
				if (location.equals(expected[i]) == false) {
					pass = false;
					break;
				}//end if
			}//end for
		}//end if else statement
		
		if (pass) {
			System.out.println("test5: PASSED!");
		} else {
			System.out.println("test5: FAILED.");
		}//end if declaring System print statements
		
	}//end test5
	
	
	private static void test6() {
		boolean pass = true;
		
		String testMaze6[] = {"* ******",
							  "*    ***",
							  "* ** ***",
							  "****   *",
							  "****** *"};
	
		Maze maze = new Maze(testMaze6, 0, 1, 4, 6);
	
		MazeLocation expected[] = new MazeLocation[10];
		expected[0] = new MazeLocation(0, 1);
		expected[1] = new MazeLocation(1, 1);
		expected[2] = new MazeLocation(1, 2);
		expected[3] = new MazeLocation(1, 3);
		expected[4] = new MazeLocation(1, 4);
		expected[5] = new MazeLocation(2, 4);
		expected[6] = new MazeLocation(3, 4);
		expected[7] = new MazeLocation(3, 5);
		expected[8] = new MazeLocation(3, 6);
		expected[9] = new MazeLocation(4, 6);
	
		MazeLocationList solution = maze.solve();
		
		if (solution == null) {
			pass = false;
		} else if (solution.isEmpty() == true) {
			pass = false;
		} else {
			for (int i = 0; i < solution.getLength(); i++) {
				MazeLocation location = solution.retrieve(i);
				if (location.equals(expected[i]) == false) {
					pass = false;
					break;
				}//end if
			}//end for
		}//end if else statement
		
		if (pass) {
			System.out.println("test6: PASSED!");
		} else {
			System.out.println("test6: FAILED.");
		}//end if declaring System print statements
		
	}//end test6
	
	
	private static void test7() {
		boolean pass = true;
		
		String testMaze7[] = {"** ****",
							  "** ****",
							  "** ****",
							  "** ****",
							  "** ****"};
	
		Maze maze = new Maze(testMaze7, 0, 2, 4, 2);
	
		MazeLocation expected[] = new MazeLocation[5];
		expected[0] = new MazeLocation(0, 2);
		expected[1] = new MazeLocation(1, 2);
		expected[2] = new MazeLocation(2, 2);
		expected[3] = new MazeLocation(3, 2);
		expected[4] = new MazeLocation(4, 2);
	
		MazeLocationList solution = maze.solve();
		
		if (solution == null) {
			pass = false;
		} else if (solution.isEmpty() == true) {
			pass = false;
		} else {
			for (int i = 0; i < solution.getLength(); i++) {
				MazeLocation location = solution.retrieve(i);
				if (location.equals(expected[i]) == false) {
					pass = false;
					break;
				}//end if else
			}//end for
		}//end if else statement
		
		if (pass) {
			System.out.println("test7: PASSED!");
		} else {
			System.out.println("test7: FAILED.");
		}//end if declaring System print statements
		
	}//end test7
	
 }//end MazeTester