package com.nminh.garage.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@Table(name = "HoaDonNhap")
public class HoaDonNhap {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    Instant thoiGianTao;
    Float thanhTien;
    String ghiChu;

    @OneToOne
            @JoinColumn(name = "nha_cung_cap_id")
    NhaCungCap nhaCungCap;

    @ManyToOne
    @JoinColumn(name ="nhan_vien_id")
    NhanVien nhanVien;

    @ManyToMany
    @JoinTable(name = "chi_tiet_hoa_don_nhap"
    ,joinColumns = @JoinColumn(name = "hoa_don_nhap_id"),
    inverseJoinColumns = @JoinColumn(name = "phu_tung_id"))
    List<PhuTung> phuTungs;

    public HoaDonNhap() {
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

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public List<PhuTung> getPhuTungs() {
        return phuTungs;
    }

    public void setPhuTungs(List<PhuTung> phuTungs) {
        this.phuTungs = phuTungs;
    }
}
