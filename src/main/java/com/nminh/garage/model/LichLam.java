package com.nminh.garage.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
@Table(name = "LichLam")
public class LichLam {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    Instant ngay;
    String ghiChu;

    @ManyToOne
    @JoinColumn(name ="ca_lam_id")
    CaLam caLam;

    @ManyToOne
    @JoinColumn(name ="nhan_vien_id")
    NhanVien nhanVien;

    public LichLam() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getNgay() {
        return ngay;
    }

    public void setNgay(Instant ngay) {
        this.ngay = ngay;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public CaLam getCaLam() {
        return caLam;
    }

    public void setCaLam(CaLam caLam) {
        this.caLam = caLam;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
}
