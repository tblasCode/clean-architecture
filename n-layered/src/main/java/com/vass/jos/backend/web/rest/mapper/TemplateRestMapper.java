package com.vass.jos.backend.web.rest.mapper;

import com.vass.jos.backend.domain.model.TemplateDomainModel;
import com.vass.jos.backend.ui.apirest.model.TemplateAdapterModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface TemplateRestMapper {
	/**
	 * map.
	 * @param templateAdapterModel
	 * @return TemplateDomainModel
	 */
	@Mappings({})
  TemplateDomainModel map(TemplateAdapterModel templateAdapterModel);
}
