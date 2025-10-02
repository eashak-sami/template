package com.ksl.template.api.payload.request;

import com.ksl.template.application.enums.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Search request DTO for Sample API")
public class SampleSearchRequest {

    @Schema(description = "Search by request variable 1", example = "foo")
    private String reqVar1;

    @Schema(description = "Search by request variable 2", example = "bar")
    private String reqVar2;

    @Schema(description = "Search by status", example = "ACTIVE")
    private Status status;
}
