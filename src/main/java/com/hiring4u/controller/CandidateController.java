package com.hiring4u.controller;
import com.hiring4u.dto.ApplicationDTO;
import com.hiring4u.entity.JobsEntity;
import com.hiring4u.service.ApplicationService;
import com.hiring4u.service.JobsListing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("candidate")
public class CandidateController {
    @Autowired
    JobsListing List;
    @Autowired
    ApplicationService applicationService;


    @GetMapping("/jobs")
    public List<JobsEntity> getJobs() {
        return List.getAllJobs();
    }

    @PostMapping("/apply")
    public String apply(@RequestBody ApplicationDTO dto) {
        return applicationService.apply(dto);

    }

}
