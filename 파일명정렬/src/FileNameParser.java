import java.util.List;

public class FileNameParser {
    public List<String> parse(String fileName) {
        String head = parseHead(fileName);
        String number = parseNumber(fileName.substring(head.length()));
        String tail = fileName.substring(head.length() + number.length());

        return List.of(head, number, tail);
    }

    public String parseNumber(String fileNameAfterHead) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < fileNameAfterHead.length(); i += 1) {
            if (stringBuilder.length() > 5) {
                return stringBuilder.toString();
            }

            char letter = fileNameAfterHead.charAt(i);

            if (isNumber(letter)) {
                stringBuilder.append(letter);
            }

            if (!isNumber(letter)) {
                return stringBuilder.toString();
            }
        }

        return stringBuilder.toString();
    }

    public String parseHead(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < fileName.length(); i += 1) {
            String letter = Character.toString(fileName.charAt(i));
            int asciiCode = letter.codePointAt(0);

            if (isNumber(asciiCode)) {
                break;
            }

            stringBuilder.append(letter);
        }

        return stringBuilder.toString();
    }

    private boolean isNumber(int asciiCode) {
        return asciiCode >= 48 && asciiCode <= 57;
    }
}
