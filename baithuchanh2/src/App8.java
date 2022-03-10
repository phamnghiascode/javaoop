import java.util.Scanner;
public class App8 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so phan tu mang: ");
        n = sc.nextInt();
        int a[] = new int[n];
        int t = 0;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhap vao a [" + i + "]: ");
            a[i] = sc.nextInt();
            t += a[i];
        }
        System.out.println("Trung binh cong cua cac so vua nhap la: " + (float)(t / n));
        sc.close();
    }
    
}
