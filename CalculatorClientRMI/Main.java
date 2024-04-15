/**
 * @author Lerynnx (Github)
 * @version 1.0
 * @date 2024/04/15
 * Do not modify or use this code without the permission of the author.
 */
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws RemoteException, NotBoundException {
		// Locate the registry 
        Registry registry = LocateRegistry.getRegistry();
        
        // Look up the remote object in the registry and obtain its stub object
        IOperations operationsRemote = (IOperations) registry.lookup("Operations");
        
        //Demo
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(12.3);
        numbers.add(2.0);
        numbers.add(-4.3);
        numbers.add(5.0);
        numbers.add(2.3);
        
        System.out.println(operationsRemote.addition(numbers));
        System.out.println(operationsRemote.subtraction(numbers));
	}
}
