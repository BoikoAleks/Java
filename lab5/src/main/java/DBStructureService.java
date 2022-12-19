import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBStructureService {
    final String url;
    final String username;
    final String password;
    final Connection connection;
    DBStructureService(String url, String username, String password) throws SQLException, ClassNotFoundException {
        this.url = url;
        this.username = username;
        this.password = password;
        connection = getConnection();
    }
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url,username,password);
    }
    void dropAllTables() throws ClassNotFoundException, SQLException {
        String sqlStatement[] =
                {
                        "DROP TABLE IF EXISTS bike",
                        "DROP TABLE IF EXISTS car",
                        "DROP TABLE IF EXISTS vehicle"
                };
        Statement statement = connection.createStatement();
        for (String sqlSt:sqlStatement) {
            statement.execute(sqlSt);
        }
        System.out.println("All tables removed");
    }
    void createAllTables() throws SQLException, SQLException {
        String sqlStatement[]=
                {
                        """
                            CREATE TABLE lab5.vehicle (
                              id BIGINT NOT NULL AUTO_INCREMENT,
                              make varchar(100) NOT NULL,
                              model varchar(100) NOT NULL,
                              type varchar(100) NOT NULL,
                              price varchar(100) NOT NULL,
                              CONSTRAINT PK_CPU PRIMARY KEY (id)
                            )
                        """,
                        """
                            CREATE TABLE lab5.bike (
                              id BIGINT NOT NULL AUTO_INCREMENT,
                              id_vehicle BIGINT,
                              color varchar(100) NOT NULL,
                              weight int NOT NULL,
                              CONSTRAINT PK_BIKE PRIMARY KEY (id),
                              FOREIGN KEY (id_vehicle) REFERENCES vehicle(id) ON UPDATE CASCADE ON DELETE SET NULL
                            );
                        """,
                        """
                            CREATE TABLE lab5.car (
                              id BIGINT NOT NULL AUTO_INCREMENT,
                              id_vehicle BIGINT,
                              seats int NOT NULL,
                              CONSTRAINT PK_CAR PRIMARY KEY (id),
                              FOREIGN KEY (id_vehicle) REFERENCES vehicle(id) ON UPDATE CASCADE ON DELETE SET NULL
                            )
                        """
                };

        Statement statement = connection.createStatement();
        for (String sqlSt:sqlStatement) {
            statement.execute(sqlSt);
        }
        System.out.println("All tables created");
    }
}
