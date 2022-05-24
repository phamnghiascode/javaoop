import java.util.Scanner;

public class sinhvien {
    private String name;
    private Float score;
    public sinhvien(){}
    public sinhvien(String name, Float score){
        this.name = name;
        this.score = score;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setScore(Float score){
        this.score = score;
    }
    public void nhap(){
        System.out.print("Nhap ten: ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        setName(n);
        System.out.print("Nhap diem: ");
        Float s = sc.nextFloat();
        setScore(s);
        sc.close();
    }
}
