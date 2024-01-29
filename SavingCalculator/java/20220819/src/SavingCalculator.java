import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class SavingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double taxRatio = 0.154;

        System.out.println("적금 이자 계산기");
        System.out.println("월적립액을 입력해주세요(원):");

        int savings = scanner.nextInt();

        System.out.println("적금 기간을 입력해주세요(년):");

        int duration = scanner.nextInt();
        int totalMonth = duration * 12;

        System.out.println("연이자율을 입력해주세요(%):");

        double interestRate = scanner.nextFloat();
        double interestRateToNumber = interestRate / 100;
        double interestPerMonth = interestRateToNumber / 12;

        int savingsWithoutInterest = savings * totalMonth;
        int totalSavings = (int)(savings * (1 + interestPerMonth) * ((Math.pow(1 + interestPerMonth, totalMonth)) - 1) / interestPerMonth);
        int interestWithoutTax = totalSavings - savingsWithoutInterest;
        int interestTax = (int)((totalSavings - savingsWithoutInterest) * taxRatio);
        int interestAfterTax = interestWithoutTax - interestTax;
        int savingsAfterTax = savingsWithoutInterest + interestAfterTax;

        String savingWithoutInterestWithComma = NumberFormat.getInstance().format(savingsWithoutInterest);
        String interestAfterTaxWithComma = NumberFormat.getInstance().format(interestAfterTax);
        String savingAfterTaxWithComma = NumberFormat.getInstance().format(savingsAfterTax);

        System.out.println("원금합계: " + savingWithoutInterestWithComma + "원");
        System.out.println("세후이자: " + interestAfterTaxWithComma + "원");
        System.out.println("세후 총 수령액: " + savingAfterTaxWithComma + "원");
    }
}
