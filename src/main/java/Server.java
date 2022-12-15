import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server extends MessengerServiceImpl {
	public Server() throws RemoteException {
	}

	public static void main(String args[]) throws RemoteException, AlreadyBoundException {
		MessengerServiceImpl messengerServiceImpl = new MessengerServiceImpl();
		Registry registry = LocateRegistry.createRegistry(5555);
		registry.bind("RMI_EXAMPLE", messengerServiceImpl);
	}
}