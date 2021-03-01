import java.util.ArrayList;



public class NavigationID {

	    private int id; //cityID
	    char[][] boardA;
	    int[] coordinates;
	    int numQueens;
	   int size = 0;
	   public NavigationID(int[] resultIn) {
	        coordinates = resultIn;
	        size = coordinates.length;
	        boardA = new char[size][size];
	        numQueens = 0;

	        fillBoard();
	        placeQueensB();
	  
	    }

	    public NavigationID(ArrayList<Integer> resultIn) {
	        coordinates = new int[resultIn.size()];
	        size = coordinates.length;

	        for (int i = 0; i < size; i++) {
	            coordinates[i] = resultIn.get(i);
	        }

	        boardA = new char[size][size];
	        numQueens = 0;

	        fillBoard();
	        placeQueens();
	        printBoard();
	        System.out.println("---------- \n");
	    }
	    /**
	     * Initializes the board with x's in each spot where a Queen is not placed
	     * (for better visibility)
	    *
	     */
	    private void fillBoard() {
	        for (int i = 0; i < boardA.length; i++) {
	            for (int j = 0; j < boardA.length; j++) {
	                boardA[i][j] = 'x';
	               
	            }
	        }
	    }

	    /**
	     * Uses provided coordinates to place a queen on that spot in the board
	    *
	     */
	    private void placeQueens() {
	        for (int i = 0; i < boardA.length; i++) {
	            boardA[i][coordinates[i]] = 'Q';
	            printBoard();  
	            System.out.println("---------- \n");
	        }
	    }
	    private void placeQueensB() {
	        for (int i = 0; i < boardA.length; i++) {
	            boardA[i][coordinates[i]] = 'Q';
	        
	        }
	    }
	    /**
	     * Allows for the board to be printed
	    *
	     */
	    public void printBoard() {
	        for (int i = 0; i < boardA.length; i++) {
	            for (int j = 0; j < boardA.length; j++) {
	                System.out.print(boardA[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public int getId() {
	        return id;
	    }

	    public NavigationID(int id) {
	        super();
	        this.id = id;
	    }

	

		@Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (!(obj instanceof NavigationID))
	            return false;
	        NavigationID other = (NavigationID) obj;
	        return this.id == other.id;
	    }

	    @Override
	    public String toString() {
	        return "" + id;
	    }
	}

