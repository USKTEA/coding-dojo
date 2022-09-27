import java.util.Scanner;

public class Solution {
    private int length;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 한변 길이: ");

        length = scanner.nextInt();

        System.out.println("나선형 배열: ");

        int[][] matrix = makeMatrix(length);

        for (int i = 0; i < length; i += 1) {
            for (int j = 0; j < length; j += 1) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public int[][] makeMatrix(int length) {
        int[][] matrix = new int[length][length];

        matrix = fillMatrix(matrix, length, 0, 0);

        return matrix;
    }

    public int[][] fillMatrix(int[][] matrix, int currentLength, int startNumber, int startIndex) {
        int number = startNumber;
        int finalNumber = startNumber + (currentLength - startIndex) * 4 - 4 - 1;
        int y = finalNumber;

        if (startNumber == length * length - 1) {
            matrix[startIndex][startIndex] = startNumber;

            return matrix;
        }

        for (int i = startIndex; i < currentLength; i += 1) {
            for (int j = startIndex; j < currentLength; j += 1) {
                if (i != startIndex && j == startIndex) {
                    matrix[i][j] = finalNumber;
                    finalNumber -= 1;

                    continue;
                }

                if (i == currentLength -1) {
                    matrix[i][j] = finalNumber;
                    finalNumber -= 1;

                    continue;
                }

                if (i != startIndex && j != currentLength -1) {
                    continue;
                }

                matrix[i][j] = number;
                number += 1;
            }
        }

        if (y == length * length - 1) {
            return matrix;
        }

        return fillMatrix(matrix, currentLength - 1, y + 1, startIndex + 1);
    }
}
