import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessengerServiceImpl extends UnicastRemoteObject implements MessengerService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected MessengerServiceImpl() throws RemoteException {
		super();
	}

	public void sendMessage(String clientMessage) {
		System.out.println("Exmple RMI Program");
	}



}
