import java.util.Scanner;
import java.util.TreeSet;
public class app69 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(3);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);
        System.out.println("Cac phan tu trong treeSetInteger: ");
        System.out.println(treeSetInteger);
        System.out.println("Nhap phan tu can them: ");
        n = sc.nextInt();
        sc.close();
        if (!treeSetInteger.contains(n)){
            treeSetInteger.add(n);
            System.out.println("Added");
            System.out.println("Cac phan tu sau khi them");
            System.out.println(treeSetInteger);

        } else System.out.println("Phan tu da ton tai!");
        
}
}
