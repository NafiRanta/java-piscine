import java.io.*;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        String inputFileName = "input.txt"; // Change to your input file name
        String outputFileName = "output.txt"; // Change to your output file name

        Capitalize.capitalize(new String[]{inputFileName, outputFileName});
    }
}