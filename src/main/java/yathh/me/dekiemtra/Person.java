/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yathh.me.dekiemtra;

/**
 *
 * @author p15v
 */
public class Person {
    String hoTen;
    String ngaySinh;
    String diaChi;
    String gioiTinh;

    public Person() {
    }
    
    public Person(String hoten, String ngaysinh, String diachi, String gioitinh) {
        this.hoTen = hoten;
        this.ngaySinh = ngaysinh;
        this.diaChi = diachi;
        this.gioiTinh = gioitinh;
    }
    
    public void thongTin(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Gioi tinh: " + gioiTinh);
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
