import java.util.Scanner;

public class bai_tap_tinh_2_so {

    public static void Cong(double a, double b) {
        double kq = a + b;
        System.out.println("Ket qua la " + kq);
    }

    public static void Tru(double a, double b) {
        double kq = a - b;
        System.out.println("Ket qua la " + kq);
    }

    public static void Nhan(double a, double b) {
        double kq = a * b;
        System.out.println("Ket qua la " + kq);
    }

    public static void Chia(double a, double b) {
        if (b == 0) {
            System.out.println("Phep chia khong the thuc hien voi so b bang 0");
        } else {
            double kq = a / b;
            System.out.println("Ket qua la " + kq);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so a");
        double a = sc.nextDouble();
        System.out.println("Moi nhap vao so b");
        double b = sc.nextDouble();
        System.out.println("Moi nhap vao phep tinh ma ban muon (+, -, *, /)");
        Scanner scString = new Scanner(System.in);
        String phepTinh = scString.nextLine();
        switch (phepTinh) {
            case "+":
                Cong(a, b);
                break;
            case "-":
                Tru(a, b);
            case "*":
                Nhan(a, b);
                break;
            case "/":
                Chia(a, b);
                break;
            default:
                System.out.println("Phep tinh khong hop le");
                break;
        }
    }
}
