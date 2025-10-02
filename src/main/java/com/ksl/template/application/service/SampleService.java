package com.ksl.template.application.service;

import com.ksl.template.api.payload.request.SampleRequest;
import com.ksl.template.api.payload.request.SampleSearchRequest;
import com.ksl.template.api.payload.response.SampleResponse;
import com.ksl.template.api.payload.response.SampleSearchResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SampleService {
    SampleResponse create(SampleRequest request);

    SampleResponse update(Long id, SampleRequest request);

    void delete(Long id);

    SampleResponse getById(Long id);

    Page<SampleSearchResponse> search(SampleSearchRequest request, Pageable pageable);
}

