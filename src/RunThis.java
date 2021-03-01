import java.util.Scanner;


/**
 * this class is used to solve a problem with one of the search algorithms
 *
 */
public class RunThis {
	
    public static void main(String[] args) {
        ProblemsParent problem = new NavigationProblem();
        SearchParent search=null;
        
        System.out.println("N - Queen's problem\n ");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please indicate problem size (Number of Queens): ");
        int probSize = scanner.nextInt();
        
        System.out.print("please choose your search algorithm: ");
        System.out.println("\n1. Backtracking \n2. A star\n3. Greedy best first search\n");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                search = new Backtracking(probSize);
                break;
            case 2:
                search = new AStar(probSize);
                break;
            case 3:
                search = new Greedy(probSize);
                break;
           
            default:
            	System.out.print("ERROR");
                break;
        }
        search.setProblem(problem);
        search.execute();
        
    

    }
}