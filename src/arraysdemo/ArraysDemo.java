/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysdemo;

import java.util.Scanner;

/**
 *
 * @author shirishshahi
 */
public class ArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.print("Enter a word");
       Scanner input = new Scanner(System.in);
       
       String myWord = input.nextLine();
       
       char[] myLetters = new char[myWord.length()];
       
       for(int i =0; i < myLetters.length; i++){
           myLetters[i]=myWord.charAt(i);
           System.out.print(myLetters[i]);
       }// end of for
       System.out.println();
        System.out.println("Printing in reverse");
       
        for(int i = myLetters.length-1; i >= 0; i--){
           System.out.print(myLetters[i]);
       }// end of for
    }//end of main
    
}
