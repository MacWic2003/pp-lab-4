public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Jan Kowalski", 3000.00);
        employees[1] = new Employee("Anna Nowak", 3200.00);
        employees[2] = new Employee("Piotr Wiśniewski", 2900.00);
        employees[3] = new Employee("Olga Zając", 3300.00);
        employees[4] = new Employee("Marek Piotrowski", 3100.00);

        System.out.println("Pracownik nr 3: " + employees[3]);

        employees[3].setSalary(3500.00);
        System.out.println("Zaktualizowane dane pracownika nr 3: " + employees[3]);

        System.out.println("Wszyscy pracownicy:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}