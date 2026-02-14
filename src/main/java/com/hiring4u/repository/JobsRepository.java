package com.hiring4u.repository;
import com.hiring4u.entity.JobsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobsRepository extends JpaRepository<JobsEntity, Long> {

}
