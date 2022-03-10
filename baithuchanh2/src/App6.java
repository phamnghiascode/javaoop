import java.util.Scanner;
public class App6 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a, gt = 1;
        System.out.println("Nhap vao a: ");
        a = sc.nextInt();
        do
        {
            gt *= a;
            a--;
        } while(a > 1);
        System.out.print("Giai thua cua la: " + gt);
        sc.close();
    }
    
}
