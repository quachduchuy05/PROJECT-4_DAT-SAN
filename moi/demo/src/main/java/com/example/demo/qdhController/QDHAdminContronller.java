package com.example.demo.qdhController;

import com.example.demo.qdhEntity.QDHSanBong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class QDHAdminController {

    @GetMapping("/admin")
    public String admin(Model model){

        List<QDHSanBong> ds = new ArrayList<>();

        ds.add(new QDHSanBong(1,"Sân A","Sân 5",200000));
        ds.add(new QDHSanBong(2,"Sân B","Sân 7",300000));
        ds.add(new QDHSanBong(3,"Sân C","Sân 11",500000));
        ds.add(new QDHSanBong(4,"Sân D","Sân 5",220000));
        ds.add(new QDHSanBong(5,"Sân E","Sân 7",320000));
        ds.add(new QDHSanBong(6,"Sân F","Sân 11",550000));

        model.addAttribute("danhsach", ds);

        return "admin";
    }
}