package Bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DSSinhVien dssv = new DSSinhVien();
        while (true) {
            System.out.println("===========================================");
            System.out.println("|| DANH SÁCH SINH VIÊN                   ||");
            System.out.println("|| 1. Nhập thông tin                     ||");
            System.out.println("|| 2. In danh sách                       ||");
            System.out.println("|| 3. Sắp xếp danh sách theo thứ tự MSSV ||");
            System.out.println("|| 4. Tìm kiếm sinh viên theo tên        ||");
            System.out.println("|| 5. Tìm kiếm sinh viên theo điểm       ||");
            System.out.println("|| 6. Các sinh viên có điểm TB cao nhất  ||");
            System.out.println("|| 7. Thoát                              ||");
            System.out.println("===========================================");
            System.out.print("Nhập vào yêu cầu của bạn(1-7): ");
            int choice = scanner.nextInt();
            if (choice>=1 && choice<=7) {
                switch (choice) {
                    case 1:
                        System.out.print("Nhập số lượng sinh viên: ");
                        int n = scanner.nextInt();
                        dssv.nhapDSSV(n);
                        break;

                    case 2:
                        dssv.inDSSV();
                        break;

                    case 3:
                        dssv.sapXepDSSV();
                        break;

                    case 4:
                        scanner.nextLine();
                        System.out.print("Nhập tên cần tìm kiếm: ");
                        String ten = scanner.nextLine();
                        dssv.timSinhVienTheoTen(ten);
                        break;

                    case 5:
                        System.out.print("Nhập điểm: ");
                        float diem = scanner.nextFloat();
                        dssv.timSinhVienTheoDiem(diem);
                        break;

                    case 6:
                        dssv.sinhVienCoDiemTBCaoNhat();
                        break;

                    case 7:
                        System.exit(0);
                }
            }
            else
                System.out.println("Yêu cầu không đúng, vui lòng nhập lại!");

        }
    }
}
