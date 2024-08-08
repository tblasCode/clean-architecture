package com.vass.jos.backend.presentation.controller.mapper;

import com.vass.jos.backend.application.dto.TemplateDto;
import com.vass.jos.backend.domain.model.TemplateDomainModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface TemplateMapper {
	/**
	 * map.
	 * @param templateAdapterModel
	 * @return TemplateDomainModel
	 */
	@Mappings({})
	TemplateDto map(TemplateDomainModel templateAdapterModel);
}
