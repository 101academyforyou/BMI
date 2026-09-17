import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 取得使用者輸入
        double heightCm = getHeight(scanner);
        double weightKg = getWeight(scanner);

        // 2. 進行運算與邏輯判斷
        double bmi = calculateBMI(heightCm, weightKg);
        String status = determineStatus(bmi);

        // 3. 輸出結果
        displayResult(bmi, status);

        scanner.close();
    }

    /**
     * 取得身高
     */
    public static double getHeight(Scanner scanner) {
        System.out.print("請輸入您的身高 (公分)：");
        return scanner.nextDouble();
    }

    /**
     * 取得體重
     */
    public static double getWeight(Scanner scanner) {
        System.out.print("請輸入您的體重 (公斤)：");
        return scanner.nextDouble();
    }

    /**
     * 計算 BMI 值
     */
    public static double calculateBMI(double heightCm, double weightKg) {
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }

    /**
     * 根據衛生福利部標準判斷體重狀態
     */
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "體重過輕";
        } else if (bmi >= 18.5 && bmi < 24) {
            return "正常範圍";
        } else if (bmi >= 24 && bmi < 27) {
            return "過重";
        } else {
            return "肥胖";
        }
    }

    /**
     * 顯示最終結果
     */
    public static void displayResult(double bmi, String status) {
        System.out.printf("您的 BMI 值為：%.2f\n", bmi);
        System.out.println("體重狀態：" + status);
    }
}




