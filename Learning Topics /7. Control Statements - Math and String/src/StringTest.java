public class StringTest {
    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder("Vishal is a.");
        sentence.append("very Dangerous man");
        System.out.println(sentence);
        sentence.toString();
    }
}
