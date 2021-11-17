package com.nminh.garage.dao;

import com.nminh.garage.model.ThanhVien;

import java.util.List;

public interface TaiKhoanDao {
    List<ThanhVien> getListTaiKhoan();
    List<ThanhVien> findByName(String name);
    ThanhVien themTaiKhoan(ThanhVien tv);
    void voHieuHoaTaiKhoan(int thanhVienId);
}
