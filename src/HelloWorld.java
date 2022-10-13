import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        // Exercise 3
        Person p3 = new Person(); //Person = Class, p3 = variable name, new = we're calling a new one, Person() = Constructor
        System.out.println(p3.toString());

        Person p4 = new Person("Hardy", "Madsen");
        System.out.println(p4.toString());

        p3.setFirstName("Mandse");
        p3.setLastName("Danse");
        System.out.println(p3.toString());

        ArrayList<Person> personList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            personList.add(new Person("firstName" + i, "lastName" + i));

            //Person pp = new Person("Fornavn" + i, "Efternavn" + i);
            System.out.println(i);
            //System.out.println(pp);
        }


        /* Exercise 2
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Input your last name: ");
        String lastName = scanner.nextLine();
        System.out.println(firstName + " " + lastName);

        // Exercise 1
        Person p1 = new Person();
        p1.setFirstName("Jennifer");
        System.out.println(p1.getFirstName());
        Person p2 = new Person();
        p2.setFirstName("Michael");
        System.out.println(p2.getFirstName());
         */


    }

}
