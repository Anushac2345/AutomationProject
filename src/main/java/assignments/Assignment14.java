package assignments;

public class Assignment14 {

	public static void main(String[] args) {
            int x=5;
            
            //creating for loop for number of rows to print
            for(int i=1; i<=x;i++) { 
            //creating loop for number of spaces to print
            	for(int j=i;j<=x-1;j++) {
            System.out.print(" ");
            
            	}
            // creating loop numbers to print
            	for(int k=1;k<=i;k++) {
            	System.out.print(k +" ");	
            	}
            	System.out.println();
            }
     //same in descending order
            // for no.of rows to print
            //for(int i=x-1;i>=1;i--) {
            // for no.of spaces to print
            	//for(int j=i;j<x;j++) {
                  //  System.out.print(" ");
            	//}
            // for numbers to print
            	//for(int k=1;k<=i;k++) {
                //	System.out.print(k +" ");	
            	//}
            int y=x-1;
            for(int i=1;i<=x-1;i++)
            {    
            	for(int j=1;j<=i;j++)
            	{
            		System.out.print(" ");
            	}
            	for(int k=1;k<=y;k++)
            	{
            		System.out.print(k+ " ");
            	}
            	y--;
            	System.out.println();
            }
                	
            }
	}


