import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {

    public static String giaiPhuongTrinhBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0 && c == 0) return "Phuong trinh bac nhat vs vo so nghiem";
            else if (b == 0 && c != 0) return "Phuong trinh vo nghiem";
            else return "Phuong trinh bac nhat co nghiem: " + (-c / b);
        } else {
            double delta = (b * b) - (4 * c * a);
            if (delta < 0) return "Phuong trinh bac 2 VN";
            else if (delta == 0) {
                double x = -b / (2 * a);
                return "Phuong trinh bac 2 co nghiem kep: " + x;
            } else {
                double x1 = (-b + Math.sqrt(delta) / (2 * a));
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "Phuong trinh bac 2 co 2 nghiem: " + x1 + "," + x2;
            }
        }
    }

    public static void main(String[] args) {


        //nang cao
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap vao so a");
        double a = sc.nextDouble();
        System.out.println("Vui long nhap vao so b");
        double b = sc.nextDouble();
        System.out.println("Vui long nhap vao so c");
        double c = sc.nextDouble();
        String message = giaiPhuongTrinhBac2(a, b, c);
        System.out.println(message);

    }
}
