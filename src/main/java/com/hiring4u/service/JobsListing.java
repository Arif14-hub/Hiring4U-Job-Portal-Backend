package com.hiring4u.service;
import com.hiring4u.dto.JobsListingDTO;
import com.hiring4u.entity.JobsEntity;
import com.hiring4u.entity.RecEntity;
import com.hiring4u.repository.JobsRepository;
import com.hiring4u.repository.RecruitorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobsListing {

        @Autowired
        private JobsRepository repository;

        @Autowired
        private RecruitorsRepository recruitersRepository;

        public String processjoblisting(JobsListingDTO dto){

            JobsEntity entity = new JobsEntity();

            entity.setSalary(dto.getSalary());
            entity.setLocation(dto.getLocation());
            entity.setPostedDate(dto.getPostedDate());
            entity.setDescription(dto.getDescription());
            entity.setRequireskills(dto.getRequireskills());
            entity.setTitle(dto.getTitle());

            // 🔐 Get logged-in recruiter
            Authentication authentication =
                    SecurityContextHolder.getContext().getAuthentication();

            String email = authentication.getName();

            RecEntity recruiter = recruitersRepository.findByEmail(email)
                    .orElseThrow(() ->
                            new RuntimeException("Recruiter not found"));

            entity.setRecruiter(recruiter);

            repository.save(entity);

            return "success";
        }

    public List<JobsEntity> getAllJobs() {
        return repository.findAll();
    }
}