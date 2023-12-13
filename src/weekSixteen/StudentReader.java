package weekSixteen;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentReader {
    public static void main(String[] args) {
        try{
            Gson gson = new Gson();

            BufferedReader reader = new BufferedReader(new FileReader("student.json"));
            Student student = gson.fromJson(reader, Student.class);

            System.out.println("Student Details");
            System.out.printf("Name: %s\nID: %d\nGPA: %.2f", student.getName(), student.getId(), student.getGpa());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
