/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Lapitopi
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    //edw thelei 4 sunarthseis p tha kalei h main
    public static double adding (ArrayList<Double> numbers){
        double result=numbers.get(0);
        for (int i=1; i<numbers.size(); i++){
            result=result+numbers.get(i);
}
    return result;}
    public static double substraction (ArrayList<Double> numbers){
        double result=numbers.get(0);
        for (int i=1; i<numbers.size(); i++){ 
            result=result-numbers.get(i);
}
    return result;}
    public static double multiplication (ArrayList<Double> numbers){
        double result=numbers.get(0);
        for (int i=1; i<numbers.size(); i++){
            result=result*numbers.get(i);
}
    return result;}
    public static double division (ArrayList<Double> numbers){
        double result=numbers.get(0);
        
        for (int i=1; i<numbers.size(); i++){
            result=result/numbers.get(i);
        }
    return result;}
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This program is used as a calculator for addition, substraction, multiplication or division");
        System.out.println("Please enter how many numbers you want to use, your input must be a positive integer. ");
        System.out.println ("If it is not, the program will stop");
        Scanner sc=new Scanner(System.in);
        int k=0;
        k=sc.nextInt();
        while(k<=0){
            System.out.println("You put a not valid number, it must be a positive number. "
                    + "Please try again");
            k=sc.nextInt();
        }
        System.out.println("Please enter the numbers you want to use");
        ArrayList<Double> numbers=new ArrayList<Double>();
        //Scanner sc2=new Scanner(System.in);
        for(int i=0; i<k; i++){
        numbers.add(sc.nextDouble());}
        System.out.println("For addition press 1, for substraction press 2, "
                + "for multiplication press 3, for division press 4" );
        
        int m=sc.nextInt();
        while(m<1||m>4){ //(m!=1)||(m!=2)||(m!=3)||(m!=4)
            System.out.println("You didnt input a valid method of calculus, please try again");
            m=sc.nextInt();
        }
        if (m==1){
            double add=adding(numbers);// stelnei mono ton teleutaio
            System.out.println("The result of addition is: " +add);}
        else if (m==2){
            double sub=substraction(numbers);
            System.out.println("The result of substraction is: " +sub);}
        else if (m==3){
            double mult=multiplication(numbers);
            System.out.println("The result of multiplication is: " +mult);}
        else if (m==4) {
            double div=division(numbers);
            System.out.println("The result of division is: " +div);}
}
}
