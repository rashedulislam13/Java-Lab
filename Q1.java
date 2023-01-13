
package javalabfinal;

import java.util.Scanner;


public class Q1 {
    
    public static void main(String[]args){
   int i,j;
         System.out.println(" ");
          System.out.print("Before Sorting:");
         int array[]= new int[4];
         Scanner input = new Scanner(System.in);
         for(i=0;i<array.length;i++){
             
             array[i]= input.nextInt();
         }
        int temp = 0;
        
         for(i=0; i<4;i++){
             System.out.print(array[i]+ "  ");
         }
         
         for(i=0; i<4;i++){
            for(j=i+1; j<4;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]= temp;
                }
            }
           
         }
         System.out.println();
          System.out.print("After Sorting:"+" ");
        for(i=0; i<4;i++) {
             System.out.print(array[i]+"  ");
             
         }
     }
  
             
    
}

    