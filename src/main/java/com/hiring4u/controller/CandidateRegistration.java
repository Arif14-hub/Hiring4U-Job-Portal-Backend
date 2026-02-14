package com.hiring4u.controller;
import com.hiring4u.dto.CanRegDTO;
import com.hiring4u.service.CanRegSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/can")
public class CandidateRegistration {
    @Autowired
    private CanRegSer candidateService;

    @GetMapping("/reg")
    public String registration() {
        return "reg.html";
    }

    @PostMapping("/registered")
    public String CanRegister(@RequestBody CanRegDTO dto){
        return candidateService.processRegistration(dto);

    }


}
