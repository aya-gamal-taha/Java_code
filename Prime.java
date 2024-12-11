/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.Scanner;

/**
 *
 * @author Aya Gamal
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner=new Scanner(System.in);
        //input
        System.out.println("please enter the value of number");
        int num=scanner.nextInt();
        if(num<2)
        {
            System.out.println(num+"is not prime");
        }
        else
        {
            int i=2;
            boolean isprime= true;
            
             while(i<num)
        {
            if(num%i==0)
            {
                isprime=false;
                break;
        }
            i++;
    }
             if(isprime)
             {
                  System.out.println(num+" is prime");
        
             }
             else
             {
                System.out.println(num+" is not prime");
        }  
        }
       
    
}
