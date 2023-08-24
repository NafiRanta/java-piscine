import java.io.*;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Cat.cat(new String[]{"input"});
        String output = outputStream.toString();
        System.out.println(outputStream.toString().equals("test input file\n"));


        ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
        PrintStream printStream2 = new PrintStream(outputStream);
        System.setOut(printStream2);

        Cat.cat(new String[]{});
        //String output = outputStream2.toString();
        System.out.println(outputStream2.toString().equals(""));
    }
}