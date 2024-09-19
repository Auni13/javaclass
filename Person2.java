public class Person2 {
    private String name;
    private double gpa;
    private int years;

    public Person2(String name, double gpa, int years){
        this.name = name;
        this.gpa = gpa;
        this.years = years;
    }

    public void displayDetails(){
        System.out.println( name + " GPA is " + gpa + " in " + years + " years of study");
    }

    public static void main(String[] args){
        Person2 person2 = new Person2("Auni", 3.5, 3);
        person2.displayDetails();
    }
}
