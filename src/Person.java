public class Person {
    private String firstName = "Mit fornavn";
    private String lastName = "Mit efternavn";

    public Person(){
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }

    // method to set firstName
    public void setFirstName(String fName){
        firstName = fName;
    }

    // method to get firstName
    public String getFirstName(){
        return firstName;
    }

    // method to set lastName
    public void setLastName(String eName){
        lastName = eName;
    }

    // method to get lastName
    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return "Hej " + firstName + " " + lastName;
    }
}
