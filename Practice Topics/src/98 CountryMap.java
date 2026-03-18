import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountryMap {
    public static void main(String[] args) {
        Map<String , String> country = new HashMap<>();
        country.put("India" , "delhi");
        country.put("Ahmedabad" , "gandhinagar");
        country.put("Pakistan" , "lahor");
        country.put("Usa" , "sydney");
        country.put("Nepal" , "katmandu");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the country name : ");
        String countryName = input.next();
        if (country.containsKey(countryName)){
            String capital = country.get(countryName);
            System.out.printf("Your %s capital is %s " , countryName , capital);
        } else {
            System.out.println("Your country is not matching in the map");
        }
    }
}
