import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Named
@RequestScoped
public class SuperheroRepository {
    public List<String> getPublisher() {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/superhero?user=root&password=");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT p.publisher_name FROM superhero.publisher as p")
        ) {
            ArrayList<String> publisher = new ArrayList<>();

            while (resultSet.next()) {
                publisher.add(
                        resultSet.getString(1)
                );
            }

            return publisher;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
