package HW39.methods;

import HW39.classes.person;

public class SetFullNameAndReturnAge {

    public static int SetFullNameAndReturnAge (String firstName, String lastName){
        person person1 = new person(firstName,lastName);
        int age = person1.GetAge();
        return age;
    }


}
