/**
 * @author Lerynnx (Github)
 * @version 1.0
 * @date 2024/04/15
 * Do not modify or use this code without the permission of the author.
 */
import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;

/**
 * This class implements the IOperaciones interface and provides the implementation
 * for various mathematical operations.
 */
public class ImplOperations extends UnicastRemoteObject implements IOperations {

	/**
	 * Constructs a new ImplOperaciones object.
	 *
	 * @throws RemoteException if there is an error in the remote method invocation
	 */
	public ImplOperations() throws RemoteException {
		super();
	}

	/**
	 * Calculates the sum of the given numbers.
	 *
	 * @param numbers the list of numbers to be summed
	 * @return the sum of the numbers
	 * @throws RemoteException if there is an error in the remote method invocation
	 */
	@Override
	public double addition(ArrayList<Double> numbers) throws RemoteException {
		double total = 0;

		for (Double number : numbers) {
			total += number;
		}

		return total;
	}

	/**
	 * Calculates the difference between the given numbers.
	 *
	 * @param numbers the list of numbers to be subtracted
	 * @return the difference between the numbers
	 * @throws RemoteException if there is an error in the remote method invocation
	 */
	@Override
	public double subtraction(ArrayList<Double> numbers) throws RemoteException {
		double total = 0;
		boolean first = true;

		for (Double number : numbers) {
			if (first) {
				total = number;
				first = false;
			} else {
				total -= number;
			}
		}

		return total;
	}
}
