package com.vass.jos.backend.service.persistence;

import com.vass.jos.backend.domain.service.PersistenceService;
import org.springframework.stereotype.Service;

@Service
public class PersistenceServiceImpl implements PersistenceService {

  public final TemplateRepository templateRepository;

  public PersistenceServiceImpl(TemplateRepository templateRepository) {
    this.templateRepository = templateRepository;
  }

  @Override
  public void find() {
    templateRepository.findAll();
  }
}
