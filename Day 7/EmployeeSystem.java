abstract class Employee {
    String name;
    int employeeId;
    
    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    
    abstract void calculateSalary();
    
    void showDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, int employeeId) {
        super(name, employeeId);
    }
    
    void calculateSalary() {
        System.out.println("Salary: ₹50000");
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    
    PartTimeEmployee(String name, int employeeId, int hoursWorked) {
        super(name, employeeId);
        this.hoursWorked = hoursWorked;
    }
    
    void calculateSalary() {
        System.out.println("Salary: ₹" + (hoursWorked * 500));
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee fullTimeEmp = new FullTimeEmployee("Ramya", 101);
        Employee partTimeEmp = new PartTimeEmployee("Sharmi", 102, 20);
        
        fullTimeEmp.showDetails();
        fullTimeEmp.calculateSalary();
        
        System.out.println();
        
        partTimeEmp.showDetails();
        partTimeEmp.calculateSalary();
    }
}










