import java.util.Objects;
import java.util.Scanner;

public class TinhSoNhapTuBanPhim {

    public static String Tinh(double x, double y, String z) {
        switch (z) {
            case "+": {
                double kq = x + y;
                return "Ket qua cua " + x + z + y + "= " + kq;
            }
            case "-": {
                double kq1 = x - y;
                return "Ket qua cua " + x + z + y + "= " + kq1;
            }
            case "*": {
                double kq2 = x * y;
                return "Ket qua cua " + x + z + y + "= " + kq2;

            }
            case "/": {
                double kq3 = x / y;
                return "Ket qua cua " + x + z + y + "= " + kq3;
            }
            default: {
                return "Khong co ket qua dc tim thay";

            }
        }
    }

    public static String TinhToan(double a, double b, String c) {
        if (b == 0) {
            if (Objects.equals(c, "/")) {
                return "Khong thuc hien duoc phep tinh";
            } else {
                String kq = Tinh(a, b, c);
                return kq;
            }
        } else {
            String kq1 = Tinh(a, b, c);
            return kq1;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a");
        double a = sc.nextDouble();
        System.out.println("Nhap vao so b");
        double b = sc.nextDouble();
        System.out.println("Nhap vao phep toan ban muon thuc hien (+, -, *, /)");
        String c = sc.next();
        String d = TinhToan(a, b, c);
        System.out.println(d);

    }
}
