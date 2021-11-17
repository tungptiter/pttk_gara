package com.nminh.garage.dao;

import com.nminh.garage.model.NhanVienKyThuat;

import java.util.List;

public interface NhanVienKyThuatDao {
    NhanVienKyThuat themNhanVienKyThuat(Object data);
    List<NhanVienKyThuat> getListNhanVienKyThuat();
    List<NhanVienKyThuat> getListNhanVienKyThuat(String name);
}
