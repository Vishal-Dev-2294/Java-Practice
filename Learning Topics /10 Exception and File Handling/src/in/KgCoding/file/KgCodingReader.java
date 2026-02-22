package in.KgCoding.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class KgCodingReader {
    public static void main(String[] args) {
        String fileName = "Java-learning.txt";

        try(FileReader reader = new FileReader(fileName)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char) read);
            } while (read != -1);
        } catch (IOException e){
            System.out.printf("Exception Occured %s " , e.getMessage());
        }
    }
}
