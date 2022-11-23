public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String town;
    private int shoeSize;
    private char hatSize;

    public Person(String firstName, String lastName, int age, String town, int shoeSize, char hatSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.town = town;
        this.shoeSize = shoeSize;
        this.hatSize = hatSize;
    }
    public Person(){
        firstName = "no name";
        lastName = " no name";
        age = 0;
        town = " none";
        shoeSize = 0;
        hatSize = 's';


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public char getHatSize() {
        return hatSize;
    }

    public void setHatSize(char hatSize) {
        this.hatSize = hatSize;
    }
}
