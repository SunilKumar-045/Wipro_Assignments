package filehandling;

import java.io.File;
public class DeleteFile {
    public static void main(String args[]){
        File file = new File("myfile.txt");
        if(file.delete()){
            System.out.println("Deleted the ifile: "+file.getName());
        }else{
            System.out.println("Failed to delete file");
        }
    }
}
