package com.hiring4u.service;
import com.hiring4u.dto.ApplicationDTO;
import com.hiring4u.entity.ApplicationEntity;
import com.hiring4u.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository Repository;

    public List<ApplicationEntity> getApplicants(Long jobId){
        return Repository.findByJobId(jobId);
    }

    public String apply(ApplicationDTO dto){

        if(Repository.existsByCandidateIdAndJobId(dto.getCandidateId(), dto.getJobId())) {
            return "Already Applied!";
        }
        ApplicationEntity application = new ApplicationEntity();
        application.setCandidateId(dto.getCandidateId());
        application.setJobId(dto.getJobId());
        application.setAppliedDate(LocalDate.now());

        Repository.save(application);

        return "Applied";
    }
}
