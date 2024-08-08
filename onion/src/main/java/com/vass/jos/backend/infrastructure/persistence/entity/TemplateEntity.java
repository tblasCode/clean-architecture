package com.vass.jos.backend.infrastructure.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Indicates that a class is a database model
@Table(name = "template_entity") // sets the name of the table that the model will be mapped to
@Data
@NoArgsConstructor
public class TemplateEntity {
  @Id // Marks the variable as a primary key
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = "seq_id"
  )
  @SequenceGenerator(
      name = "seq_id",
      allocationSize = 1
  )
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "titular")
  private String titular;

  @Column(name = "descripcion")
  private String descripcion;

  @Column(name = "coord_x")
  private Float coord_x;

  @Column(name = "coord_y")
  private Float coord_y;

  @Column(name = "fecha_template")
  private LocalDateTime fechaTemplate;

}