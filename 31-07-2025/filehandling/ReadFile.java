package filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
public class ReadFile {
    public static void main(String args[]){
        try(BufferedReader reader  = new BufferedReader(new FileReader("myfile.txt"))){
            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }

        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
