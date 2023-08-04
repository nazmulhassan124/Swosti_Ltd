import java.sql.*;

public class Main {
    public static void main(String[] args)  {

try{
Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection= DriverManager.getConnection( "jdbc:mysql://localhost:3308/swosti","root","root");
    Statement statement = connection.createStatement();
    ResultSet resultSet= statement.executeQuery("select * from employee");

    while (resultSet.next()){
        System.out.println( resultSet.getString(1) + resultSet.getString(2) + resultSet.getInt(3)+resultSet.getString(4) + resultSet.getString(5));
    }
    connection.close();

}catch (Exception e){
    System.out.println(e);
}

    }
}