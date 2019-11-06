

package proxypattern;

public class GumBallMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldOutState;
    private State soldState;
    private State winnerState;
    private String location;
    
    private State state = soldOutState;
    private int countGumBalls = 1;
    private int winnerCountBalls = 0;

    public GumBallMachine(String location,int countGumBalls) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        
        this.countGumBalls = countGumBalls;
        this.location = location;
        if(countGumBalls > 0)
            state = noQuarterState;        
    }
    
    public void setState(State state){
        this.state = state;
    }

    public void setWinnerCountBalls(int winnerCountBalls) {
        this.winnerCountBalls = winnerCountBalls;
    }
    

    public State getState() {
        return state;
    }   
    
    public String getLocation() {
        return location;
    }        
        
    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCountGumBalls() {
        return countGumBalls;
    }
    
     void dispance(){
        
        System.out.println("Ball is rolling");
        if(countGumBalls != 0){
            countGumBalls--;
            winnerCountBalls++;
        }            
    }
        
    public void insertQuater(){
        state.insertQuarter();
    }
    
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    
    public void turnCranck(){
        state.turnCranck();
        state.releseBall();
    }

    public int getWinnerCountBalls() {
        return winnerCountBalls;
    }

    public State getWinnerState() {
        return winnerState;
    }
    
    
    
} 
