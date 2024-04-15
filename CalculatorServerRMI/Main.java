/**
 * @author Lerynnx (Github)
 * @version 1.0
 * @date 2024/04/15
 * Do not modify or use this code without the permission of the author.
 */
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Main {
	public static void main(String[] args) {
		try {
			// Create the registry
			LocateRegistry.createRegistry(1099);
			
			ImplOperations operations = new ImplOperations();
			// Bind the object to the registry
			Naming.rebind("rmi://localhost/Operations", operations);
			
			System.out.println("Server is ready.");
		} catch (Exception e) {
			System.out.println("Server failed: " + e);
		}
	}
}
