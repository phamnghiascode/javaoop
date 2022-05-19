import java.util.TreeSet;
import java.util.Scanner;
public class app69{
public static void main(String[] args){
    TreeSet<Integer> tree = new TreeSet<>();
    int n;
    Scanner sc = new Scanner(System.in);
    tree.add(0);
    tree.add(3);
    tree.add(1);
    tree.add(4);
    tree.add(2);
    tree.add(8);
    System.out.println("Cac phan tu trong integer: ");
    System.out.println(tree);
    System.out.println("Nhap phan tu can them: ");
    n = sc.nextInt();
    if (!tree.contains(n)){
        tree.add(n);
        System.out.println("Cac phan tu sau khi add: ");
        System.out.println(tree);
    } else System.out.println("Phan tu da ton tai");
}
}
