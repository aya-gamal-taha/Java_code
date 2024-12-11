/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even;

/**
 *
 * @author Aya Gamal
 */
import java.util.Scanner;

public class Even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner=new Scanner(System.in);
        //input
        System.out.println("please enter the value of number");
        int n=scanner.nextInt();
        int sum=0;
        int i=1;
        
        while(i<=n)
        {
           if(i%2==0)
           {
               sum +=i;
           }
           i++;
        }
        System.out.println("the result of sum "+n+"is "+sum);
        
    }
    
}
