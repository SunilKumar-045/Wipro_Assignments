package filehandling;

import java.io.File;
import java.io.IOException;
public class CreateFile {

    public static void main(String args[]){
        File file = new File("myfile.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File Created: "+file.getName());
            }else{
                System.out.println("File already exists");
            }
        }catch (IOException io){
            io.printStackTrace();
        }
    }

}
