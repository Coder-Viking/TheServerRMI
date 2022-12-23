import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Locale;
import java.util.ResourceBundle;

import rmi.MessengerServiceImpl;

public class Server extends MessengerServiceImpl {
	public Server() throws RemoteException {
	}

	public static void main(String args[]) throws RemoteException, AlreadyBoundException {
		ResourceBundle serverProperties = ResourceBundle.getBundle("Entry.serverConfig", Locale.GERMANY);
		int serverPort = Integer.valueOf(serverProperties.getString("port"));
		String lookupName = serverProperties.getString("lookup_name");

		MessengerServiceImpl messengerServiceImpl = new MessengerServiceImpl();
		Registry registry = LocateRegistry.createRegistry(serverPort);
		registry.bind(lookupName, messengerServiceImpl);
	}
}