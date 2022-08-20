import java.util.Scanner;

public class BMI {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double height = 0;
        double weight = 0;
        double BMI = 0;

        System.out.println("BMI 측정기");
        System.out.print("신장(m): ");
        height = scanner.nextDouble();
        System.out.print("체중(kg): ");
        weight = scanner.nextDouble();

        BMI = weight / (height*height);

        if(BMI <= 18.5){
            System.out.println("비만도 결과: 저체중");
        }
        if(BMI > 18.5 && BMI <= 23){
            System.out.println("비만도 결과: 정상");
        }
        if(BMI > 23 && BMI <= 25){
            System.out.println("비만도 결과: 과체중");
        }
        if(BMI > 25){
            System.out.println("비만도 결과: 비만");
        }

        System.out.println(BMI);
    }
}
