package Bai2;

import java.util.*;

public class DSSinhVien {
    ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

    public void nhapDSSV (int n) {
        for (int i=0; i<n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i+1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhapThongTin();
            danhSachSinhVien.add(sv);
        }
    }

    public void inDSSV () {
        System.out.println("XEP LOAI SINH VIEN");
        System.out.println("HỌ VÀ TÊN           ĐIỂM NNLTC++   ĐIỂM LTHDT     ĐIỂM ANM       ĐIỂM TB        XẾP LOẠI");
        for (SinhVien sv : danhSachSinhVien) {
            System.out.printf("%-20s%-15.1f%-15.1f%-15.1f%-15.1f%s%n", sv.getHoTen(), sv.getDiemNNLTCPP(), sv.getDiemLTHDT(), sv.getDiemANM(), sv.getDiemTB(), sv.getXepLoai());
        }
        int demGioi=0, demKha=0, demTrungBinh=0, demKhongDat=0;
        for (SinhVien sv : danhSachSinhVien) {
            String xepLoai = sv.getXepLoai();
            switch (xepLoai) {
                case "Giỏi":
                    demGioi++;
                    break;
                case "Khá":
                    demKha++;
                    break;
                case "Trung bình":
                    demTrungBinh++;
                    break;
                case "Không đạt":
                    demKhongDat++;
                    break;
            }
        }
        System.out.println("\nTONG KET");
        System.out.println("Tổng số sinh viên xếp loại Giỏi: " + demGioi);
        System.out.println("Tổng số sinh viên xếp loại Khá: " + demKha);
        System.out.println("Tổng số sinh viên xếp loại Trung bình: " + demTrungBinh);
        System.out.println("Tổng số sinh viên xếp loại Không đạt: " + demKhongDat);
    }

    public void sapXepDSSV () {
        danhSachSinhVien.sort(Comparator.comparing(SinhVien::getMssv));
        System.out.println("Đã sắp xếp danh sách!");
    }

    public void timSinhVienTheoTen (String hoTen) {
        hoTen = hoTen.toLowerCase();
        boolean timThay = false;
        System.out.println("Kết quả:");
        for (SinhVien sv : danhSachSinhVien) {
            String tenSinhVien = sv.getHoTen().toLowerCase();
            if (tenSinhVien.contains(hoTen)) {
                sv.hienThiThongTin();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy tên sinh viên!");
        }
    }

    // hiển thị danh sách sinh viên có điểm trung bình cao hơn hoặc bằng điểm vừa nhập
    public void timSinhVienTheoDiem (float diemTB) {
        for (SinhVien sv : danhSachSinhVien) {
            if (diemTB <= sv.getDiemTB()) {
                System.out.println("Kết quả:");
                sv.hienThiThongTin();
            }
        }
    }

    public void sinhVienCoDiemTBCaoNhat () {
        float diemTBCaoNhat = 0;
        for (SinhVien sv : danhSachSinhVien) {
            if (diemTBCaoNhat < sv.getDiemTB())
                diemTBCaoNhat = sv.getDiemTB();
        }
        System.out.println("Kết quả:");
        for (SinhVien sv : danhSachSinhVien) {
            if (diemTBCaoNhat == sv.getDiemTB()) {
                sv.hienThiThongTin();
            }
        }
    }
}
