package com.nminh.garage.dao;

import com.nminh.garage.model.HoaDonBanHang;

import java.util.List;

public interface HoaDonBanHangDao {
    HoaDonBanHang taoHoaDon(int nhanVienId,int KhachHangId);
    HoaDonBanHang suaHoaDon(int nhanVienId,HoaDonBanHang hd);
    List<HoaDonBanHang> getListHoaDonTheoKhachHang(int khachHangId);
    List<HoaDonBanHang> getListHoaDonTheoNhanVien(int nhanVienBhID);
    List<HoaDonBanHang> getListHoaDon();
}
