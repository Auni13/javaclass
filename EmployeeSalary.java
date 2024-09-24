public class EmployeeSalary{
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;
    

    // Constructor
    public EmployeeSalary(String name, double baseSalary, double healthAllowance, double transportAllowance){
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
        EmployeeSalary[] employees = new EmployeeSalary[4]; // Array for 3 employee
        
        try{
        employees[0] = new EmployeeSalary("Auni", 4400, 400, 400);
        employees[1] = new EmployeeSalary("Sya", 3000, 300, 300);
        employees[2] = new EmployeeSalary("Hanis", 3500, 350, 350);
        employees[3] = new EmployeeSalary("Dina", 5500, 500, 500);

        System.out.println(employees[6]);
        
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught bad " + e.getMessage());
        }finally{
            System.out.println("It will executed anyway");
        }
            

        //Display information for each student
        System.out.println("\nEmployee Salary:");
        for (int i=0; i<employees.length; i++) {
            System.out.println("Name: " + employees[i].getName());
            System.out.println("Base Salary: " + employees[i].getBaseSalary());
            System.out.println("Health Allowance: " + employees[i].getHealthAllowance());
            System.out.println("Transport Allowance: " + employees[i].getTransportAllowance());
            System.out.println("Bonus: " + employees[i].assignBonus());
            System.out.println("Total Salary: " + employees[i].calcTotSalary());
            System.out.println();
        }
    }
    
}
