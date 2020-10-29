/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
// it calculates the factorial of every number , not only 10
import java.util.Scanner;
/**
 *
 * @author Lapitopi
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int n) {
        
       if ((n-1)!=0){ 
          int result=n*factorial(n-1); 
          return result;
    }
       else {
           return 1;
       }
    }
   
   
    public static void main(String[] args) {
      
        System.out.println("Please insert a positive integer to calculate its factorial");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      
        while((n<0)||(n>=0)){ // While is used for the senario that the user inserts a negative number  
        if (n==0) {//the factorial of 0 is 1 and it is not included in the recursion method
            System.out.println("The factional of " +n + " " + "is: 1" );
            break;
        }
        else if (n<0){
            System.out.println("You put a negative number, please try again");
                 n=sc.nextInt();}
        else {
        int fact=factorial(n);
        System.out.println("The factorial of " +n +" " + "is: " +fact);
        break;
        }
       }
        sc.close();
    }
    
}
