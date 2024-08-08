package com.vass.jos.backend.presentation.controller;

import com.vass.jos.backend.application.dto.TemplateDto;
import com.vass.jos.backend.application.usecase.TemplateUserCase;
import com.vass.jos.backend.domain.model.TemplateDomainModel;
import com.vass.jos.backend.presentation.controller.mapper.TemplateMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TemplateController{

  private final TemplateUserCase templateUserCase;
  private final TemplateMapper templateMapper;

    public TemplateController(TemplateUserCase templateUserCase, TemplateMapper templateMapper) {
        this.templateUserCase = templateUserCase;
        this.templateMapper = templateMapper;
    }
    @GetMapping("/users/{id}")
  public ResponseEntity<TemplateDto> getUserById(@PathVariable Long id) {
      Optional<TemplateDomainModel> templateDomainModel = templateUserCase.find(id);
      return templateDomainModel
              .map(domainModel -> ResponseEntity.ok(templateMapper.map(domainModel)))
              .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
