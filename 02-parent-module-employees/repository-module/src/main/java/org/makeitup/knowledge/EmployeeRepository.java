package org.makeitup.knowledge;

import org.makeitup.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    public List<Employee> getEmployees() {

        return new ArrayList<Employee>(List.of(new Employee[]{
                new Employee("Michael", "Insure external risks"),
                new Employee("Barry", "Carry out internal audit"),
                new Employee("Alex", "Take tech lead"),
                new Employee("Andrew", "Start implementing the specification"),
                new Employee("Helena", "Perform a marketing campaign")
        }));
    }
}
