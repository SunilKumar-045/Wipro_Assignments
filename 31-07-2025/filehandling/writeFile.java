package filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class writeFile {
    public static void main(String args[]){
        try(FileWriter writer = new FileWriter("myfile.txt")){
            writer.write("I am from java selenium batch - 7\n");
            writer.write("Hello My name is Sunil Kumar and I am from Hyderabad");
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
