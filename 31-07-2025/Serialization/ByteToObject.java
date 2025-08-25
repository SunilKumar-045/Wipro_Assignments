package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class ByteToObject {

    public static void main(String args[]){

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Student2.ser"))){
            Student s2 = (Student)in.readObject();
            System.out.println(s2.toString());

        }catch (Exception io){
            io.printStackTrace();
        }
    }
}
