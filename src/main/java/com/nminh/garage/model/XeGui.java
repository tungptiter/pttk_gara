package com.nminh.garage.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
@Table(name = "xe_gui")
public class XeGui {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    Instant thoiGianGui;
    Instant thoiGianLay;
    String ghiChu;
    String trangThai;

    @OneToOne
    LichHen lichHen;

    @ManyToOne
            @JoinColumn(name="nhan_vien_ky_thuat_id")
    NhanVienKyThuat nhanVienKyThuat;

    public XeGui() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getThoiGianGui() {
        return thoiGianGui;
    }

    public void setThoiGianGui(Instant thoiGianGui) {
        this.thoiGianGui = thoiGianGui;
    }

    public Instant getThoiGianLay() {
        return thoiGianLay;
    }

    public void setThoiGianLay(Instant thoiGianLay) {
        this.thoiGianLay = thoiGianLay;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public LichHen getLichHen() {
        return lichHen;
    }

    public void setLichHen(LichHen lichHen) {
        this.lichHen = lichHen;
    }

    public NhanVienKyThuat getNhanVienKyThuat() {
        return nhanVienKyThuat;
    }

    public void setNhanVienKyThuat(NhanVienKyThuat nhanVienKyThuat) {
        this.nhanVienKyThuat = nhanVienKyThuat;
    }
}
