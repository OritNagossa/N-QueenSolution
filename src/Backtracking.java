

import java.util.Scanner;


public class Backtracking extends SearchParent {
	 
		// TODO Auto-generated constructor stub
	


	 public Backtracking(int queens) {
	    	
	        super(queens);
	    }

	    @Override
	    public void execute() {
	        search();
	    }

	

	    public void search() 
	    {
	    	 Scanner scanner = new Scanner(System.in);
	         System.out.print("Blind or Informed search (b or i):  ");
	         String searchType = scanner.nextLine();
	         
            N = super.probSize;
            System.out.print("Empty board:\n");
	        //calling the function
            switch (searchType) {
            case "i":{
            	
	        nQueenI(N);
	        break;
            }
            case "b":
            {
            	BPrint();
            	System.out.print("\nFinal solotion:\n");
	        	nQueenB(N);
	        	BPrint();
	        }
            }
	        System.out.print( counter +" Steps with Backtracking");
	    
    }



}
