package textprocessor;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class LineNumber {
    private static PrintWriter pw;

    public static void main(String[] args) throws IOException {

        pw = new PrintWriter("F:\\output.txt");
        String word ="Atirsaw";

        /*for (String p : Files.newBufferedReader(Paths.get("F:\\input.txt"))
                        .lines()
                        .filter(w->w.contains(word)).collect(Collectors.toCollection(ArrayList::new)))

            pw.println(p);*/


        LineNumberReader numberRdr = new LineNumberReader(Files.newBufferedReader(Paths.get("F:\\input.txt")));

        List<Integer> linesNumbers = numberRdr.lines()
                .filter(w -> w.contains(word))
                .map(w -> numberRdr.getLineNumber())
                .collect(toList());

        System.out.println(linesNumbers);
        pw.flush();
        pw.close();

        System.out.println("File operation performed successfully");
    }
}
