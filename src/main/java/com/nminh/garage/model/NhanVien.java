package com.nminh.garage.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    String soDienThoai;
    String diaChi;
    Instant ngaySinh;
    String chiCHu;
    String cccd;
    Float luong;

    @OneToOne
    @JoinColumn(name = "thanh_vien_id")
    ThanhVien thanhVien;

    @OneToMany(mappedBy = "nhanVien", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    List<HoaDonBanHang> hoaDonBanHangs;

    @OneToMany(mappedBy = "nhanVien", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    List<LichLam> lichLams;

    @OneToMany(mappedBy = "nhanVien", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    List<ThuLao> thuLaos;

    public NhanVien() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Instant getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Instant ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getChiCHu() {
        return chiCHu;
    }

    public void setChiCHu(String chiCHu) {
        this.chiCHu = chiCHu;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }

    public ThanhVien getThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(ThanhVien thanhVien) {
        this.thanhVien = thanhVien;
    }

    public List<HoaDonBanHang> getHoaDonBanHangs() {
        return hoaDonBanHangs;
    }

    public void setHoaDonBanHangs(List<HoaDonBanHang> hoaDonBanHangs) {
        this.hoaDonBanHangs = hoaDonBanHangs;
    }

    public List<LichLam> getLichLams() {
        return lichLams;
    }

    public void setLichLams(List<LichLam> lichLams) {
        this.lichLams = lichLams;
    }

    public List<ThuLao> getThuLaos() {
        return thuLaos;
    }

    public void setThuLaos(List<ThuLao> thuLaos) {
        this.thuLaos = thuLaos;
    }
}
