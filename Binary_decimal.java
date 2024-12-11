/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_decimal;

/**
 *
 * @author Aya GamaL
 */
import java.util.Scanner;
public class Binary_decimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner =new Scanner(System.in);
        System.out.println("please enter value of the number");
        int binary=scanner.nextInt();
       
        //input
        int decimal=0;
        double position=0;
        
        while(binary>0)
        {
           int currentdigit=binary%10;
            decimal +=currentdigit * Math.pow(2, position);
            position++;
            binary /=10;
        }
        System.out.println("the decimal equivalent is "+decimal);
        
    }
    
}
