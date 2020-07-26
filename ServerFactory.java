
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class ServerFactory {
    public static void main(String[] args) throws RemoteException {
        try{
            //System.setProperty("java.rmi.server.hostname", "192.168.43.26");
            LocateRegistry.createRegistry(2000); //rmi registry within server jvm with port 2000
            Naming.rebind("rmi://localhost:2000"+"/geeksforgeeks", new RemoteServer());//binds the remote object with name gfg
            System.out.println("Server is ready");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
