/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count_digits;

/**
 *
 * @author Aya Gamal
 */
import java.util.Scanner;
public class Count_digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        //input
        System.out.println("please enter the value of number");
        int num=scanner.nextInt();
        int count=0;
        while(num!=0)
        {
            num /=10;
            count++;
        }
        System.out.println("the number has"+count+" digits");
        
    }
   
}
