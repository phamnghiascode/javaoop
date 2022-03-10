import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int a;
       String s;
        System.out.println("Nhap vao ten cua ban: ");
        s = sc.nextLine();
        System.out.println("Tuoi cua ban: ");
        a = sc.nextInt();
        if (a < 16)
        {
            System.out.println( s + " o do tuoi vi thanh nien");
        }
        else if (a >=16 && a < 18)
        {
            System.out.println( s + " o do tuoi truong thanh");
        }
        else System.out.println( s + " da gia :<");
        sc.close();
    }
}
