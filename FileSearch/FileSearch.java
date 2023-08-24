import java.io.*;
import java.nio.file.*;

public class FileSearch {
    public static String searchFile(String fileName) {
        Path rootPath = Paths.get("documents");
        try {
            return findFile(rootPath, fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String findFile(Path currentPath, String targetFileName) throws IOException {
        if (!Files.isDirectory(currentPath)) {
            if (currentPath.getFileName().toString().equals(targetFileName)) {
                return currentPath.toString();
            }
        } else {
            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(currentPath)) {
                for (Path path : directoryStream) {
                    String result = findFile(path, targetFileName);
                    if (result != null) {
                        return result;
                    }
                }
            }
        }
        return null;
    }
}