/** This program simulates possible paths of travel taken by a knight around a board. 
 * @author Nischaal Cooray
 * @version 1.0 5/24/2015
 */

public class KnightTour {
	
	/**
	 *This is the main method that utilizes the possibleMoves and printTour methods
	 *@param args The input arguments specifying the size of the board (rows, columns) as well as the number of attempts to be made
	 */
	public static void main(String[] args) {
	
		if (args.length > 2) {
			int rows = Integer.parseInt(args[0]);
			int columns = Integer.parseInt(args[1]);
			int attempts = Integer.parseInt(args[2]);

			for (int j = 0; j < attempts; j++) {
				int[] location = new int[2];
				location[0] = 0;
				location[1] = 0;

				int[][] board = new int[rows][columns];
				board[0][0] = 1;

				int[][] pMoves = possibleMoves(rows, columns, location, board);

				for (int i = 2; pMoves.length > 0; i++) {
					int rand = (int) (Math.random() * (pMoves.length - 1));
					board[pMoves[rand][0]][pMoves[rand][1]] = i; 
					location = pMoves[rand];
					pMoves = possibleMoves(rows, columns, location, board);
				}

				if (j == (attempts - 1))
					printTour(rows, columns, board);

			}
		} else {
			System.out.println("There must be 3 input arguments");
		}
	}


    /**
		 * This method is used to print the last tour taken by the knight
		 * @param rows The number of rows in the board
		 * @param columns The number of columns in the board
		 * @param board A 2D array that simulates a board
		 */
    public static void printTour(int rows, int columns, int[][] board) {
			
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) 
					System.out.printf("%-8d", board[i][j]);
				System.out.printf("%n");
			}					
		}

    /**
		 * Get a list of all possible moves for the knight given it's current position
		 * @param rows The number of rows in the board
		 * @param columns The number of columns in the board
		 * @param location The current location of the knight
		 * @param board A 2D array that simulates a board
		 * @return int[][] Returns a board with possible valid moves
		 */
    public static int[][] possibleMoves(int rows, int columns, int[] location, int[][] board) {

	   	// Manual computation of all possible moves
    	int[][] possible = new int[8][2];
      possible[0][0] = (location[0] + 2);
      possible[1][1] = (location[1] + 2);
      possible[2][1] = (location[1] + 2);
      possible[7][0] = (location[0] + 2);
      possible[4][0] = (location[0] + 1);
      possible[1][0] = (location[0] + 1);
      possible[0][1] = (location[1] + 1);
      possible[6][1] = (location[1] + 1);
      possible[3][0] = (location[0] - 2);
      possible[4][1] = (location[1] - 2);
      possible[6][0] = (location[0] - 2);
      possible[5][1] = (location[1] - 2);
      possible[3][1] = (location[1] - 1);
      possible[7][1] = (location[1] - 1);
      possible[5][0] = (location[0] - 1);
      possible[2][0] = (location[0] - 1);

      int arraySize = 0;

	    for (int i = 0; i < possible.length; i++) {
  	    if ((possible[i][0] < rows) && (possible[i][0] > -1) && (possible[i][1] < columns) && (possible[i][1] > -1))
					if (board[possible[i][0]][possible[i][1]] == 0)
	    	    arraySize++; 
			}

      int[][] potentialMoves = new int[arraySize][2];
      int validLoc = 0;

      for (int i = 0; i < possible.length; i++) {
      	if (possible[i][0] < rows && possible[i][0] > -1 && possible[i][1] < columns && possible[i][1] > -1 && board[possible[i][0]][possible[i][1]] == 0) {
        	potentialMoves[validLoc][0] = possible[i][0];
          potentialMoves[validLoc][1] = possible[i][1];
          validLoc++;
        }
			}

      return potentialMoves;
    }
}

