package textprocessor;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.Files.*;


public class ReplaceText {
    private static PrintWriter pw;
    public static void main(String args[]) {
    String filePath = "F:\\input.txt";
    String plainTextPattern= "The";
    String replaceWith ="Atirsaw";

        String fileName = "F:\\input.txt";
        List<String> list = new ArrayList<>();

        try (Stream<String> stream = lines(Paths.get(fileName))) {
            List<String> replaced = stream
                    .map(line-> line.replaceAll(plainTextPattern, replaceWith))
                    .collect(Collectors.toList());
           write(Path.of(fileName), replaced);
          // pw.write(write);

        } catch (IOException e) {
            e.printStackTrace();
        }

        }

    }

