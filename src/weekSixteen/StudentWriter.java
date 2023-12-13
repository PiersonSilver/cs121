package weekSixteen;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {
    public static void main(String[] args) {
        try{
            Student student = new Student("Theodore Hinklebottom", 76511256, 4.0);
            Gson gson = new Gson();

            String jsonstring = gson.toJson(student);

            FileWriter writer = new FileWriter("student.json");
            writer.write(jsonstring);
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
