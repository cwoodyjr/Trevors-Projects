import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        int sumTotal = 0;
        int i = 1;
        int sumTo = reader.nextInt();
        while (i <= sumTo){

            sumTotal = sumTotal+i;
            System.out.println(sumTotal);
            i++;



        }
        System.out.println("the sum of "+sumTo+" is... " +sumTotal);
    }
}
