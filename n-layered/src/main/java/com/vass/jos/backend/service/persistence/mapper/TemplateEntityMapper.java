package com.vass.jos.backend.service.persistence.mapper;

import com.vass.jos.backend.service.persistence.entity.TemplateEntity;
import com.vass.jos.backend.domain.model.TemplateDomainModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface TemplateEntityMapper {

  @Mappings({
    @Mapping(target = "identifier", source = "id")
  })
  TemplateDomainModel map(TemplateEntity templateEntity);
}
