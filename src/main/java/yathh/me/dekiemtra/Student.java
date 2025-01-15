/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yathh.me.dekiemtra;

import java.util.Date;

/**
 *
 * @author p15v
 */
public class Student extends Person {

    String maSV;
    String email;
    float diemTK;

    public Student() {
    }

    public Student(String masinhvien, String email, float diemtongket,
            String hoten, String ngaysinh, String diachi, String gioitinh) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.maSV = masinhvien;
        this.email = email;
        this.diemTK = diemtongket;
    }

    @Override
    public void thongTin() {
        super.thongTin();
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Email: " + email);
        System.out.println("Diem tong ket: " + diemTK);
    }

    public String getMasinhvien() {
        return maSV;
    }

    public void setMasinhvien(String masinhvien) {
        this.maSV = masinhvien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemtongket() {
        return diemTK;
    }

    public void setDiemtongket(float diemtongket) {
        this.diemTK = diemtongket;
    }

    public String getHoten() {
        return hoTen;
    }

    public void setHoten(String hoten) {
        this.hoTen = hoten;
    }

    public String getNgaysinh() {
        return ngaySinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaySinh = ngaysinh;
    }

    public String getDiachi() {
        return diaChi;
    }

    public void setDiachi(String diachi) {
        this.diaChi = diachi;
    }

    public String getGioitinh() {
        return gioiTinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioiTinh = gioitinh;
    }
    
    
}
