import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("lets enter a couple of numbers:");
        System.out.print("Enter the first number: ");
        double inputtedNum1 = reader.nextDouble();
        System.out.print("Enter the second number: ");
        double inputtedNum2 = reader.nextDouble();
        double c;

        displayMenu();

        int answer = reader.nextInt();

        // as a switch statement:
        switch (answer) {
            case 1 -> {
                c = sumMethod(inputtedNum1, inputtedNum2);
                System.out.println("This is the result of a Switch statement: ");
                System.out.print("The sum of " + inputtedNum1 + " + " + inputtedNum2 + " = ");
                display(c);
                System.out.println(" ");

            }
            case 2 -> {
                c = subtractMethod(inputtedNum1, inputtedNum2);
                System.out.println("This is the result of a Switch statement: ");
                System.out.print("The sum of " + inputtedNum1 + " - " + inputtedNum2 + " = ");
                display(c);
                System.out.println(" ");

            }
            case 3 -> {
                c = multiplyMethod(inputtedNum1, inputtedNum2);
                System.out.println("This is the result of a Switch statement: ");
                System.out.print("The sum of " + inputtedNum1 + " * " + inputtedNum2 + " = ");
                display(c);
                System.out.println(" ");

            }
            case 4 -> {
                c = divideMethod(inputtedNum1,inputtedNum2);
                System.out.println("This is the result of a Switch statement: ");
                System.out.print("The sum of " + inputtedNum1 + " / " + inputtedNum2 + " = ");
                display(c);
                System.out.println(" ");


            }
            default -> System.out.println("That's an invalid option!");
        }

        // as an if statement:
        if (answer == 1) {
            c = sumMethod(inputtedNum1, inputtedNum2);
            System.out.println("This is the result of an if statement: ");
            System.out.print("The sum of " + inputtedNum1 + " + " + inputtedNum2 + " = ");
            display(c);
        } else if (answer == 2) {
            c = subtractMethod(inputtedNum1, inputtedNum2);
            System.out.println("This is the result of an if statement: ");
            System.out.print("The sum of " + inputtedNum1 + " - " + inputtedNum2 + " = ");
            display(c);
        } else if (answer == 3) {
            c = multiplyMethod(inputtedNum1, inputtedNum2);
            System.out.println("This is the result of an if statement: ");
            System.out.print("The sum of " + inputtedNum1 + " * " + inputtedNum2 + " = ");
            display(c);
        } else if (answer ==4) {
            c = divideMethod(inputtedNum1, inputtedNum2);
            System.out.println("This is the result of an if statement: ");
            System.out.print("The sum of " + inputtedNum1 + " / " + inputtedNum2 + " = ");
            display(c);
            System.out.println(" ");
        } else {
            System.out.println("That's an invalid option!");
        }

    }
    public static void displayMenu(){
        System.out.println("What would you like to do? 1, 2 or 3: ");
        System.out.println("1. Add numbers");
        System.out.println("2. Subtract numbers");
        System.out.println("3. Multiply numbers");
        System.out.println("4. Divide numbers");

    }
    public static double sumMethod(double a, double b){
        return (a+b);
    }

    public static double subtractMethod(double a, double b){
        return(a-b);
    }
    public static double multiplyMethod(double a, double b){
        return(a*b);
    }
    public static double divideMethod(double a, double b){
        return(a/b);
    }
    public static void display(double sum){
        System.out.print(sum);
    }
}
