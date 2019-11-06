

package proxypattern;



public class HasQuarterState implements State{
    
    private GumBallMachine gumBallMachine;

    public HasQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
        
    @Override
    public void insertQuarter() {
        System.out.println("There is a coin in slot. You cannot insert quarter.");
    }

    @Override
    public void turnCranck() {
        System.out.println("Your quarter is accepted.");
        if(gumBallMachine.getWinnerCountBalls() == 2){
            gumBallMachine.setState(gumBallMachine.getWinnerState());            
        }
        else
            gumBallMachine.setState(gumBallMachine.getSoldState());
         
         
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Take your quarter back.");
        gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    }

    @Override
    public void releseBall() {        
        System.out.println("No ball despenced");
    }
    
    public String toString(){
        return "Has a quarter. In process of selling.";
    }
} 
