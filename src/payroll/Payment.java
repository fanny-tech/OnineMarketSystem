// ===== Payment.java =====
package payroll;

public abstract class Payment {
    protected Employee employee;

    public Payment(Employee employee) {

        this.employee = employee;
    }

    // Abstract method - subclasses zizayisobanura
    public abstract double calculateBonus();
}