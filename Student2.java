import java.util.Scanner;

public class Student2 {
    private String name;
    private int[] scores = new int[3]; //size of array for storing the data
    private double averageScore;

    // Constructor
    public Student2(String name, int scoreMath, int scoreScience, int scoreEnglish){
        this.name = name; 
        this.scores[0] = scoreMath;
        this.scores[1] = scoreScience;
        this.scores[2] = scoreEnglish;
        this.averageScore = calculateAverage(); // Calculate the average when creating a student
    }

    public String getName(){
        return name;
    }

    public int[] getScores(){
        return scores;
    }

    // Calculate average score
    public double calculateAverage(){
        int total = 0;
        for (int score : scores){
            total += score;
        }
        averageScore = total / 3;
        return averageScore;
    }

    // Assign a grade based on average score
    public String assignGrade(){

        String grade = "";
        if (averageScore >= 90){
            grade = "A";
        }
        else if (averageScore >= 80 && averageScore <90 ){
            grade = "B";
        }
        else if (averageScore >= 70 && averageScore <80){
            grade = "C";
        }
        else if (averageScore >=60 && averageScore <70){
            grade = "D";
        }
        else if (averageScore <60){
            grade = "F";
        }

        return grade;
    }

    public static void main(String[] args) {
        Student2[] students = new Student2[5]; // Array for 5 students
        Scanner scanner = new Scanner(System.in);

        // Collect data for each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter Student " + (i + 1) + " Details:");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Math Score: ");
            int scoreMath = scanner.nextInt();

            System.out.print("Science Score: ");
            int scoreScience = scanner.nextInt();

            System.out.print("English Score: ");
            int scoreEnglish = scanner.nextInt();
            
            scanner.nextLine();
            System.out.println();

            // Create a new Student2 object and store it in the array
            students[i] = new Student2(name, scoreMath, scoreScience, scoreEnglish); //pass to the get
        }

        // Display information for each student
        System.out.println("\nStudent Results:");
        for (Student2 student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Average Score: " + student.calculateAverage());
            System.out.println("Grade: " + student.assignGrade());
            System.out.println();
        }
    }
    
}
