import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHandler
{
    private Connection connect;
    private Statement statement;
    private String database_name = "Apartments";
    private String sql;
    private ResultSet results;

    public DBHandler()
    {
        try
        {
            this.connect();
            sql = "SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.CHEMATA WHERE SCHEME_NAME = '"+database_name+"';";
            this.execute(this.sql);
            if(!results.isBeforeFirst())
            {
                this.create();
            }
            this.close();
        } catch (Exception e){}
    }

    public void connect() throws SQLException
    {
        connect = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=asdf3617");
        statement = connect.createStatement();
    }

    public void create() throws SQLException
    {
        sql = "CREATE DATABASE IF NOT EXISTS "+database_name+";";
        this.execute(this.sql);
    }

    public void execute(String sql) throws SQLException
    {
        this.results = this.statement.executeQuery(sql);
    }

    public void close() throws SQLException
    {
        statement.close();
    }
}
