/* author: Jack Farah
 * description: revers an array given by user input
 * date: 5/15/2022
 */

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the length of the Array: \r");
        int in1 = input.nextInt(); //gets user input for in1 (input1) to set the size of array
        int [] array = getIntegers(in1); //creates array by passing in1 to getIntegers method

        printArray(array);  //prints original array
        array = reverseArray(array); //reverses original array
        printArray(array);  //prints new array
    }

    // method to create array elements with user inputs
    public static int[] getIntegers(int integer) {
        int [] array = new int[integer];
        System.out.println(String.format("Enter up to %d numbers", integer));
        for(int i = 0; i < array.length; i++){
            int in2 = input.nextInt();
            array[i] = in2;
        }
        return array;
    }

    //method to print given array
    public static void printArray(int[] array) {
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\r");
    }

    //method to reverse the array 
    public static int[] reverseArray(int[] array){
        int temp =0;
        for(int i =0; i < array.length/2; i++){
            temp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;
    }

}
