import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("lets enter a couple of numbers:");
        System.out.print("Enter the first number: ");
        double inputtedNum1 = reader.nextDouble();
        System.out.print("Enter the second number: ");
        double inputtedNum2 = reader.nextDouble();
        double c;
        System.out.print("And a final number: ");
        double inputtedNum3 = reader.nextDouble();
        System.out.println(" ");

        System.out.println("you entered "+inputtedNum1+", "+inputtedNum2+" & "+inputtedNum3);
        c = minMax(inputtedNum1,inputtedNum2,inputtedNum3);
        System.out.print("The Max number is: ");
        display(c);
        System.out.println(" ");
        c = maxMin(inputtedNum1,inputtedNum2,inputtedNum3);
        System.out.print("The Min number is: ");
        display(c);
    }
    public static double minMax(double a, double b, double d){
        double maxNumber = 0;

        if (a>b){
            if (a>d){
                maxNumber = a;
            }else{
                maxNumber = d;
            }

        } else if (b>a) {
            if (b>d){
                maxNumber=b;
            } else{
                maxNumber=d;
            }
        } else if (d>a) {
            if (d>b){
                maxNumber=d;
            }else{
                maxNumber=b;
            }

        }

        return maxNumber;

    }
    public static double maxMin(double a, double b, double d){
        double minNumber = 0;

        if (a<b){
            if (a<d){
                minNumber = a;
            }else{
                minNumber = d;
            }

        } else if (b<a) {
            if (b<d){
                minNumber=b;
            } else{
                minNumber=d;
            }
        } else if (d<a) {
            if (d<b){
                minNumber=d;
            }else{
                minNumber=b;
            }

        }

        return minNumber;

    }
    public static void display(double sum){
        System.out.print(sum);
    }
}
