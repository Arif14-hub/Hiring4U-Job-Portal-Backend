package com.hiring4u.controller;

import com.hiring4u.dto.JobsListingDTO;
import com.hiring4u.entity.ApplicationEntity;
import com.hiring4u.service.ApplicationService;
import com.hiring4u.service.JobsListing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {
    @Autowired
    private JobsListing Listing;
    @Autowired
    private ApplicationService applicationService;

    @GetMapping("/home")
    public String home() {
        return "Home Page";
    }

    @PostMapping("/posted")
    public String JobsListing(@RequestBody JobsListingDTO dto) {
        return Listing.processjoblisting(dto);
    }


    @GetMapping("/applicants/{jobId}")
    public List<ApplicationEntity> viewApplicants(@PathVariable Long jobId){
        return applicationService.getApplicants(jobId);
    }

}
