package com.vass.jos.backend.infrastructure.repository.mapper;

import com.vass.jos.backend.infrastructure.repository.entity.TemplateEntity;
import com.vass.jos.backend.domain.model.TemplateDomainModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TemplateEntityMapper {

  @Mapping(target = "identifier", source = "id")
  @Mapping(target = "name", source = "titular")
  TemplateDomainModel map(TemplateEntity templateEntity);
}
