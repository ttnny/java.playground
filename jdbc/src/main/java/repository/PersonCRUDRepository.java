package repository;

import entities.Person;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonCRUDRepository extends DBConnection {
    public List<Person> findAll() throws SQLException {
        List<Person> listResults = new ArrayList<>();

        // Create a statement
        Statement stmt = connection.createStatement();

        // Execute the statement and get the results
        ResultSet results = stmt.executeQuery("SELECT id, fName, lName, nickname, age FROM people");

        while (results.next()) { // return TRUE if found AND ALSO move to the next one
            listResults.add(new Person(
                    results.getInt("id"),
                    results.getString("fName"),
                    results.getString("lName"),
                    results.getString("nickname"),
                    results.getInt("age")
            ));
        }

        return listResults;
    }

    public Person findById(int id) throws SQLException {
        // Create a prepared statement
        PreparedStatement pStmt = connection.prepareStatement("SELECT id, fName, lName, nickname, age FROM people WHERE id=?");

        // Bind the parameter to the query (this prevents SQL injection)
        pStmt.setInt(1, id);

        // Execute the statement and get the results
        ResultSet results = pStmt.executeQuery();

        if (results.next()) {
            return new Person(
                    results.getInt("id"),
                    results.getString("fName"),
                    results.getString("lName"),
                    results.getString("nickname"),
                    results.getInt("age"));
        }

        return null;
    }

    public void add(Person person) throws SQLException {
        // Create a prepared statement
        PreparedStatement pStmt = connection.prepareStatement(
                "INSERT INTO people (fName, lName, nickname, age)" +
                        "VALUES (?, ?, ?, ?)",
                Statement.RETURN_GENERATED_KEYS // Retrieve the auto-generated id value (optional)
        );

        // Bind the parameters to the query (this prevents SQL injection)
        pStmt.setString(1, person.getfName());
        pStmt.setString(2, person.getlName());
        pStmt.setString(3, person.getNickname());
        pStmt.setInt(4, person.getAge());

        // Execute the prepared statement
        int id = pStmt.executeUpdate();
        person.setId(id); // update Java entity object to match the SQL database record (optional)
    }

    public void update(Person person) throws SQLException {
        // Create a prepared statement
        PreparedStatement pStmt = connection.prepareStatement(
                "UPDATE people SET fName = ?, lName = ?, nickname = ?, age = ?" +
                        "WHERE id = ?"
        );

        // Bind the parameters to the query (this prevents SQL injection)
        pStmt.setString(1, person.getfName());
        pStmt.setString(2, person.getlName());
        pStmt.setString(3, person.getNickname());
        pStmt.setInt(4, person.getAge());
        pStmt.setInt(5, person.getId());

        // Execute the prepared statement
        pStmt.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        // Create a prepared statement
        PreparedStatement pStmt = connection.prepareStatement("DELETE FROM people WHERE id = ?");

        // Bind the parameter to the query (this prevents SQL injection)
        pStmt.setInt(1, id);

        // Execute the prepared statement
        pStmt.execute();
    }
}