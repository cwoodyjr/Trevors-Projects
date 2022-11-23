public class Adult extends Person {


    private final boolean hasFacialHair;

    public Adult(String firstName, String lastName, int age, String town, int shoeSize, char hatSize, boolean hasFacialHair) {
        super(firstName, lastName, age, town, shoeSize, hatSize);
        this.hasFacialHair = hasFacialHair;

    }

}

