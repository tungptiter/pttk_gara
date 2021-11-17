package com.nminh.garage.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "ChucVu")
public class ChucVu {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    String name;
    String ghiChu;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(mappedBy = "chucVu",fetch = FetchType.EAGER)
    List<ThanhVien> thanhViens;

    public ChucVu() {
    }

    public String toString() {
        return "ChucVu(id:"+id+", name:"+name+", ghiChu:"+ghiChu+")";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public List<ThanhVien> getThanhViens() {
        return thanhViens;
    }

    public void setThanhViens(List<ThanhVien> thanhViens) {
        this.thanhViens = thanhViens;
    }
}
