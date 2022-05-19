import java.util.HashSet;
import java.util.Scanner;
public class app56{
    public static void main(String[] args){
        String name;
        int n;
        HashSet<String> hash = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu ban muon: ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++){
            System.out.print("Nhap phan tu thu " + i + ": ");
            name = sc.nextLine();
            hash.add(name);
        }
        System.out.println("Hash set ban vua nhap la: ");
        System.out.println(hash);
        System.out.print("Nhap element ban muon xoa: ");
        name = sc.nextLine();
        if (hash.contains(name)){
            hash.remove(name);
            System.out.println("Deleted!");
        } else System.out.println("Khong ton tai element " + name);
        System.out.println("So phan tu con lai la: " + hash.size());
        System.out.println(hash);
    }
}
