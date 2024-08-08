package com.vass.jos.backend.domain.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Service implements Serializable {

  private static final long serialVersionUID = -2213218863745244938L;

  private String id;

  private String name;

  private String code;

  private String description;

}
