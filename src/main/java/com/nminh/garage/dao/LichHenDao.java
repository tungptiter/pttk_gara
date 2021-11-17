package com.nminh.garage.dao;

import com.nminh.garage.model.HoaDonNhap;
import com.nminh.garage.model.LichHen;

import java.util.List;

public interface LichHenDao {
    LichHen taoLichHen(int nhanVienId, int khachHangId);
    LichHen suaLichHen(int khachHangId,LichHen lh);
    List<LichHen> getListHoaDonTheoKhachHang(String ten);
    List<LichHen> getListLichHen();
}
