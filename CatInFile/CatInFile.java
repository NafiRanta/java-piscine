import java.io.IOException;
import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException, IOException {
        if (args.length != 1) {
            System.err.println("Usage: CatInFile <filename>");
            return;
        }

        String filename = args[0];
        File file = new File(filename);

        try (OutputStream outputStream = new FileOutputStream(file)) {
            byte[] buffer = new byte[4096]; // Adjust buffer size as needed
            int bytesRead;

            while ((bytesRead = System.in.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }
}