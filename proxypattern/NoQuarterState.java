

package proxypattern;


public class NoQuarterState implements State{
    
    private GumBallMachine gumBallMachine;

    public NoQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
        
    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumBallMachine.setState(gumBallMachine.getHasQuarterState());
    }

    @Override
    public void turnCranck() {
        System.out.println("You turned cranck, but there is no quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There is no quarter");
    }

    @Override
    public void releseBall() {
        System.out.println("You haven`t payed yet.");
    }
    public String toString(){
        return "Waiting for coin.";
    }
} 
