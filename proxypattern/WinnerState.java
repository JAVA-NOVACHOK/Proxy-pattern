
package proxypattern;


public class WinnerState implements State{
    
    private GumBallMachine gumBallMachine;

    public WinnerState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    
    

    @Override
    public void insertQuarter() {
    }

    @Override
    public void turnCranck() {
    }

    @Override
    public void ejectQuarter() {
    }

    @Override
    public void releseBall() {
        gumBallMachine.dispance();
        if(gumBallMachine.getCountGumBalls() > 0){
             System.out.println("Please, enjoy your gum. It is rolling out.");            
        }if(gumBallMachine.getCountGumBalls() > 0){
            System.out.println("Congratulations\n-----<<<WINNER>>>---");
            System.out.println("Take another gumball for free.");
            gumBallMachine.dispance();
            gumBallMachine.setWinnerCountBalls(0);
        }
        else{
            System.out.println("Ooops, we ran out of gumballs");
            gumBallMachine.setState(gumBallMachine.getSoldOutState());            
        }
        gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    }

}
