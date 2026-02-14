package com.hiring4u.service;
import com.hiring4u.Enums.Role;
import com.hiring4u.dto.RecruiterDTO;
import com.hiring4u.entity.RecEntity;
import com.hiring4u.repository.RecruitorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class RecRegSer {
    @Autowired
    private RecruitorsRepository repository;
    @Autowired
    private BCryptPasswordEncoder encoder;

    public String processRegistration(RecruiterDTO dto) {
        RecEntity entity = new RecEntity();

        entity.setRole(Role.RECRUITER);
        entity.setEmail(dto.getEmail());
        entity.setPassword(encoder.encode(dto.getPassword()));
        entity.setCompanyName(dto.getCompanyName());
        entity.setHrLocation(dto.getHrLocation());
        entity.setHrName(dto.getHrName());
        entity.setWeblink(dto.getWeblink());
        entity.setHrPhone(dto.getHrPhone());

        repository.save(entity);

        return "success";
    }
}
