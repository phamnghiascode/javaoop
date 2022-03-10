import java.util.Scanner;
public class App5 {
    public static void main(String[] arg) throws Exception{
    Scanner sc = new Scanner(System.in);
    int a, t = 0;
    while (t <= 100)
    {
        System.out.println("Nhap vao so nguyen: ");
        a = sc.nextInt();
        t += a;
    }
    System.out.println("Tong cac so vua nhap la: " + t);
    sc.close();
}}
