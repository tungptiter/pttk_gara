package com.nminh.garage.dao;

import com.nminh.garage.model.NhaCungCap;

import java.util.List;

public interface NhaCungCapDao {
    List<NhaCungCapDao> getListNhaCungCap();
    List<NhaCungCapDao> getListNhaCungCap(String name);
    NhaCungCap themNhaCungCap(Object data);
    NhaCungCap suaNhaCungCap(int nhaCungCapId,NhaCungCap ncc);
}
