import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FileAssistant {
    public static void GenerateNumbers(String name, int quantity) throws IOException  {
        Random random = new Random();
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(name));     
        for (int i = 0; i < quantity; i++) {
            int number = random.nextInt(10000);
            writer.write(Integer.toString(number));
            writer.newLine();
        }

        writer.close();
    }

 public static Integer[] ReadNumbers(String name) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(name));
        String line;

        while ((line = reader.readLine()) != null) {
            numbers.add(Integer.parseInt(line));
        }

        reader.close();

        return numbers.toArray(new Integer[0]);
    }
}
