
import java.io.File;
import java.rmi.*; 
import java.util.Scanner;

public class Client
{ 
    public static void main(String args[]) 
    { 
        int[][] result = null;
        File file = null;
        try
        { 
            RemoteInterface  access = (RemoteInterface )Naming.lookup("rmi://localhost:2000"+"/geeksforgeeks"); 
            
            int[][] mat1= {{3,3,3},{4,4,4},{5,5,5}};
            System.out.println("Input matrix 1: ");
            for(int i=0;i< mat1.length;i++){
                for(int j=0;j< mat1[0].length; j++){
                    System.out.print(mat1[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Input matrix 2: ");
            int[][] mat2= {{2,2,2},{3,3,3},{4,4,4}};
            for(int i=0;i< mat2.length;i++){
                for(int j=0;j< mat2[0].length; j++){
                    System.out.print(mat2[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("On adding: ");
            
            
            result = access.addMatrix(mat1, mat2); 
            for(int i=0;i< result.length;i++){
                for(int j=0;j< result[0].length; j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("================================================================================");
            
            file = access.getFile("/home/poojay/NetBeansProjects/RMI/input.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine())
                System.out.println(sc.nextLine());
        } 
        catch(Exception ae) 
        { 
            System.out.println(ae); 
        } 
    } 
} 
