/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalabfinal;

/**
 *
 * @author DELL
 */
public class JavaCodeForDescendingOrder {
    
    
    
    
     public static void main(String[]args){
   
         System.out.println(" ");
          System.out.print("Before Sorting:");
         int array[]= {1,2,3,4};
        int temp = 0;
        int i,j;
         for(i=0; i<4;i++){
             System.out.print(array[i]+ "  ");
         }
         
         for(i=0; i<4;i++){
            for(j=i+1; j<4;j++){
                if(array[i]<array[j]){
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

    

