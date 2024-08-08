package com.vass.jos.backend.domain.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TemplateDomainModel implements Serializable {

  private static final long serialVersionUID = -8218469510494622718L;

  private Long identifier;

  private String name;

}
