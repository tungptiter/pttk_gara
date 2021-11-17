package com.nminh.garage.dao;

import com.nminh.garage.model.PhuTung;

import java.util.List;

public interface PhuTungDao {
    PhuTung themPhuTung(int nhaCungCapId,PhuTung pt);
    PhuTung suaPhuTung(int PhuTungId,PhuTung pt);
    List<PhuTung> getListPhuTung();
    List<PhuTung> getListPhuTungTheoNhaCUngCap(String name);
    void xoaPhuTung(int phuTungId);
}
