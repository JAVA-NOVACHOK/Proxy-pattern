
package proxypattern;


public class ProxyPattern {

    
    public static void main(String[] args) {
        
        GumBallMachine machine = new GumBallMachine("Poltava",2);
        GumballMonitor monitor = new GumballMonitor(machine);
        
        machine.insertQuater();      
        machine.turnCranck();
        
        
        monitor.report();
        
        
        

    }

}
