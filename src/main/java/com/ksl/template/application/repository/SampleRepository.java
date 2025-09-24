package com.ksl.template.application.repository;

import com.ksl.template.application.domain.SampleEntity;
import com.ksl.template.application.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleRepository extends JpaRepository<SampleEntity, Long> {

    List<SampleEntity> findAllByStatus(Status status);
}
