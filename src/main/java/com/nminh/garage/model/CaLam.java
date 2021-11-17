package com.nminh.garage.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="ca_lam")
public class CaLam {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    String ma;
    String ghiChu;

    @OneToMany(mappedBy = "caLam",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<LichLam> lichLam;

    public CaLam() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public List<LichLam> getLichLam() {
        return lichLam;
    }

    public void setLichLam(List<LichLam> lichLam) {
        this.lichLam = lichLam;
    }
}
