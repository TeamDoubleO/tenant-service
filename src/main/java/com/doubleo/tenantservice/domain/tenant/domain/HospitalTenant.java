package com.doubleo.tenantservice.domain.tenant.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "hospital_tenant")
public class HospitalTenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long hospitalId;

    @Column(nullable = false, unique = true)
    private String tenantId;
}
