package com.hiring4u.repository;
import com.hiring4u.entity.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<ApplicationEntity, Long> {


    // preventing Duplicates Applications

    boolean existsByCandidateIdAndJobId(Long candidateId, Long jobId);

    List<ApplicationEntity> findByJobId(Long jobId);

}
