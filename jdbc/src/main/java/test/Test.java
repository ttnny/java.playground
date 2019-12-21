package test;

import entities.Person;
import repository.PersonCRUDRepository;

import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws SQLException {
        PersonCRUDRepository repo = new PersonCRUDRepository();

        // List all records
        List<Person> people = repo.findAll();

        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();

        // Enter a few test records
        repo.add(new Person(0, "Chicken", "Teriyaki", "FaveFood", 45));

        // Delete a few records
        repo.delete(12);

        // Update a record
        repo.update(new Person(1, "Chicken", "Teriyaki", "FaveFood", 99));
    }
}
