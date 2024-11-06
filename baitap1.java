import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(50) + 1;  // Số ngẫu nhiên từ 1 đến 50
        int guess = 0;
        
        System.out.println("Chào mừng bạn đến với trò chơi đoán số!");
        System.out.println("Hãy đoán một số từ 1 đến 50:");
        
        while (guess != randomNumber) {
            System.out.print("Nhập số của bạn: ");
            guess = scanner.nextInt();
            
            if (guess < randomNumber) {
                System.out.println("Số của bạn thấp hơn. Hãy đoán số lớn hơn.");
            } else if (guess > randomNumber) {
                System.out.println("Số của bạn cao hơn. Hãy đoán số nhỏ hơn.");
            } else {
                System.out.println("Chúc mừng! Bạn đã đoán đúng số " + randomNumber);
            }
        }
        
        scanner.close();
    }
}

