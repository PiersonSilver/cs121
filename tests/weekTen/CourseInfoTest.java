package weekTen;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CourseInfoTest {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        CourseInfo test = new CourseInfo();
        while(true){
            String a, course;
            int score;
            char grade;
            double gpa;
            System.out.println("Enter Course Info (or press 'q' to quit)");
            System.out.println("Course Name:");
            a = console.nextLine();
            if (a.equalsIgnoreCase("q")){
                break;
            }
            else{
                course = a;
            }
            System.out.println("Score:");
            a = console.nextLine();
            if (a.equalsIgnoreCase("q")){
                break;
            }
            else{
                score = Integer.parseInt(a);
            }
            System.out.println("Letter Grade:");
            a = console.nextLine();
            if (a.equalsIgnoreCase("q")){
                break;
            }
            else{
                grade = a.charAt(0);
            }
            System.out.println("GPA:");
            a = console.nextLine();
            if (a.equalsIgnoreCase("q")){
                break;
            }
            else{
                gpa = Double.parseDouble(a);
            }
            test.addInfo(course,score,grade,gpa);
        }
        test.printTable();
    }



}