import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[] priorities, int location) {
        return indexOf(print(toDocuments(priorities)), location);
    }
    
    public List<Document> toDocuments(int[] properties) {
        List<Document> documents = new ArrayList<>();

        for (int i = 0; i < properties.length; i += 1) {
            documents.add(new Document(i, properties[i]));
        }

        return documents;
    }

    public List<Document> print(List<Document> documents) {
        Printer printer = new Printer();

        List<Document> printed = printer.print(documents);

        return printed;
    }

    public int indexOf(List<Document> documents, int location) {
        for (int i = 0; i < documents.size(); i += 1) {
            if (documents.get(i).location() == location) {
                return i + 1;
            }
        }

        return 0;
    }
}
