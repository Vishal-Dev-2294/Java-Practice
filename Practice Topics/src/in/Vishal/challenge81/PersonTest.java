package in.Vishal.challenge81;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person(21 , "vishal");
        Person person2 = new Person(21 , "vishal");

        if (person2.equals(person)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}
