package com.nminh.garage.dao;

import com.nminh.garage.model.HoaDonBanHang;
import com.nminh.garage.model.HoaDonNhap;

import java.util.List;

public interface HoaDonNhapDao {
    HoaDonNhap taoHoaDon(int nhanVienId, int nhaCungCapId);
    HoaDonNhap suaHoaDon(int nhanVienId,HoaDonNhap hd);
    List<HoaDonNhap> getListHoaDonTheoNhaCungCap(int nhaCungCapId);
    List<HoaDonNhap> getListHoaDonTheoNhanVien(int nhanVienBhID);
    List<HoaDonNhap> getListHoaDon();
}
