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
@Schema(description = "Request DTO for Sample API")
public class SampleRequest {

    @Schema(description = "Request variable 1", example = "foo")
    private String reqVar1;

    @Schema(description = "Request variable 2", example = "bar")
    private String reqVar2;

    @Schema(description = "Non-nullable variable", example = "must-have-value", requiredMode = Schema.RequiredMode.REQUIRED)
    private String notNullableVar;

    @Schema(description = "Unique variable", example = "unique123")
    private String uniqueVar;

    @Schema(description = "Status of the record", example = "ACTIVE")
    private Status status;
}
