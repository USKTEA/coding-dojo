import java.io.StringWriter;
import java.util.Map;

public class Decryptor {
    private Map decryptionTable;
    private StringWriter decryptedBuilder = new StringWriter();
    private StringWriter decrypting = new StringWriter();

    public Decryptor() {
        this.decryptionTable = Map.ofEntries(
                Map.entry("one", "1"),
                Map.entry("two", "2"),
                Map.entry("three", "3"),
                Map.entry("four", "4"),
                Map.entry("five", "5"),
                Map.entry("six", "6"),
                Map.entry("seven", "7"),
                Map.entry("eight", "8"),
                Map.entry("nine", "9"),
                Map.entry("zero", "0"),
                Map.entry("0", "0"),
                Map.entry("1", "1"),
                Map.entry("2", "2"),
                Map.entry("3", "3"),
                Map.entry("4", "4"),
                Map.entry("5", "5"),
                Map.entry("6", "6"),
                Map.entry("7", "7"),
                Map.entry("8", "8"),
                Map.entry("9", "9")
        );
    }

    public void decrypt(String word) {
        if (decryptionTable.containsKey(word)) {
            decryptedBuilder.append(decryptionTable.get(word).toString());

            return;
        }

        decrypting.append(word);

        if (decryptionTable.containsKey(decrypting.toString())) {
            decryptedBuilder.append(decryptionTable.get(decrypting.toString()).toString());

            decrypting = new StringWriter();
        }
    }

    public int result() {
        return Integer.parseInt(decryptedBuilder.toString());
    }

    public Map getDecryptionTable() {
        return decryptionTable;
    }
}
