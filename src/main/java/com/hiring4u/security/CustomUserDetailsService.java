package com.hiring4u.security;

import com.hiring4u.entity.CanEntity;
import com.hiring4u.entity.RecEntity;
import com.hiring4u.repository.RegistrationRepository;
import com.hiring4u.repository.RecruitorsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private RegistrationRepository candidateRepo;

    @Autowired
    private RecruitorsRepository recruiterRepo;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {

        // 🔹 Check Candidate first
        Optional<CanEntity> candidate = candidateRepo.findByEmail(email);
        if (candidate.isPresent()) {
            CanEntity user = candidate.get();
            return org.springframework.security.core.userdetails.User
                    .builder()
                    .username(user.getEmail())
                    .password(user.getPassword())
                    .roles(user.getRole().name())
                    .build();
        }

        // 🔹 Then check Recruiter
        Optional<RecEntity> recruiter = recruiterRepo.findByEmail(email);
        if (recruiter.isPresent()) {
            RecEntity user = recruiter.get();
            return org.springframework.security.core.userdetails.User
                    .builder()
                    .username(user.getEmail())
                    .password(user.getPassword())
                    .roles(user.getRole().name())
                    .build();
        }

        throw new UsernameNotFoundException("User not found");
    }
}