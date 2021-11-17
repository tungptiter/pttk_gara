package com.nminh.garage.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
@Table(name = "ThuLao")
public class ThuLao {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    int soGio;
    Float thanhTien;
    String ghiChu;
    Instant thoiGianTao;

    @ManyToOne
            @JoinColumn(name = "nhan_vien_id")
    NhanVien nhanVien;

    @ManyToOne
            @JoinColumn(name = "nhan_vien_ky_thuat_id")
    NhanVienKyThuat nhanVienKyThuat;

    public ThuLao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }

    public Float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Instant getThoiGianTao() {
        return thoiGianTao;
    }

    public void setThoiGianTao(Instant thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public NhanVienKyThuat getNhanVienKyThuat() {
        return nhanVienKyThuat;
    }

    public void setNhanVienKyThuat(NhanVienKyThuat nhanVienKyThuat) {
        this.nhanVienKyThuat = nhanVienKyThuat;
    }
}
