// ===== Developer.java =====
package payroll;

public class Developer extends Payment {

    public Developer(Employee employee) {

        super(employee);
    }

    @Override
    public double calculateBonus()
    {
        return employee.getSalary() * 0.10; // 10% ya salary
    }
}