
package payroll;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("****SalaryPaycheck****");

            // Injiza amakuru y'umukozi
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();

            // Menu yo guhitamo status
            System.out.println("\nChoose your status:");
            System.out.println("1. Manager");
            System.out.println("2. Developer");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            String status;
            Payment payment;
            Employee employee;

            if (choice == 1) {
                status = "Manager";
                employee = new Employee(id, name, status, salary);
                payment = new Manager(employee);
            } else {
                status = "Developer";
                employee = new Employee(id, name, status, salary);
                payment = new Developer(employee);
            }

            double bonus = payment.calculateBonus();

            System.out.println("\n****");
            System.out.println("Employee ID   : " + employee.getEmployeeId());
            System.out.println("Employee Name : " + employee.getEmployeeName());
            System.out.println("Status        : " + employee.getEmployeeStatus());
            System.out.println("Salary        : $" + employee.getSalary());
            System.out.println("Bonus         : $" + bonus);
            System.out.println("Total Pay     : $" + (employee.getSalary() + bonus));
            System.out.println("****");

            scanner.close();
        }
    }

