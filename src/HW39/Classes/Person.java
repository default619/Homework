package HW39.Classes;
 public class Person {
    public String firstName;
    public String lastName;
    private String SSN = "123-45-6789";

    public void printAge (int age){
        System.out.println(firstName+"'s age is: "+age);
    }
    public void printSSN (){
        System.out.println(firstName+"'s SSN is: "+SSN);
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("The first name is: "+firstName);
        System.out.println("The last name is: "+lastName);
    }

}

