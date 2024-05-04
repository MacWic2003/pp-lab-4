import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
        employees[0] = new Manager("Jan Kowalski", 4000.00, 0);
        employees[1] = new Worker("Anna Nowak", 3200.00, "specialist marketing");
        employees[2] = new Employee("Piotr Wiśniewski", 2900.00);
        employees[3] = new Worker("Olga Zając", 3300.00, "HR Specialist");
        employees[4] = new Worker("Marek Piotrowski", 3100.00, "IT Developer");
        employees[5] = new Manager("Laura Bielska", 4200.00, 2);
        employees[6] = new Worker("Robert Górski", 3500.00, "Ecommerce Specialist");

        for (Employee emp : employees) {
            emp.setSalary(emp.getSalary() + 500);
        }

        ((Manager) employees[0]).setNumberOfSubordinates(5);
        ((Manager) employees[0]).setSalary(7500);
        ((Manager) employees[5]).setNumberOfSubordinates(3);
        ((Manager) employees[5]).setSalary(7500);

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}