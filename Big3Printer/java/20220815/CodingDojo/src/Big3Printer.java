import java.util.Scanner;

public class Big3Printer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("할 일1: ");
        String todo1 = scanner.next();

        System.out.print("할 일2: ");
        String todo2 = scanner.next();

        System.out.print("할 일3: ");
        String todo3 = scanner.next();

        System.out.println("오늘의 할 일 Big3는\n" + "1. " + todo1 + "\n"+ "2. " + todo2 + "\n" + "3. " + todo3);
    }
}
