import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Named
@RequestScoped
public class SuperheroRepository2 {
    public List<Superhero> getSuperhero() {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/superhero?user=root&password=");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT s.superhero_name, s.full_name, g.gender, r.race, a.alignment" +
                                " FROM superhero.superhero as s " +
                                "JOIN gender as g on (g.id = s.gender_id)"+"" +
                                "JOIN race as r on (r.id = s.race_id)"+
                                "JOIN alignment as a on (a.id = s.alignment_id)"
                        )
        ) {
            ArrayList<Superhero> superheroes = new ArrayList<>();

            while (resultSet.next()) {
                superheroes.add(new Superhero(
                        resultSet.getString(1),
                        resultSet.getString(1),
                        resultSet.getString(1),
                        resultSet.getString(1),
                        resultSet.getString(1)
                ));
            }

            return superheroes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
