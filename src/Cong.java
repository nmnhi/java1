import java.util.Objects;

public class Cong {
    public static int CongInt(int x, int y) {
        return x + y;
    }

    public static void kiemTraGioiTinh(String gioiTinh) {
        if (Objects.equals(gioiTinh, "female"))
            System.out.println("Xin chao toi la nhan vien Nam");
        else if (Objects.equals(gioiTinh, "male"))
            System.out.println("Xin chao toi la nhan vien Nu");
        else System.out.println("Toi khong hieu ban dang nhap gi");
    }

    public static void main(String[] args) {
        int kg = CongInt(1, 2);
        System.out.println("Tong cac so la: " + kg);
        kiemTraGioiTinh("female");
    }
}
