import java.util.Scanner;
public class App10 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        String s;
        char c;
        System.out.println("Nhap vao ki tu: ");
        c = sc.nextLine();
        System.out.println("Nhap vao xau: ");
        s = sc.nextLine();
        int d = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == c)
            {
                d++;
            }
        }
        System.out.println("Ki tu" + c + " xuat hien" + d + "  lan");
        sc.close();
    }
    }
