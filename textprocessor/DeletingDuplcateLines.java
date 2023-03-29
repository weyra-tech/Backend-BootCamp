package textprocessor;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class  DeletingDuplcateLines {

    private static PrintWriter pw;

    public static void main(String[] args) throws IOException {

        pw = new PrintWriter("F:\\output.txt");

        for (String p : Files.newBufferedReader(Paths.get("F:\\input.txt")).
                lines().
                collect(Collectors.toCollection(LinkedHashSet::new)))
            pw.println(p);
        pw.flush();
        pw.close();

        System.out.println("File operation performed successfully");
    }
}