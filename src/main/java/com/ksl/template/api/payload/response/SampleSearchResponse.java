package com.ksl.template.api.payload.response;

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
@Schema(description = "Search response DTO for Sample API")
public class SampleSearchResponse {

    private Long id;
    private String reqVar1;
    private String reqVar2;
    private String notNullableVar;
    private String uniqueVar;
    private Status status;
}
