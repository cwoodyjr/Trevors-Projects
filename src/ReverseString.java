import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("input a string: ");
        char [] letters = reader.nextLine().toCharArray();
        System.out.println(letters);
        for (int i = 0; i < letters.length; ++i){
            System.out.println(letters[i]);
        }

    }
}
