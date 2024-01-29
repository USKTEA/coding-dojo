import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Printer {
    private List<Document> buffer;

    public Printer() {
        this.buffer = new ArrayList<>();
    }

    public List<Document> print(List<Document> documents) {
        Document picked;

        while (!documents.isEmpty()) {
            picked = documents.remove(0);

            for (Document document : documents) {
                if (document.priority() > picked.priority()) {
                    documents.add(picked);
                    picked = null;

                    break;
                }
            }

            if (Objects.nonNull(picked)) {
                buffer.add(picked);
            }
        }

        return buffer;
    }
}
