package com.nminh.garage.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@Table(name = "NhanVienKyThuat")
public class NhanVienKyThuat {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    String ten;
    String soDienThoai;
    String diaChi;
    Instant ngaySinh;
    String cccd;
    Float luong;

    @OneToMany(mappedBy = "nhanVienKyThuat", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    List<XeGui> xeGuis;

    @OneToMany(mappedBy = "nhanVienKyThuat", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    List<ThuLao> thuLaos;

    public NhanVienKyThuat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    public List<XeGui> getXeGuis() {
        return xeGuis;
    }

    public void setXeGuis(List<XeGui> xeGuis) {
        this.xeGuis = xeGuis;
    }

    public List<ThuLao> getThuLaos() {
        return thuLaos;
    }

    public void setThuLaos(List<ThuLao> thuLaos) {
        this.thuLaos = thuLaos;
    }
}
