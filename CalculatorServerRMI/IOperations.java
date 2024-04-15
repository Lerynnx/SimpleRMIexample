/**
 * @author Lerynnx (Github)
 * @version 1.0
 * @date 2024/04/15
 * Do not modify or use this code without the permission of the author.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * This interface defines the operations that can be performed by the server.
 */
public interface IOperations extends Remote {
    /**
     * Performs addition operation on the given list of numbers.
     * @param numbers The list of numbers to be added.
     * @return The result of the addition operation.
     * @throws RemoteException If there is a communication error.
     */
    double addition(ArrayList<Double> numbers) throws RemoteException;

    /**
     * Performs subtraction operation on the given list of numbers.
     * @param numbers The list of numbers to be subtracted.
     * @return The result of the subtraction operation.
     * @throws RemoteException If there is a communication error.
     */
    double subtraction(ArrayList<Double> numbers) throws RemoteException;
}