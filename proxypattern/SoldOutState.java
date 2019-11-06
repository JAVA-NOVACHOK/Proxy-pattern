

package proxypattern;



public class SoldOutState implements State{
    
    private GumBallMachine gumBallMachine;

    public SoldOutState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("There are no gumballs. Take your coin back.");
    }

    @Override
    public void turnCranck() {
        System.out.println("There are no gumballs. No reason to turn cranck.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There are no gumballs.");
    }

    @Override
    public void releseBall() {
        System.out.println("There are no gumballs.");
    }
    
    public String toString(){
        return "Waiting for refilling. Have sold out all the gumbals.";
    }
    
} 
