package hocthu2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DanhBa {
    public static void main(String[] args) {
        Map<String, String> danhBa = new HashMap<>(); // Tạo map lưu trữ danh bạ người dùng

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("--- QUẢN LÝ DANH BẠ ---");
            System.out.println("1. Thêm danh bạ");
            System.out.println("2. Cập nhật tên danh bạ");
            System.out.println("3. Xoá danh bạ theo số điện thoại");
            System.out.println("4. Xem toàn bộ danh bạ");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    themDanhBa(danhBa, scanner);
                    break;
                case 2:
                    capNhatDanhBa(danhBa, scanner);
                    break;
                case 3:
                    xoaDanhBa(danhBa, scanner);
                    break;
                case 4:
                    xemToanBoDanhBa(danhBa);
                    break;
                case 5:
                    System.out.println("Đã thoát chương trình quản lý danh bạ");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại");
                    break;
            }

        } while (choice != 5);
    }

    // Phương thức thêm danh bạ mới vào map
    public static void themDanhBa(Map<String, String> danhBa, Scanner scanner) {
        scanner.nextLine(); // Đọc bỏ ký tự Enter còn lại sau khi nhập số điện thoại
        System.out.print("Nhập số điện thoại: ");
        String soDienThoai = scanner.nextLine();

        if (danhBa.containsKey(soDienThoai)) {
            System.out.println("Số điện thoại đã tồn tại trong danh bạ, vui lòng nhập lại");
            return;
        }

        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();

        danhBa.put(soDienThoai, hoTen);
        System.out.println("Thêm danh bạ thành công");
    }
    public static void capNhatDanhBa(Map<String, String> danhBa, Scanner scanner) {
        scanner.nextLine(); // Đọc bỏ ký tự Enter còn lại sau khi nhập số điện thoại
        System.out.print("Nhập số điện thoại cần cập nhật: ");
        String soDienThoai = scanner.nextLine();

        if (!danhBa.containsKey(soDienThoai)) {
            System.out.println("Số điện thoại không tồn tại trong danh bạ, vui lòng nhập lại");
            return;
        }

        System.out.print("Nhập tên mới: ");
        String hoTenMoi = scanner.nextLine();

        danhBa.put(soDienThoai, hoTenMoi);
        System.out.println("Cập nhật danh bạ thành công");
    }

    // Phương thức xoá danh bạ theo số điện thoại
    public static void xoaDanhBa(Map<String, String> danhBa, Scanner scanner) {
        scanner.nextLine(); // Đọc bỏ ký tự Enter còn lại sau khi nhập số điện thoại
        System.out.print("Nhập số điện thoại cần xoá: ");
        String soDienThoai = scanner.nextLine();

        if (!danhBa.containsKey(soDienThoai)) {
            System.out.println("Số điện thoại không tồn tại trong danh bạ, vui lòng nhập lại");
            return;
        }

        danhBa.remove(soDienThoai);
        System.out.println("Xoá danh bạ thành công");
    }

    // Phương thức xem toàn bộ danh bạ
    public static void xemToanBoDanhBa(Map<String, String> danhBa) {
        System.out.println("--- DANH BẠ NGƯỜI DÙNG ---");
        for (Map.Entry<String, String> entry : danhBa.entrySet()) {
            System.out.println(entry.getValue() + " - " + entry.getKey());
        }
        System.out.println("------------------------");
    }
}


