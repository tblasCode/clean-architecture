package com.vass.jos.backend.application.usecase;

import com.vass.jos.backend.domain.model.TemplateDomainModel;
import com.vass.jos.backend.domain.service.TemplateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Remove @RequiredArgsConstructor annottation if @value is present because archunit will not pass
 */
@Service
@Slf4j
public class TemplateUserCase {
    private final TemplateService templateService;

    public TemplateUserCase(TemplateService templateService) {
        this.templateService = templateService;
    }

    public Optional<TemplateDomainModel> find(Long id) {
        return templateService.find(id);
    }

}
