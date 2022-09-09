//import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //set up Scanner
        System.out.println("input a string: "); //ask for input

        String letters = reader.nextLine(); //convert input from Scanner to string
        System.out.println("You entered "+letters); //print input

        char [] resultArray = letters.toCharArray(); //convert input to character array
        System.out.println("As a CharArray: ");
        for (int i = 0; i != resultArray.length; i++){  //use a for loop to print character array
                                                        //
            System.out.print(resultArray[i]+" ");       //
        }

        System.out.println(" ");                        // print a blank line to break up results

        System.out.println("As a reverse CharArray: ");

        for (int i = resultArray.length-1; i >= 0; i--){    //use a for loop to print character
                                                            // array in reverse


            System.out.print(resultArray[i]+" ");
        }
        System.out.println(" ");
        System.out.println(letters);
    }
}
