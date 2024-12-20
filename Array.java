/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author Aya Gamal
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //program to declare and initialize a single demential array with five integres
        int array[]={1,2,3,4,5};
        int sum=0;
 //how to you find the length of array        
        System.out.println("length of array is ="+array.length);
        //programe to traverse a single demitional array using afor loop aind print
        for(int i=0;i<array.length;i++)
        {
          System.out.println("the element of array is ["+i+"]="+array[i]);
        }
        //program to print the first and last elements in array
        System.out.println("the first of element in array is ="+array[0]);
        System.out.println("length of array is ="+array[array.length-1]);
 //the defualt value of elements in an uninitialized int arra
        int array1[]=new int[5];
        for(int i=0;i<array1.length;i++)
        {
          System.out.println("the element of array is ["+i+"]="+array1[i]);
        }
        //programe to calclate the sum of elements in array
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
 //initialize it with a3x3 matrix print all its elements
         System.out.println("the sum of elements in array is ="+sum);
         int matrix[][]={{1,2,3},
                         {4,5,6},
                         {7,8,9}};
         for(int i=0;i<matrix.length;i++)
         {
             for(int j=0;j<matrix.length;j++)
             {
              System.out.println("the elments of matrix is ["+i+"]["+j+"]="+matrix[i][j]);  
             }
         }
         //programeto fund maximum element in array 
      int []numbers={10,20,30,40,50};
      int max=numbers[0];
      for(int i=0;i<numbers.length;i++)
      {
          if(numbers[i]>max)
          {
            max= numbers[i];
          }
      }
      //how do you reverse the lements in array
      System.out.println("the maximun number in array is="+max);
      for(int i=numbers.length-1;i<=0;i--)
      {
         System.out.println("the elements of array is["+i+"]="+numbers[i]);
      }
         
        
    }
        
        
    }
    

