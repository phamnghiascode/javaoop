import java.util.HashSet;
import java.util.Scanner;

public class app54 {
    public static void main(String[] args){
        int n;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);
        System.out.println("Cac phan tu trong hashSetInteger: ");
        System.out.println(hashSetInteger);
        System.out.println("Nhap phan tu can them: ");
        n = sc.nextInt();
        sc.close();
        if (!hashSetInteger.contains(n)){
            hashSetInteger.add(n);
            System.out.println("Added!");
            System.out.println("Cac phan tu sau khi them: ");
            System.out.println(hashSetInteger);

        }   else {
            System.out.println("Da co phan tu " + n);

        }

    }
}
