import java.io.*;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        SortArgs.sort(new String[]{"4","2","1","3"});
        String output = outputStream.toString();
        System.out.println(output.equals("1 2 3 4\n"));
    }
}