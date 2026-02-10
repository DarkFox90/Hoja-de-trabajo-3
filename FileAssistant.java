import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
}
