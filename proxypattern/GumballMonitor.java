
package proxypattern;


public class GumballMonitor {
    
    private GumBallMachine gumBallMachine;

    public GumballMonitor(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    
    public void report(){
        System.out.println("Gumball machime location: " + gumBallMachine.getLocation());
        System.out.println("Gumball machine store " + gumBallMachine.getCountGumBalls() + " gumballs");
        System.out.println("Gumball machine state is: <" + gumBallMachine.getState() + ">");
    }

}
