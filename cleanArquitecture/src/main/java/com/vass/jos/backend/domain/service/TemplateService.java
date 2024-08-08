package com.vass.jos.backend.domain.service;

import com.vass.jos.backend.domain.model.TemplateDomainModel;
import com.vass.jos.backend.domain.service.repository.TemplateRepository;

import java.util.Optional;

public class TemplateService {

  private final TemplateRepository templateRepository;

    public TemplateService(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

  public Optional<TemplateDomainModel> find(Long id) {
    return templateRepository.find(id);
  }

}
