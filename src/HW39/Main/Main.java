package HW39.Main;
import HW39.Classes.Person;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("James","Gosling");
        person1.printAge(67);
        person1.printSSN();
    }
}
