
public abstract class State {
    protected State parent;
    protected int act;  //action that caused to reach this state
  
  


    public State() {
        parent = null;
        act = -1;
        
       
    }

    public int getAct() {
        return act;
    }
}