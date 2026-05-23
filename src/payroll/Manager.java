// ===== Manager.java =====
package payroll;

public class Manager extends Payment {

    public Manager(Employee employee) {
        super(employee);
    }

    @Override
    public double calculateBonus() {
        return employee.getSalary() * 0.20; // 20% ya salary
    }
}