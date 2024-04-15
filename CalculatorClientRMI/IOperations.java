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
 * This interface defines the operations that the server will implement.
 * It extends the Remote interface to support remote method invocation.
 * The methods in this interface can throw a RemoteException.
 */
public interface IOperations extends Remote {
    /**
     * Performs addition on a list of numbers.
     * @param numbers The list of numbers to be added.
     * @return The result of the addition.
     * @throws RemoteException If there is a problem with the remote method invocation.
     */
    double addition(ArrayList<Double> numbers) throws RemoteException;

    /**
     * Performs subtraction on a list of numbers.
     * @param numbers The list of numbers to be subtracted.
     * @return The result of the subtraction.
     * @throws RemoteException If there is a problem with the remote method invocation.
     */
    double subtraction(ArrayList<Double> numbers) throws RemoteException;
}