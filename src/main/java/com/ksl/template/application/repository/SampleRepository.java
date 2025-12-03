package com.ksl.template.application.repository;

import com.ksl.template.api.payload.response.SampleSearchResponse;
import com.ksl.template.application.domain.SampleEntity;
import com.ksl.template.application.enums.Status;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<SampleEntity, Long> {

  List<SampleEntity> findAllByStatus(Status status);

  @Query("""
      SELECT new com.ksl.template.api.payload.response.SampleSearchResponse(
          s.id, s.reqVar1, s.reqVar2, s.notNullableVar, s.uniqueVar, s.status
      )
      FROM SampleEntity s
      WHERE (:reqVar1 IS NULL OR s.reqVar1 = :reqVar1)
        AND (:reqVar2 IS NULL OR s.reqVar2 = :reqVar2)
        AND (:status IS NULL OR s.status = :status)
      """)
  Page<SampleSearchResponse> search(
      @Param("reqVar1") String reqVar1,
      @Param("reqVar2") String reqVar2,
      @Param("status") Status status,
      Pageable pageable);
}
