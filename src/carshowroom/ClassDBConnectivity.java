package carshowroom;
import java.sql.*;

public class ClassDBConnectivity 
{
    Connection connection;
    public Connection getDatabaseConnectivity()
    {
        try
        {
            DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
            connection = DriverManager.getConnection("jdbc:odbc:CarProjectDSN");
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
        return connection;
    }
}
