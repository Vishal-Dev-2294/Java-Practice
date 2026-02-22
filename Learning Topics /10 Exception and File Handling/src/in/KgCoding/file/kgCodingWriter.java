package in.KgCoding.file;

import javax.management.loading.MLet;
import java.io.FileWriter;
import java.io.IOException;

public class kgCodingWriter {
    public static void main(String[] args) {
        String fileName = "Java-learning.txt";
        try(FileWriter writer = new FileWriter(fileName)) {
            writer.write("I am learning with best java course\n");
            for(int i=0; i<=50; i++){
                writer.write("*\n");
            }
            writer.flush();
            System.out.println("File written Successfully");
        } catch (IOException exception){
            System.out.printf("Exception Occured %s" , exception.getMessage());
        }
    }
}
