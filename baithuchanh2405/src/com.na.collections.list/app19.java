import java.util.ArrayList;
import java.util.ListIterator;

public class app19 {
    public static void main(String[] args){
        ArrayList<Character> arrListChar = new ArrayList<>();
        arrListChar.add('A');
        arrListChar.add('B');
        arrListChar.add('C');
        arrListChar.add('D');
        ListIterator<Character> listIterator = arrListChar.listIterator();
        System.out.println("Cac phan tu co trong arrListChar la: ");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        
    }
}
