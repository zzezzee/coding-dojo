import java.text.NumberFormat;
import java.util.Scanner;

public class SavingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat numberFormat = NumberFormat.getInstance();

        int monthlySaving = 0;
        int savingYear = 0;
        double taxWithInterest = 0.846;
        double interestRatePerYear = 0;

        System.out.println("적금 이자 계산기");
        System.out.println("월적립액을 입력해주세요(원):");

        monthlySaving = scanner.nextInt();

        System.out.println("적금 기간을 입력해주세요(년):");

        savingYear = scanner.nextInt();

        System.out.println("연이자율을 입력해주세요(%):");

        interestRatePerYear = scanner.nextDouble();

        int savingYearToMonth = savingYear * 12;
        int sumOfMonthlySaving = monthlySaving * savingYearToMonth;
        double r = interestRatePerYear / 100 / 12;
        double TotalMoneyBeforeTax = monthlySaving * (1 + r) * (Math.pow((1 + r), savingYearToMonth) - 1) / r;
        double afterTaxInterest = (TotalMoneyBeforeTax - sumOfMonthlySaving) * taxWithInterest;
        double TotalMoneyAfterTax = sumOfMonthlySaving + afterTaxInterest;

        System.out.print("원금 합계: ");
        System.out.println(numberFormat.format(sumOfMonthlySaving) + "원");

        System.out.print("세후 이자: ");
        System.out.println(numberFormat.format((int) afterTaxInterest) + "원");

        System.out.print("세후 총 수령액: ");
        System.out.println(numberFormat.format((int) TotalMoneyAfterTax) + "원");
    }
}
