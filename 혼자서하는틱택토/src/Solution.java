import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public int solution(String[] board) {
        Map<String, Integer> pieces = countPieces(board);

        if (!checkPiecesMatchRule(pieces)) {
            return 0;
        }

        Integer noughts = pieces.get("O");
        Integer crosses = pieces.get("X");

        int bingos = 0;

        String[] rows = rows(board);
        bingos += countBingos(rows);

        if (bingos > 1) {
            return 0;
        }

        String[] columns = columns(board);
        bingos += countBingos(columns);

        if (bingos > 2) {
            return 0;
        }

        String[] crossLines = crosses(board);
        bingos += countBingos(crossLines);

        if (bingos > 2) {
            return 0;
        }

        if (isFinishedBy("O", rows, columns, crossLines)) {
            if (Objects.equals(noughts, crosses)) {
                return 0;
            }
        }

        if (isFinishedBy("X", rows, columns, crossLines)) {
            if (!Objects.equals(noughts, crosses)) {
                return 0;
            }
        }

        return 1;
    }

    private boolean isFinishedBy(String piece, String[]... lines) {
        boolean result = false;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < lines[0].length; i += 1) {
            stringBuilder.append(piece);
        }

        String finishCondition = stringBuilder.toString();

        for (int i = 0; i < lines.length; i += 1) {
            for (String line: lines[i]) {
                if (Objects.equals(line, finishCondition)) {
                    result = true;

                    break;
                }
            }

            if (result == true) {
                break;
            }
        }

        return result;
    }

    private int countBingos(String[] lines) {
        int count = 0;

        for (String line: lines) {
            if (Objects.equals(line, "OOO") || Objects.equals(line, "XXX")) {
                count += 1;
            }
        }

        return count;
    }

    private String[] rows(String[] board) {
        return board;
    }

    public String[] crosses(String[] board) {
        String[] crosses = new String[2];

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < board.length; i += 1) {
            stringBuilder.append(board[i].charAt(i));
        }

        crosses[0] = stringBuilder.toString();

        stringBuilder = new StringBuilder();

        for (int i = 0; i < board.length; i += 1) {
            stringBuilder.append(board[i].charAt(board.length - i - 1));
        }

        crosses[1] = stringBuilder.toString();

        return crosses;
    }

    public String[] columns(String[] board) {
        String[] columns = new String[3];

        for (int i = 0; i < board[0].length(); i += 1) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int j = 0; j < board.length; j += 1) {
                stringBuilder.append(board[j].charAt(i));
            }

            columns[i] = stringBuilder.toString();
        }

        return columns;
    }

    public Map<String, Integer> countPieces(String[] board) {
        Map<String, Integer> pieces = new HashMap<>();

        for (int i = 0; i < board.length; i += 1) {
            for (int j = 0; j < board[i].length(); j += 1) {
                String piece = String.valueOf(board[i].charAt(j));

                if (Objects.equals(piece, ".")) {
                    continue;
                }

                if (!pieces.containsKey(piece)) {
                    pieces.put(piece, 1);

                    continue;
                }

                pieces.put(piece, pieces.get(piece) + 1);
            }
        }

        if (!pieces.containsKey("X")) {
            pieces.put("X", 0);
        }

        if (!pieces.containsKey("O")) {
            pieces.put("O", 0);
        }

        return pieces;
    }

    public boolean checkPiecesMatchRule(Map<String, Integer> pieces) {
        Integer noughts = pieces.get("O");
        Integer crosses = pieces.get("X");

        if (noughts < crosses) {
            return false;
        }

        if (noughts -1 > crosses) {
            return false;
        }

        return true;
    }
}
