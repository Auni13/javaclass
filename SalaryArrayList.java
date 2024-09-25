import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.function.Predicate;

public class SalaryArrayList{
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;
    

    // Constructor
    public SalaryArrayList(String name, double baseSalary, double healthAllowance, double transportAllowance){
        this.name = name; 
        this.baseSalary = baseSalary;
        this.healthAllowance = healthAllowance;
        this.transportAllowance = transportAllowance;
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

    // Assign a bonus based on base salary
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

    public void salaryNoti(){
        Predicate<Double>bonusAbove = (bonus) -> bonus > 500.0;

        if (bonusAbove.test(assignBonus())) {
            System.out.println("Congrats for your bonus");
        }else {
            System.out.println("Congrats for getting your salary");
        }
    }

    public void time(){
        
    }

    public static void main(String[] args) {

        ArrayList<SalaryArrayList> employees = new ArrayList<>();
        
        employees.add(new SalaryArrayList("Auni", 10000, 500, 500));
        employees.add(new SalaryArrayList("Sya", 3000, 300, 300));
        employees.add(new SalaryArrayList("Hanis", 3500, 350, 350));

        LocalDateTime nowDT = LocalDateTime.now();
        LocalDate nowD = LocalDate.now();
        LocalTime nowT = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        String forrmattedDT = formatter.format(nowDT);

        System.out.println(forrmattedDT);


        System.out.println("\nEmployee Salary:");
        for (SalaryArrayList employee : employees) {
            //employee.time();
            System.out.println("Name: " + employee.getName());
            System.out.println("Base Salary: " + employee.getBaseSalary());
            System.out.println("Health Allowance: " + employee.getHealthAllowance());
            System.out.println("Transport Allowance: " + employee.getTransportAllowance());
            System.out.println("Bonus: " + employee.assignBonus());
            System.out.println("Total Salary: " + employee.calcTotSalary());
            employee.salaryNoti();
            System.out.println();
        }
    }
    
}


// git pull (link repo)
// git stash