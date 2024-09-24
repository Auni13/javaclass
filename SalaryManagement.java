import java.util.Scanner;

public class SalaryManagement{
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;
    

    // Constructor
    public SalaryManagement(String name, double baseSalary){
        this.name = name; 
        this.baseSalary = baseSalary;
        this.healthAllowance = 0;
        this.transportAllowance = 0;
        this.bonus = 0;          
        this.totalSalary = calcTotSalary();
    }

    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public double getHealthAllowance(){
        return healthAllowance;
    }

    public void setHealthAllowance(double healthAllowance){
        this.healthAllowance = healthAllowance;
    }

    public double getTransportAllowance(){
        return transportAllowance;
    }

    public void setTransportAllowance(double transportAllowance){
        this.transportAllowance = transportAllowance;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    // Assign a grade based on average score
    public double assignBonus(){

        double bonus = 0;
        if (baseSalary > 5000){
            bonus = 0.1 * baseSalary;
        }else if (baseSalary>=3000 && baseSalary<=5000){
            bonus = 0.05 * baseSalary;
        }else if (baseSalary<3000){
            bonus = 0;
        }
        return bonus;
    }
    
    public double calcTotSalary(){
        double totalSalary = 0;
        
        totalSalary = baseSalary + healthAllowance + transportAllowance + assignBonus();

        return totalSalary;
    }

    public static void main(String[] args) {
        SalaryManagement[] employees = new SalaryManagement[3]; // Array for 5 students
        Scanner scanner = new Scanner(System.in);

        // Collect data for each student
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter Employee " + (i + 1) + " Details:");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Base Salary:  ");
            double baseSalary = scanner.nextDouble();

            employees[i] = new SalaryManagement(name, baseSalary); //pass to the get

            System.out.print("Health Allowance: ");
            double healthAllowance = scanner.nextDouble();
            employees[i].setHealthAllowance(healthAllowance);

            System.out.print("Transport Allowance: ");
            double transportAllowance = scanner.nextDouble();
            employees[i].setTransportAllowance(transportAllowance);
            scanner.nextLine();
            System.out.println();
            
        }

        // Display information for each student
        System.out.println("\nEmployee Salary:");
        for (SalaryManagement employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Base Salary: " + employee.getBaseSalary());
            System.out.println("Health Allowance: " + employee.getHealthAllowance());
            System.out.println("Transport Allowance: " + employee.getTransportAllowance());
            System.out.println("Bonus: " + employee.assignBonus());
            System.out.println("Total Salary: " + employee.calcTotSalary());
            System.out.println();
        }
    }
    
}
