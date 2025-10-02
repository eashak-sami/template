package com.ksl.template.application.domain;

import com.ksl.template.application.enums.Status;
import com.ksl.template.util.converter.StatusConverter;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sample_info")
public class SampleEntity extends AuditBaseDomain {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "req_var_1")
    private String reqVar1;

    @Column(name = "req_var_2")
    private String reqVar2;

    @Column(name = "not_nullable_var", nullable = false)
    private String notNullableVar;

    @Column(name = "unique_var", unique = true)
    private String uniqueVar;

    @Convert(converter = StatusConverter.class)
    @Column(name = "status")
    private Status status;
}
