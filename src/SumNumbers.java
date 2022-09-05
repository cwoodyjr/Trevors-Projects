import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number to some to: ");
        int sumTotal = 0;
        int sumTo = reader.nextInt();
        System.out.println(sumTo);
        while (sumTotal < sumTo){

            sumTotal = sumTotal+1;

        }System.out.print(sumTotal);
    }
}
