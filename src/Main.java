import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            String line;

            while ((line = reader.readLine()) != null) {
                // Thay thế từ "Nha Trang" bằng "Vũng Tàu"
                line = line.replaceAll("Nha Trang", "Vũng Tàu");
                writer.write(line + "\n");
            }

            reader.close();
            writer.close();

            System.out.println("Thay thế và ghi vào file output.txt thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
