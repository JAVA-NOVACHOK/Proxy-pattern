

package proxypattern;

public class SoldState implements State{
    
    private GumBallMachine gumBallMachine;

    public SoldState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("You are going to get your gumball soon.");
    }

    @Override
    public void turnCranck() {
        System.out.println("Turning the cranck twice does not give you to gums");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Your quarter is already spent.");
    }

    @Override
    public void releseBall() {
        gumBallMachine.dispance();
        if(gumBallMachine.getCountGumBalls() > 0){
             System.out.println("Please, enjoy your gum. It is rolling out.");
            gumBallMachine.setState(gumBallMachine.getNoQuarterState());
        }
        else{
            System.out.println("Ooops, we ran out of gumballs");
            gumBallMachine.setState(gumBallMachine.getSoldOutState());            
        }
    }
    public String toString(){
        return "Selling a bumball.";
    }
} 
