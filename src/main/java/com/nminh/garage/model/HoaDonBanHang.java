package com.nminh.garage.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@Table(name = "HoaDonBanHang")
public class HoaDonBanHang {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    Instant thoiGianTao;
    Float thanhTien;
    String ghiChu;

    @OneToOne
    @JoinColumn(name = "lich_hen_id")
    LichHen lichHen;

    @ManyToOne
            @JoinColumn(name = "nhan_vien_id")
    NhanVien nhanVien;

    public HoaDonBanHang() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getThoiGianTao() {
        return thoiGianTao;
    }

    public void setThoiGianTao(Instant thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
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

    public LichHen getLichHen() {
        return lichHen;
    }

    public void setLichHen(LichHen lichHen) {
        this.lichHen = lichHen;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
}
