package com.ksl.template.api.endpoint;

import com.ksl.template.api.payload.request.SampleRequest;
import com.ksl.template.api.payload.request.SampleSearchRequest;
import com.ksl.template.api.payload.response.SampleResponse;
import com.ksl.template.api.payload.response.SampleSearchResponse;
import com.ksl.template.application.service.SampleService;
import com.ksl.template.util.helper.ServiceEndpoints;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ServiceEndpoints.Controllers.SAMPLE_CONTROLLER)
@RequiredArgsConstructor
@Tag(name = "Sample API", description = "CRUD and Search operations for Sample entity")
public class SampleController {

    private final SampleService sampleService;

    @PostMapping(value = ServiceEndpoints.SampleController.CREATE)
    @Operation(summary = "Create a new sample")
    public ResponseEntity<SampleResponse> create(@Valid @RequestBody SampleRequest request) {
        return ResponseEntity.ok(sampleService.create(request));
    }

    @PutMapping(value = ServiceEndpoints.SampleController.UPDATE)
    @Operation(summary = "Update an existing sample")
    public ResponseEntity<SampleResponse> update(@Valid @PathVariable Long id, @RequestBody SampleRequest request) {
        return ResponseEntity.ok(sampleService.update(id, request));
    }

    @DeleteMapping(value = ServiceEndpoints.SampleController.DELETE)
    @Operation(summary = "Delete a sample by ID")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        sampleService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = ServiceEndpoints.SampleController.GET)
    @Operation(summary = "Get a sample by ID")
    public ResponseEntity<SampleResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(sampleService.getById(id));
    }

    @GetMapping(value = ServiceEndpoints.SampleController.SEARCH)
    @Operation(summary = "Search samples with filters and pagination")
    public ResponseEntity<Page<SampleSearchResponse>> search(
            @RequestBody SampleSearchRequest request,
            Pageable pageable) {
        return ResponseEntity.ok(sampleService.search(request, pageable));
    }
}