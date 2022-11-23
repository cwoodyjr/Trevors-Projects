import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person p1 = new Person();

        System.out.println(p1.getFirstName() + " " + p1.getLastName() + "'s shoe size is " + p1.getShoeSize());

        System.out.println("p1 is an instance of Person = " + (p1 instanceof Person));
        System.out.println("p1 is an instance of Adult + " + (p1 instanceof Adult));

        Person p2 = new Person();

        System.out.println("p2 is an instance of Person = " + (p1 instanceof Person));
        System.out.println("p2 is an instance of Adult + " + (p1 instanceof Adult));


        Scanner scanner = new Scanner(System.in);

        System.out.print("enter first name :");
        p2.setFirstName(scanner.nextLine());

        System.out.print("enter age: ");
        p2.setAge(scanner.nextInt());
        if (p2.getAge() >= 18) {
            p2 = new Adult(p2.getFirstName(), p2.getLastName(), p2.getAge(),
                    p2.getTown(), p1.getShoeSize(), p1.getHatSize(), true);
        }


        System.out.println("p2 is an instance of Person = " + (p1 instanceof Person));
        System.out.println("p2 is an instance of Adult + " + (p1 instanceof Adult));


    }


}