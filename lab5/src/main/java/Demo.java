import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/lab5";
        String username = "root";
        String password = "admin";
        DBStructureService service = new DBStructureService(url,username,password);
        service.getConnection();
        //service.createAllTables();
        service.dropAllTables();
    }
}
