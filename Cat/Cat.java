import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: Cat <filename>");
            return;
        }

        String filename = args[0];
        File file = new File(filename);

        if (!file.exists() || !file.isFile()) {
            System.err.println("File not found: " + filename);
            return;
        }

        try (InputStream inputStream = new FileInputStream(file)) {
            // InputStream is a way to read file, a tool tt lets program get data frm file & use it
            // buffer is like temp storage tt holds small amt of data frm file before program can process it
            byte[] buffer = new byte[4096]; // Adjust buffer size as needed
            int bytesRead;


            while ((bytesRead = inputStream.read(buffer)) != -1) { // -1 is end of file
                System.out.write(buffer, 0, bytesRead); // buffer: array tt holds data read frm file, 0 is start index, bytesRead: no of bytes actually read
                // the line takes the chunk of data read from the file and displays it on the screen.
            }
        }
    }
}