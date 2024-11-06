import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so phan tu cua day Fibonacci: ");
        int n = scanner.nextInt();
        
        int first = 0, second = 1;

        System.out.println("Day Fibonacci voi " + n + " phan tu dau tien:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
            int next = first + second;
            first = second;
            second = next;
        }
        
        scanner.close();
    }
}
