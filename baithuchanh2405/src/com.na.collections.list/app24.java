import java.util.ArrayList;
import java.util.Scanner;

public class app24{
    public static void main(String[] args){
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu cua arrayList: " );
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + i + ": ");
            n = sc.nextInt();
            arrListInteger.add(n);
        }
        sc.close();
        int max = arrListInteger.get(0);
        for (int i = 1; i < arrListInteger.size(); i++){
            if (arrListInteger.get(i).compareTo(max) > 0){
                max = arrListInteger.get(i);
            }
        }
    }
}