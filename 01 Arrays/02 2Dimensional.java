// package practice;
import java.util.*;

public class twoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the rows and colums");
         int rows=s.nextInt();
         int columns=s.nextInt();
         int a[][] =new int[rows][columns];
         int b[][] =new int[rows][columns];
         
         int c[][] =new int[rows][columns];
          int d[][] =new int[rows][columns];
         
          System.out.println("Enter A");
         //Reading 'A'
         for(int i=0;i<rows;i++)
         {
             for(int j=0;j<columns;j++)
             {
                 a[i][j]=s.nextInt();
             }
         }
         
         System.out.println("Enter B");
         // Reading 'B'
           for(int i=0;i<rows;i++)
         {
             for(int j=0;j<columns;j++)
             {
                 b[i][j]=s.nextInt();
             }
         }
         
           System.out.println("printing A+B");
         // Adding 'A+B'
           for(int i=0;i<rows;i++)
         {
             for(int j=0;j<columns;j++)
             {
                 c[i][j]=a[i][j] + b[i][j];
                 System.out.println(c[i][j]);
             }
         }
          
           System.out.println("printing multiplication");
         //Multiplying 'A*B'
           for(int i=0;i<rows;i++)
         {
             for(int j=0;j<columns;j++)
             {
                 d[i][j]=a[i][j] * b[i][j];
                 System.out.println(d[i][j]);
             }
         }
	}

}
