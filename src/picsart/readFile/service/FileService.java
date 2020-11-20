package picsart.readFile.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileService {

    private FileService() {
    }

    public static String[] readStudentsFile() throws IOException {
        System.out.println("Insert path to the file:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        return Files.readAllLines(Path.of(path)).toArray(new String[0]);
    }
}
