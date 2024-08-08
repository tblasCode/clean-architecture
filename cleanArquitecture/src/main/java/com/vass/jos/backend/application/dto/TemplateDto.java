package com.vass.jos.backend.application.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class TemplateDto implements Serializable {

  private static final long serialVersionUID = -8218469510494622718L;

  private Long identifier;

  private String name;
}
