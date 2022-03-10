import java.util.Scanner;
public class App9 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhap vao xau s: ");
        s = sc.nextLine();
        sc.close();
        int i, t = 0, h = 0;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            {
                t++;
            }
            else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
            {
                h++;
            }
        }
        System.out.println("So ki tu hoa la: " + h);
        System.out.println("So ki tu thuong la: "+ t);


    }
    
}
