package com.nminh.garage.controller;

import com.nminh.garage.controller.request.LoginRequest;
import com.nminh.garage.dao.ChucVuDao;
import com.nminh.garage.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private ThanhVienDao thanhVienDao;

    @Autowired
    private ChucVuDao chucVuDao;

    @Autowired
    private SessionService sessionService;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @GetMapping({"/login"})
    public String index(Model model) {
        this.sessionService.set("code", "phuctest");
        LoginRequest request = new LoginRequest();
        model.addAttribute("userLogin", request);
        return "login-page";
    }


    @PostMapping({"/login"})
    public String login(Model model, @ModelAttribute("userLogin") LoginRequest request) {
//        System.out.println("rq: "+request);
//        String password = this.passwordEncoder.encode(request.getPassword());
//        ChucVu chucVu = chucVuDao.findById(1).get();
//        ThanhVien user = new ThanhVien().setUsername("anh").setPassword(password).setChucVu(chucVu);
//        System.out.println(user);
//        thanhVienDao.save(user);
//        ThanhVien tv = thanhVienDao.findByUsername(request.getUsername());
//        System.out.println("fdjkfj" +user);
//        this.sessionService.set("userLogin", tv);
        return "user/index.jsp";

    }


}
