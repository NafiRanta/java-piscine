import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length != 2) {
            return;
        }

        String file = args[0];
        String outputFile = args[1];

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                String[] words = line.split("\s+");
                for (int i = 0; i < words.length; i++) {
                    if (!words[i].isEmpty()) {
                        words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();

                    }
                }
                writer.write(String.join(" ", words));
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }


}
