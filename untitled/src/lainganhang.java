import java.util.Scanner;
public class lainganhang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double laisuat = 1.06;
        System.out.println("nhap so tien gui(trVND)");
        int moneys = scanner.nextInt();
        double tiengui = moneys * 1000000;
        System.out.println("nhap so thang gui:");
        int month = scanner.nextInt();
        if (month <= 0){
            System.out.println(" lua tao a???");
        }
        else {
            for (int i = 1; i<= month; i++ ){
                tiengui = tiengui * laisuat;
            }
        }
        System.out.println(" tien lai sau " + month + " thang la: " + tiengui + " VND");
    }
}
