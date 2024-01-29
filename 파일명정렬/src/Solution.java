import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String[] solution(String[] fileNames) {
        List<File> files = toFiles(fileNames);

        Collections.sort(files);

        return files.stream()
                .map(File::toString)
                .toArray(String[]::new);
    }

    public List<File> toFiles(String[] fileNames) {
        FileNameParser fileNameParser = new FileNameParser();

        List<File> files = new ArrayList<>();

        for (String fileName : fileNames) {
            List<String> parsed = fileNameParser.parse(fileName);

            String head = parsed.get(0);
            String number = parsed.get(1);
            String tail = parsed.get(2);

            files.add(new File(head, number, tail));
        }

        return files;
    }
}
