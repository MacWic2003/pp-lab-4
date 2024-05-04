import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Jan Kowalski", 4000.00, 0);
        employees[1] = new Worker("Anna Nowak", 3200.00, "specialist marketing");
        employees[2] = new Employee("Piotr Wiśniewski", 2900.00);
        employees[3] = new Worker("Olga Zając", 3300.00, "HR Specialist");
        employees[4] = new Worker("Marek Piotrowski", 3100.00, "IT Developer");

        int nonManagerCount = 0;
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                nonManagerCount++;
            }
        }

        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
        }

        employees[0].setSalary(7500);

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}