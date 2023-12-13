package weekTen;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseInfo {
    ArrayList<String> courses = new ArrayList<>();
    ArrayList<Double> gpas = new ArrayList<>();
    ArrayList<Integer> scores = new ArrayList<>();
    ArrayList<Character> grades = new ArrayList<>();

    Scanner console = new Scanner(System.in);

    public void addInfo(String course, int score, char grade, double gpa){
        courses.add(course);
        scores.add(score);
        grades.add(grade);
        gpas.add(gpa);
    }
    public void printTable(){
        System.out.printf("%-18s %-10s %-10s %s\n", "Course Name", "Score", "Grade", "GPA");
        for(int i = 0; i < courses.size(); i++){
            System.out.printf("%-20s %-10d %-8c %.2f\n", courses.get(i), scores.get(i), grades.get(i), gpas.get(i));
        }
    }
}
