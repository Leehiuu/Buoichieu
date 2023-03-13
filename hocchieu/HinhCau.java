package hocchieu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

    interface HinhHoc3D {
        double tinhTheTich();
    }

    class HinhCau implements HinhHoc3D {
        private double banKinh;

        public HinhCau(double banKinh) {
            this.banKinh = banKinh;
        }

        @Override
        public double tinhTheTich() {
            return 4 * Math.PI * banKinh * banKinh * banKinh / 3;
        }
    }

    class HinhLapPhuong implements HinhHoc3D {
        private double canh;

        public HinhLapPhuong(double canh) {
            this.canh = canh;
        }

        @Override
        public double tinhTheTich() {
            return canh * canh * canh;
        }
    }
    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<HinhHoc3D> arrHinh = new ArrayList<>();
            System.out.print("Nhap so luong hinh: ");
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.printf("Nhap hinh thu %d (1 - HinhCau, 2 - HinhLapPhuong): ", i + 1);
                int type = scanner.nextInt();
                if (type == 1) {
                    System.out.print("Nhap ban kinh: ");
                    double banKinh = scanner.nextDouble();
                    arrHinh.add(new HinhCau(banKinh));
                } else if (type == 2) {
                    System.out.print("Nhap canh: ");
                    double canh = scanner.nextDouble();
                    arrHinh.add(new HinhLapPhuong(canh));
                }
            }

            // In ra hinh co the tich nho nhat
            HinhHoc3D hinhNhoNhat = Collections.min(arrHinh, (h1, h2) -> Double.compare(h1.tinhTheTich(), h2.tinhTheTich()));
            System.out.println("Hinh co the tich nho nhat:");
            System.out.println(hinhNhoNhat.getClass().getSimpleName());
            System.out.println("The tich: " + hinhNhoNhat.tinhTheTich());

            // Tinh trung binh cong the tich cac hinh
            double tongTheTich = 0;
            for (HinhHoc3D h : arrHinh) {
                tongTheTich += h.tinhTheTich();
            }
            double trungBinhCongTheTich = tongTheTich / n;
            System.out.println("Trung binh cong the tich cac hinh: " + trungBinhCongTheTich);
        }
    }
