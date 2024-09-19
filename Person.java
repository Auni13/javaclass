public class Person {

    private double gpaFirst;
    private double gpaSec;
    private double gpaThird;
    private double cgpa;

    public Person(double cgpa, double gpaFirst, double gpaSec, double gpaThird){
        this.cgpa = cgpa;
        this.gpaFirst = gpaFirst;
        this.gpaSec = gpaSec;
        this.gpaThird = gpaThird;
    }

    //public void displayDetails(){

        //System.out.println(cgpa);
        //int maxInt = Integer.MAX_VALUE;

        //System.out.println("Name is: " + name);
        //System.out.println("The age is: " + age);
    //}

    public static void main(String[] args){
        double gpaFirst = 3.6;
        double gpaSec = 3.8;
        double gpaThird = 3.4;

        double cgpa = (gpaFirst + gpaSec +gpaThird)/3;
        System.out.println(cgpa);
    }
    
}
