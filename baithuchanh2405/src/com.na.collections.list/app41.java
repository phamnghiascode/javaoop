import java.util.LinkedList;
import java.util.Scanner;

public class app41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Thang 1");
        linkedList.add("Thang 2");
        linkedList.add("Thang 3");
        linkedList.add("Thang 4");
        linkedList.add("Thang 5");
        linkedList.add("Thang 6");
        linkedList.add("Thang 7");
        linkedList.add("Thang 8");
        linkedList.add("Thang 9");
        linkedList.add("Thang 10");
        linkedList.add("Thang 11");
        linkedList.add("Thang 12");

        System.out.println("Nhap vao chi so phan tu can lay: ");
        int index = sc.nextInt();
        sc.close();
        if(index < 0 || index > linkedList.size()-1){
            System.out.println("0 < chi so < " + (linkedList.size()-1) );
        } else {
            String node = linkedList.get(index);
            System.out.println("Phan tu co chi so = " + index + " trong linkedList la " + node);


        }
        String fisrtNode = linkedList.getFirst();
        String lastNode = linkedList.getLast();
        System.out.println("\nPhan tu dau tien va cuoi cung trong list lan luot la: " + fisrtNode +  "; " + lastNode);

    }
}
