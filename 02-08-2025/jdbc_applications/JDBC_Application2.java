package jdbc_applications;


import java.sql.*;
import java.util.*;
public class JDBC_Application2 {

    public static void main(String args[]){
        String url = "jdbc:mysql://localhost:3306/java_selenium";
        String username = "root";
        String password = "root";

        String query = "create table Student(rollNo int,first_Name varchar(40),last_Name varchar(40),mail varchar(40),grade varchar(20),school_Name varchar(40),school_Location varchar(40),timings varchar(40),subjects int,parentNumber varchar(20))";
        String query1 = "INSERT INTO Student values(1,'Sunil','chakali','csk@gmail.com','10th grade','zphs','hyd','9 to 4',6,'794561235')," +
                "(2,'Shiva','chakali','csk@gmail.com','10th grade','zphs','hyd','9 to 4',6,'7988888888'),"+
                "(3,'Sunny','banda','sunny@gmail.com','9th grade','zphs','hyd','9 to 4',6,'7999999999'),"+
                "(4,'Sachin','byagari','sachin@gmail.com','8th grade','zphs','hyd','9 to 4',6,'7945675321'),"+
                "(5,'kedar','gudem','kedar@gmail.com','5th grade','zphs','hyd','9 to 4',6,'757861235'),"+
                "(6,'Shanthi','kadiyam','shanthi@gmail.com','10th grade','zphs','hyd','9 to 4',6,'794231235'),"+
                "(7,'manoj','chala','manoj@gmail.com','10th grade','zphs','hyd','9 to 4',6,'7947777335'),"+
                "(8,'raju','vara','raju@gmail.com','9th grade','zphs','hyd','9 to 4',6,'7894523235'),"+
                "(9,'tarun','vislavanth','tarun@gmail.com','10th grade','zphs','hyd','9 to 4',6,'794561295'),"+
                "(10,'ram','kumar','ram@gmail.com','10th grade','zphs','hyd','9 to 4',6,'7975310235')";
        String query2 = "DELETE FROM Student WHERE rollNo IN (2, 4)";
        String query3 = "UPDATE Student SET rollNo = 38 , first_Name = 'Bharath', last_Name = 'Yerragutla' WHERE rollNo = 5";
        String query4 = "SELECT * FROM STUDENT";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();

//            int count = st.executeUpdate(query);
//            int count = st.executeUpdate(query1);
//            int count = st.executeUpdate(query2);
//            int count = st.executeUpdate(query3);
//            System.out.println("Number of rows affected by this query "+count);

            ResultSet rs = st.executeQuery(query4);
            while(rs.next()){
                System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5)+","+rs.getString(6)+","+rs.getString(7)+","+rs.getString(8)+","+rs.getInt(9)+","+rs.getString(10));
            }
            st.close();
            con.close();
            System.out.println("Connetion closed...");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
