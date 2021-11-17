package com.nminh.garage.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Xe")
public class Xe {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    String bienSo;
    String mauXe;
    String hangXe;
    String ghiChu;

    public Xe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
