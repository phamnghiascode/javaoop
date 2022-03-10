import java.util.Scanner;
public class App11 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so phan tu cua mang: ");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    System.out.println("Day so sau khi duoc sap xep la: ");
    for (int i = 0; i < n; i++)
    {
        System.out.println(a[i]);
    }
    sc.close();
    }
    
}
