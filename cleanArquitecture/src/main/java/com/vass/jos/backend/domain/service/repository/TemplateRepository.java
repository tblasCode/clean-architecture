package com.vass.jos.backend.domain.service.repository;

import com.vass.jos.backend.domain.model.TemplateDomainModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TemplateRepository extends JpaRepository<TemplateDomainModel, Long> {
  Optional<TemplateDomainModel> find(Long id);
}
