package com.vass.jos.backend.service.persistence;

import com.vass.jos.backend.service.persistence.entity.TemplateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRepository extends JpaRepository<TemplateEntity, Long> {
  TemplateEntity save(TemplateEntity templateEntity);

}
