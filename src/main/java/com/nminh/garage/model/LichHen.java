package com.nminh.garage.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@Table(name = "lich_hen")
public class LichHen {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    Instant thoiGianDat;
    Instant thoiGianDen;
    String trangThai;
    String ghiChu;

    @OneToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "xe_id")
    Xe xe;

    @OneToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "khach_hang_id")
    KhachHang khachHang;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "chi_tiet_lich_hen",
            joinColumns = @JoinColumn(name = "lich_hen_id"),
            inverseJoinColumns = @JoinColumn(name = "phu_tung_id")
    )
    List<PhuTung> phuTungs;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "chi_tiet_lich_hen",
            joinColumns = @JoinColumn(name = "lich_hen_id"),
            inverseJoinColumns = @JoinColumn(name = "dich_vu_id")
    )
    List<DichVu> dichVus;

    public LichHen() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getThoiGianDat() {
        return thoiGianDat;
    }

    public void setThoiGianDat(Instant thoiGianDat) {
        this.thoiGianDat = thoiGianDat;
    }

    public Instant getThoiGianDen() {
        return thoiGianDen;
    }

    public void setThoiGianDen(Instant thoiGianDen) {
        this.thoiGianDen = thoiGianDen;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Xe getXe() {
        return xe;
    }

    public void setXe(Xe xe) {
        this.xe = xe;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public List<PhuTung> getPhuTungs() {
        return phuTungs;
    }

    public void setPhuTungs(List<PhuTung> phuTungs) {
        this.phuTungs = phuTungs;
    }

    public List<DichVu> getDichVus() {
        return dichVus;
    }

    public void setDichVus(List<DichVu> dichVus) {
        this.dichVus = dichVus;
    }
}
