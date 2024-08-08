package com.vass.jos.backend.infrastructure.repository;

import com.vass.jos.backend.infrastructure.repository.entity.TemplateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPATemplateRepository extends JpaRepository<TemplateEntity, Long> {
  TemplateEntity save(TemplateEntity templateEntity);

}
