public class Adult extends Person {


    private boolean hasFacialHair;

    public Adult(String firstName, String lastName, int age, String town, int shoeSize, char hatSize, boolean hasFacialHair) {
        super(firstName, lastName, age, town, shoeSize, hatSize);
        this.hasFacialHair = hasFacialHair;

    }
    public Adult(){
        setFirstName("name");
        setLastName("name");
        setAge(30);
        setTown("town");
        setShoeSize(10);
        setHatSize('M');
        hasFacialHair = true;
    }


    public boolean isHasFacialHair() {
        return hasFacialHair;
    }

    public void setHasFacialHair(boolean hasFacialHair) {
        this.hasFacialHair = hasFacialHair;
    }
}

