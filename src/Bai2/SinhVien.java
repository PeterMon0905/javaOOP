package Bai2;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String mssv;
    private float diemNNLTCPP;
    private float diemLTHDT;
    private float diemANM;
    private float diemTB;
    private String xepLoai;

    public SinhVien () {
        hoTen = "";
        mssv = "";
        diemNNLTCPP = 0;
        diemLTHDT = 0;
        diemANM = 0;
        diemTB = tinhDiemTB();
        xepLoai = tinhXepLoai();
    }
    public SinhVien (String hoTen, String mssv, float diemNNLTCPP, float diemLTHDT, float diemANM){
        this.hoTen = hoTen;
        this.mssv = mssv;
        this.diemNNLTCPP = diemNNLTCPP;
        this.diemLTHDT = diemLTHDT;
        this.diemANM = diemANM;
        diemTB = tinhDiemTB();
        xepLoai = tinhXepLoai();
    }
    public SinhVien (SinhVien sinhVien) {
        this.hoTen = sinhVien.hoTen;
        this.mssv = sinhVien.mssv;
        this.diemNNLTCPP = sinhVien.diemNNLTCPP;
        this.diemLTHDT = sinhVien.diemLTHDT;
        this.diemANM = sinhVien.diemANM;
        this.diemTB = sinhVien.diemTB;
        this.xepLoai = sinhVien.xepLoai;
    }
    public void setHoTen (String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen () {
        return hoTen;
    }
    public void setMssv (String mssv) {
        this.mssv = mssv;
    }
    public String getMssv () {
        return mssv;
    }
    public void setDiemNNLTCPP (float diemNNLTCPP) {
        this.diemNNLTCPP = diemNNLTCPP;
    }
    public float getDiemNNLTCPP () {
        return diemNNLTCPP;
    }
    public void setDiemLTHDT (float diemLTHDT) {
        this.diemLTHDT = diemLTHDT;
    }
    public float getDiemLTHDT () {
        return diemLTHDT;
    }
    public void setDiemANM (float diemANM) {
        this.diemANM = diemANM;
    }
    public float getDiemANM () {
        return diemANM;
    }
    public float getDiemTB () {
        return diemTB;
    }
    public String getXepLoai () {
        return xepLoai;
    }
    public float tinhDiemTB () {
        return (diemNNLTCPP + diemLTHDT + diemANM)/3;
    }

    public String tinhXepLoai () {
        if (diemTB>8 && diemTB<=10)
            return "Giỏi";
        else if (diemTB>6.5 && diemTB<=8)
            return "Khá";
        else if (diemTB>=5 && diemTB<=6.5)
            return "Trung bình";
        else
            return "Không đạt";
    }

    public void nhapThongTin () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Mã số sinh viên: ");
        mssv = scanner.nextLine();
        System.out.print("Điểm NNLTC++: ");
        diemNNLTCPP = scanner.nextFloat();
        System.out.print("Điểm LTHĐT: ");
        diemLTHDT = scanner.nextFloat();
        System.out.print("Điểm ANM: ");
        diemANM = scanner.nextFloat();
        diemTB = tinhDiemTB();
        xepLoai = tinhXepLoai();
    }

    public void hienThiThongTin () {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Mã số sinh viên: " + mssv);
        System.out.println("Điểm NNLTC++: " + diemNNLTCPP);
        System.out.println("Điểm LTHĐT: " + diemLTHDT);
        System.out.println("Điểm ANM: " + diemANM);
        System.out.format("Điểm TB: %1.1f\n", diemTB);
        System.out.println("Xếp loại: " + xepLoai);
        System.out.println();
    }
}
