package Company;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1010, "Do", "Davin", 10000);
        System.out.println(employee);
        employee.raiseSalary(50);
        System.out.println(employee);
    }
}
