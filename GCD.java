/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author Aya Gamal
 */
import java.util.Scanner;
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner=new Scanner(System.in);
        //input
        System.out.println("please enter the value of number1");
        int num1=scanner.nextInt();
        System.out.println("please enter the value of number2");
        int num2=scanner.nextInt();
        
        while(num2!=0)
        {
           int temp=num1%num2;
            num1=num2;
            num2=temp;
        }
        System.out.println("the GCD of the numbers is "+num2+" digits");
        
    }
    
}
