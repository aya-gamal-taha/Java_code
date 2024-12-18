/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codes;

/**
 *
 * @author Aya Gamal
 */
//import java.util.Scanner;
public class Codes {

    /**
     * @param args the command line arguments
     */
    static void print()
    {
        for (int i=1;i<=10;i++)
       {
           System.out.println(i);
       }
    }
    static void printeven()
    {
        for(int i=0;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
     static void printodd()
    {
        for(int i=0;i<=10;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
        static void sumnum()
    {
        int sum=0;
        for(int i=0;i<=10;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
       static void table2()
    {
        int res=0;
        for(int i=0;i<=10;i++)
        {
            res=i*2;
             System.out.println("res = 2x"+i);
        }
       
    }
          static void thelargest(int num1,int num2)
    {
        
       if(num1>num2)
       {
          System.out.println("the largest number is"+num1);  
       }
       else
       {
            System.out.println("the largest number is"+num2);  
       
       }
    }
           static void checkvunber(int num)
           {
               if(num>0)
               {
                 System.out.println("the number is positive");    
               }
               else if(num<0)
               {
                 System.out.println("the  number is negative");    
               }
               else
               {
                 
                 System.out.println("the  number is zero");    
               
               }
           }
      
       static void fibonacci()
       {
         int num1=0,num2=1,sum=0,nextnumber;
         for(int i=0;i<5;i++)
         {
             sum +=num1;
             nextnumber=num1+num2;
             num1=num2;
             num2=nextnumber;
         }
          System.out.println(sum);  
       }
       static void triangle(int num)
       {
           for(int i=1;i<=num;i++)
           {
               for(int j=1;j<=2*i-1;j++)
               {
                  System.out.println("*");   
               }
               System.out.println(" ");  
           }
           System.out.println();  
       }
       static void countdigit(int num)
       {
          int count=0;
          do
          {
              count ++;
              num/=10;
              
          }while(num>0);
            System.out.println("number of digits is"+count);  
       }
     static void divisable()
     {
         for(int i=0;i<=50;i++)
         {
             if(i%3==0&&i%5==0)
             {
                System.out.println(i); 
             }
         }
     }
     static void factioral(int num)
     {
         int fact=0;
         for(int i=0;i<num;i++)
         {
            fact*=i; 
         }
          System.out.println(fact); 
     }
     static void prime(int num)
     {
         if(num<0)
         {
             System.out.println("invaild number");
         }
         for(int i=2;i<num/2;i++)
         {
             if(num%i==0)
             {
                System.out.println("not prime"); 
             }
             System.out.println("prime");
         }
     }
      static void reversenumber(int num)
      {
        int reversed=0;
        while(num !=0)
        {
            int digit=num%10;
            reversed=reversed *10 +digit;
            num /=10;
        }
          System.out.println(reversed); 
      }
      static void paildrome(int num)
      {
          int original=num;
          int reversed=0;
        while(num !=0)
        {
            int digit=num%10;
            reversed=reversed *10 +digit;
            num /=10;
        }
        if(original==reversed)
        {
          System.out.println("this number is palindrome");   
        }
        else
        {
             System.out.println("this number is not palindrome");   
        }
          
      }
      static void sumofdigit(int num)
      {
         if(num==0) 
         {
             System.out.println("invaild");
         }
         int count=0;
         while(num!=0)
         {
             num /=10;
             count++;
         }
          System.out.println(count);
      }
      static void Armstrong(int num)
      {
          int original=num;
          int sum=0;
          int digits=sumofdigit(3);
          
          while(num!=0)
          {
              int digit=num%10;
              sum+=Math.pow(digit, digits);
              num/=10;
              sum=original;
          }
           System.out.println("this number is armstrong");
      }
    public static void main(String[] args) {
      
      //  print();
      // printeven();
      // printodd();
      // sumnum();  
      // table2();  
      // thelargest;  
      // checkvunber; 
      //  fibonacci();
      //   triangle(5);
       // countdigit(552);
       //divisable();
       //factioral(5);
       //prime(7);
       // reversenumber(153);
       //paildrome(12321);
       //sumofdigit(552);
       //Armstrong(553);
    }
    
}
