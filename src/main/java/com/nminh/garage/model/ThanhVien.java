package com.nminh.garage.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ThanhVien")
@Accessors(chain = true)
public class ThanhVien {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id;
    private String username;
    private String password;

    @ManyToOne
    @JoinColumn(name = "chuc_vu_id", nullable = false)
    private ChucVu chucVu;

    public ThanhVien() {
    }

    public String toString() {
        return "ThanhVien(id:"+id+", name:"+username+", chucVu:"+chucVu.getName()+")";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }
}
