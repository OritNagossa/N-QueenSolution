
import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class NavigationProblem extends ProblemsParent {
    private int[][] map;
    private int queens;

    public NavigationProblem() {
        initializeProblem();
    }


    public boolean goalTest(State state) {
        return goalState.equals(state);
    }

    @Override
    public ArrayList<Integer> actions(State state) {
		return null;
        
    }

    @Override
    public State nextState(State state, int action) {
		return state;
       
    }

    @Override
    public int stepCost(State firstState, int action, State secondState) {
        return stepCost(firstState, secondState);
    }

    public int stepCost(State firstState, State secondState) {
		return queens;
     
    }

 //  public int stepCost(int firstState, int secondState) {
   //     return stepCost(new NavState(firstState), new NavState(secondState));
  //  }

    @Override
    public int pathCost(List<Integer> path) {
        int cost = 0;
   
        return cost;
    }

    //@Override
    /**public int h(State state) {
        return straightLineDistance[((NavState) state).getId()];}
  */ 

    private void initializeProblem() {
        
  
        map = new int[100][100];
    }




}