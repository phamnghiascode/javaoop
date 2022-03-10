import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap vao a, b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Tong la: " + (a + b));
        System.out.println("Hieu la: " + (a - b));
        System.out.println("Tich la: " + (a * b));
        System.out.println("Thuong la: " + (a / b));
        if (a > b) {
            System.out.println("a > b");
        }
        else if (a < b)
        {
            System.out.println("a < b");
        }
        else System.out.println("a = b");
        sc.close();
    }
}
