public class StringFormat {
    public static void main(String[] args) {
        String name = "Vishal";
        int marks = 78;
        System.out.println(name + "Your Marks is : " + marks);
        System.out.printf("%-10S Your Marks is : %,15d" , name , marks);
    }
}
