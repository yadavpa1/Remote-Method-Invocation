
import java.io.File;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote{
    public int[][] addMatrix(int[][] mat1, int[][] mat2) throws RemoteException; 
    public File getFile(String filename) throws RemoteException;
}
