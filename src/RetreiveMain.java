import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class RetreiveMain {

	public static void main(String[] args) {
		//String filePath = "C:\\path\\to\\your\\file.txt"; // Update with your file path
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Srikanth Kamatam\\Documents\\Sample.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Process the line as needed
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

}
}



