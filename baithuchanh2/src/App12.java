import java.util.Scanner;
public class App12 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Nhap vao so hang, cot cua mang: ");
        m = sc.nextInt();
        n = sc.nextInt();
        int a[][] = new int[m][n];
        int max = -9999;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.println("Nhap vao a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
                if (a[i][j] > max)
                {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Phan tu co gia tri lon nhat la: " + max);
        sc.close();
    }
}
