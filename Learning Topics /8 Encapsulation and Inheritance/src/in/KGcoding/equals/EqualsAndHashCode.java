package in.KGcoding.equals;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        Person person1 = new Person("vishal" , 21 , "001");
        Person person2 = new Person("vishal" , 21 , "001");
        if(person1.equals(person2)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
