package com.nminh.garage.dao;

import com.nminh.garage.model.XeGui;

import java.util.List;

public interface XeGuiDao {
    List<XeGui> getXeGuiTheoKhachHang(String name);
    List<XeGui> getListXeGui();
}
