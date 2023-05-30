
package javapointeg;
import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject implements Adder {
    AdderRemote()throws RemoteException{
        super();
    }
    public int add(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
