package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class ObjectToByte {

    public static void main(String agrs[]){


        Student student2 = new Student(22,"SunilKumar",7894561280L);

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Student2.ser"))){
            out.writeObject(student2);
            System.out.println("Object successfully converted to serializable");
        }catch (IOException io){
            io.printStackTrace();

        }
    }

}
