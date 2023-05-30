
package mysqltutorial;
import java.sql.*;
public class MySQLTutorial {

    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/students?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = "";
        String driver = "com.mysql.cj.jdbc.Driver";
        
        try{
            //establish connection
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url, username, password);
            
            Statement s = conn.createStatement();
            //create the query that will display all info from database
            String query = "Select * From studentdetails";
            //Place all records retrieved from in a result get
            ResultSet rs = s.executeQuery(query);
            //iterate through the result set and display all records on screen
            while(rs.next()){
                System.out.println(rs.getString("studid")  + " " + rs.getString("studname") + " " + rs.getString("studsurname"));;
            }
            conn.close();
            } catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
            e.printStackTrace();
        
        }
    

    }
    
}
