package ExersiceW2;

public class StudentManagement {
    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student("Faree", 83, 76, 90);
        students[1] = new Student("Mai",  65, 78, 88);
        students[2] = new Student("Sab",  80, 68, 94);
        students[3] = new Student("Rara", 69, 87, 72);
        students[4] = new Student("Khai",  76, 93, 85);

        for (int i = 0; i<students.length; i++){
            System.out.println("\nStudents: " + students[i].getName() +
                                "\nAverage score: " + students[i].calculateAverage() + 
                                "\nGrade: " + students[i].assignGrade());
    }
}
}
