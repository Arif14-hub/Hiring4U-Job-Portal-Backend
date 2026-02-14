package com.hiring4u.controller;
import com.hiring4u.dto.RecruiterDTO;
import com.hiring4u.service.RecRegSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rec")
public class RecruiterRegistration {
    @Autowired
    private RecRegSer recruitorservice;

    @GetMapping("/reg")
    public   String registration() {
        return "reg.html";
    }


    @PostMapping("/registered")
    public  String RecruiterReg(@RequestBody RecruiterDTO dto){
        return recruitorservice.processRegistration(dto);
    }
}
