package ExersiceW2;

public class Student{
    private String name;
    private double averageScore;
    private int[] scores = new int[3]; //bnyk mano data dle array utk brapo karo ad 
    private String grade;

    public Student(String name, int scoreMath, int scoreScience, int scoreEnglish) {
        this.name = name;
        this.scores[0] = scoreMath;  // Correct index
        this.scores[1] = scoreScience;  // Correct index
        this.scores[2] = scoreEnglish;  // Correct index
        this.averageScore = calculateAverage();  // Automatically calculate average
    }
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int[] getScores(){
        return scores;
    }

    public void setScore(int score){
        this.scores = scores;
    }

    

    public double calculateAverage(){
        int total = 0;
        for (int score : scores){       //get from array to be calc the total 
            total += score;
        }
        averageScore = total / 3;
        return averageScore;
    }

    public String assignGrade(){
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

}