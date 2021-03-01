

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



/**
 * this class is the parent of all searches you want to define with this interface
 * you can use all searches in both tree or graph implementation by determining isGraph parameter
 *
 * @author Ali ArjomandBigdeli
 * @since 12.27.2018
 */
public abstract class SearchParent {
  //problem 
	protected ProblemsParent problem;

//A star 
    protected  int probSize;       // problem size (NxN)
    protected int numConfigs = 0; // number of tested board configurations
    protected int[] product1;
    protected boolean bSolnFound = false;
    protected int solnCount = 0;
    
    protected static int queens;

    protected ArrayList<Integer> product2;
    protected boolean iSolnFound = false;

    

    // hScore keeps track of each psuedo-random array's hueristic score and
    // allows for the minimum value to be obtained
    protected LinkedList<Integer> hScore;
    protected LinkedList<ArrayList> bConfig;
    protected int testAttempts = 0;
    
//Backtracking
    //chessboard
    protected static int[][] board = new int[100][100];
    protected static int N;
    
    
    
    
    
//Greedy
	


    public void setProblem(ProblemsParent problem) {
        this.problem = problem;
    }

    public ProblemsParent getProblem() {
        return problem;
    }


    
    public SearchParent(int queens) {
        probSize = queens;
       
    }

    public int getprobSize() {
        return probSize;
    }

   

    abstract public void execute();

    public void search() {
    }
        
  
        protected static int counter = 0;
        
        //Backtracking
      //printing the matix
        public static void BPrint(){
        	int i,j;
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
                System.out.print(board[i][j]+"\t");
            System.out.print("\n\n");
            
        }
}
    public static boolean nQueenI(int n)
	    {
	        BPrint();
	        int i,j;
	        //if n is 0, solution found
	        if(n==0)
	            return true;
	        for(i=0;i<N;i++)
	        {
	            for(j=0;j<N;j++)
	            {
	                //checking if we can place a queen here or not
	                //queen will not be placed if the place is being attacked
	                //or already occupied
	                if((!isAttack(i,j)) && (board[i][j]!=1))
	                {
	                    board[i][j] = 1;
	                    //recursion
	                    //wether we can put the next queen with this arrangment or not
	                    System.out.print("--------------------\n");
	                    if(nQueenI(n-1)==true)
	                    	
	                    {
	                      
	                      return true;
	                    }
	                    board[i][j] = 0;
	                counter++;}
	            }
	        }
	        return false;
	    }
    public static boolean nQueenB(int n)
    {counter++;
        int i,j;
        //if n is 0, solution found
        if(n==0)
            return true;
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                //checking if we can place a queen here or not
                //queen will not be placed if the place is being attacked
                //or already occupied
                if((!isAttack(i,j)) && (board[i][j]!=1))
                {
                    board[i][j] = 1;
                    //recursion
                    //wether we can put the next queen with this arrangment or not
                    
                    if(nQueenB(n-1)==true)
                    	
                    {
                      
                      return true;
                    }
                    board[i][j] = 0;
                }
            }
        }
        return false;
    }
    //function to check if the cell is attacked or not
    public static boolean isAttack(int i,int j)
    {
        int k,l;
        
        //checking if there is a queen in row or column
        for(k=0;k<N;k++)
        {
            if((board[i][k] == 1) || (board[k][j] == 1))
                return true;
        }
        //checking for diagonals
        for(k=0;k<N;k++)
        {
            for(l=0;l<N;l++)
            {
                if(((k+l) == (i+j)) || ((k-l) == (i-j)))
                {
                    if(board[k][l] == 1)
                        return true;
                }
            }
        }
        return false;
    }
    
    
    
    
    

    //a star 

   
}
