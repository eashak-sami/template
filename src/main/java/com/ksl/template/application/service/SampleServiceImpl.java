package com.ksl.template.application.service;

import com.ksl.template.api.payload.request.SampleRequest;
import com.ksl.template.api.payload.request.SampleSearchRequest;
import com.ksl.template.api.payload.response.SampleResponse;
import com.ksl.template.api.payload.response.SampleSearchResponse;
import com.ksl.template.application.domain.SampleEntity;
import com.ksl.template.application.repository.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {

    private final SampleRepository sampleRepository;

    @Override
    public SampleResponse create(SampleRequest request) {
        SampleEntity entity = SampleEntity.builder()
                .id(null) // will be generated if using @GeneratedValue
                .reqVar1(request.getReqVar1())
                .reqVar2(request.getReqVar2())
                .notNullableVar(request.getNotNullableVar())
                .uniqueVar(request.getUniqueVar())
                .status(request.getStatus())
                .build();

        return mapToResponse(sampleRepository.save(entity));
    }

    @Override
    public SampleResponse update(Long id, SampleRequest request) {
        SampleEntity entity = sampleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sample not found with id " + id));

        entity.setReqVar1(request.getReqVar1());
        entity.setReqVar2(request.getReqVar2());
        entity.setNotNullableVar(request.getNotNullableVar());
        entity.setUniqueVar(request.getUniqueVar());
        entity.setStatus(request.getStatus());

        return mapToResponse(sampleRepository.save(entity));
    }

    @Override
    public void delete(Long id) {
        sampleRepository.deleteById(id);
    }

    @Override
    public SampleResponse getById(Long id) {
        SampleEntity entity = sampleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sample not found with id " + id));
        return mapToResponse(entity);
    }

    @Override
    public Page<SampleSearchResponse> search(SampleSearchRequest request, Pageable pageable) {
        return sampleRepository.search(
                request.getReqVar1(),
                request.getReqVar2(),
                request.getStatus(),
                pageable
        );
    }

    private SampleResponse mapToResponse(SampleEntity entity) {
        return SampleResponse.builder()
                .id(entity.getId())
                .reqVar1(entity.getReqVar1())
                .reqVar2(entity.getReqVar2())
                .notNullableVar(entity.getNotNullableVar())
                .uniqueVar(entity.getUniqueVar())
                .status(entity.getStatus())
                .build();
    }
}

