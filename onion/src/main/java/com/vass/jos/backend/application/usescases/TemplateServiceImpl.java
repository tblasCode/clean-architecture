package com.vass.jos.backend.application.usescases;

import com.vass.jos.backend.domain.model.TemplateDomainModel;
import com.vass.jos.backend.domain.service.PersistenceService;
import com.vass.jos.backend.domain.service.TemplateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

/**
 * Remove @RequiredArgsConstructor annottation if @value is present because archunit will not pass
 * */
@Service
@Slf4j
public class TemplateServiceImpl implements TemplateService {

  private static final String BACKEND_A = "template";

  private final PersistenceService persistenceService;

  public TemplateServiceImpl(PersistenceService persistenceService) {
    this.persistenceService = persistenceService;
  }

  @Override
  public TemplateDomainModel useCasetemplateMethod(TemplateDomainModel templateDomainModel) {
    log.info("service.template");

    persistenceService.find();

    return null;
  }

  @Override
  public TemplateDomainModel useCasetemplateMethod() {
    log.info("service.template");

    persistenceService.find();

    return null;
  }

  @Override
  public TemplateDomainModel useCasetemplateFailure() {
    throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "This is a remote exception");
  }


}
