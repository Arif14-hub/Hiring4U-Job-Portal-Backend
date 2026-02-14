package com.hiring4u.service;
import com.hiring4u.Enums.Role;
import com.hiring4u.dto.CanRegDTO;
import com.hiring4u.entity.CanEntity;
import com.hiring4u.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CanRegSer {
    @Autowired
    private RegistrationRepository registrationRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;



    public String processRegistration(CanRegDTO dto) {
       CanEntity entity = new CanEntity();
       entity.setRole(Role.CANDIDATE);
       entity.setEmail(dto.getEmail());
       entity.setFullName(dto.getFullName());
       entity.setPassword(passwordEncoder.encode(dto.getPassword()));
       entity.setPhoneNumber(dto.getPhoneNumber());
       entity.setDob(dto.getDob());
       entity.setLocation(String.valueOf(dto.getLocation()));

       registrationRepository.save(entity);

       return "success";
    }
}
