package HW39.classes;

public class person {

    public String firstName;
    public String lastName;
    private int age = 34;

    public person (String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;

    }


    // Method to get a private variable.
    public int GetAge (){
        return age;
    }
}
