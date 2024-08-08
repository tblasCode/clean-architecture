package com.vass.jos.backend.domain.service;

import com.vass.jos.backend.domain.model.TemplateDomainModel;

public interface TemplateService {
  TemplateDomainModel useCasetemplateMethod(TemplateDomainModel templateDomainModel);
  TemplateDomainModel useCasetemplateMethod();
  TemplateDomainModel useCasetemplateFailure();

}
