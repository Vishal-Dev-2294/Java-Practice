package in.Vishal.challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFIleReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name what you want to read ");
        String fileName = input.next();
        try (FileReader reader = new FileReader(fileName)){
            int read;
            while((read = reader.read()) != -1){
                System.out.println((char) read);
            }
        } catch (FileNotFoundException exception) {
            System.out.printf("%s not found" , fileName);
        } catch (IOException e) {
            System.out.printf("Error occured %s " , e.getMessage());
        }
    }
}

