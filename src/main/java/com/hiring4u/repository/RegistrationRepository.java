package com.hiring4u.repository;
import com.hiring4u.entity.CanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RegistrationRepository extends JpaRepository<CanEntity, Long> {
    List<CanEntity> Email(String email);

    Optional<CanEntity> findByEmail(String email);
}
