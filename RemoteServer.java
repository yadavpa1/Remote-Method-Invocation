
import java.io.File;
import java.rmi.*; 
import java.rmi.server.UnicastRemoteObject;

public class RemoteServer extends UnicastRemoteObject implements RemoteInterface 
{ 
    public RemoteServer() throws RemoteException 
    { 
        super(); 
    }
    public int[][] addMatrix(int[][] mat1, int[][] mat2) throws RemoteException {
       int[][] res = new int[mat1.length][mat1[0].length];
       for(int i=0;i<mat1.length;i++){
           for(int j=0;j<mat1[0].length;j++){
               res[i][j] = mat1[i][j] + mat2[i][j];
           }
       }
       return res;
    }
    
    public File getFile(String filename) throws RemoteException{
        File file = new File(filename);
        return file;
    }
}


