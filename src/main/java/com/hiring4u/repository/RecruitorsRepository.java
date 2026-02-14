package com.hiring4u.repository;

import com.hiring4u.entity.RecEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecruitorsRepository extends CrudRepository<RecEntity, Long> {
    Optional<RecEntity> findByEmail(String email);
}
