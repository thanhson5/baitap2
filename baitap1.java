import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(50) + 1;  // Số ngẫu nhiên từ 1 đến 50
        int guess = 0;
        
        System.out.println("Chao mung ban den voi tro choi dem so!");
        System.out.println("Hay doan mot so tu 1 den 50:");
        
        while (guess != randomNumber) {
            System.out.print("Nhap so cua ban: ");
            guess = scanner.nextInt();
            
            if (guess < randomNumber) {
                System.out.println("So cua ban thap hon. Hay doan so lon hon.");
            } else if (guess > randomNumber) {
                System.out.println("So cua ban cao hon. Hay doan so nho hon.");
            } else {
                System.out.println("Chuc mung! Ban da doan trung so " + randomNumber);
            }
        }
        
        scanner.close();
    }
}

