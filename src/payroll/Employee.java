package payroll;

public class Employee {
        private int employeeId;
        private String employeeName;
        private String employeeStatus;
        private double salary;

        public Employee(int employeeId, String employeeName,
                        String employeeStatus, double salary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.employeeStatus = employeeStatus;
            setSalary(salary);
        }

        public int getEmployeeId()        {
            return employeeId; }
        public String getEmployeeName()   {
            return employeeName; }
        public String getEmployeeStatus() {
            return employeeStatus; }
        public double getSalary()         {
            return salary; }

        public void setSalary(double salary) {
            if (salary < 0) {
                System.out.println("Error: Salary cannot be negative!");
                this.salary = 0;
            } else {
                this.salary = salary;
            }
        }
    }

