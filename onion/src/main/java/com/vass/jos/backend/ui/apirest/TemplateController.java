package com.vass.jos.backend.ui.apirest;

import com.vass.jos.backend.ui.apirest.mapper.TemplateRestMapper;
import com.vass.jos.backend.domain.service.TemplateService;
import com.vass.jos.backend.ui.apirest.model.ApiError;
import com.vass.jos.backend.ui.apirest.model.TemplateAdapterModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TemplateController implements TemplateApi {

  private final TemplateService templateService;

  private final TemplateRestMapper templateMapper;

  private final String name;

  public TemplateController(TemplateService templateService,
                            TemplateRestMapper templateMapper, @Value("${name:code}") String name) {
    this.templateService = templateService;
    this.templateMapper = templateMapper;
    this.name = name;
  }

  public ResponseEntity<TemplateAdapterModel> templateGet() {
    log.info("templateGet");
    TemplateAdapterModel templateAdapterModel = new TemplateAdapterModel();
    templateAdapterModel.setIdentifier(1);
    templateAdapterModel.setName("name");

    return new ResponseEntity<TemplateAdapterModel>(templateAdapterModel, HttpStatus.OK);
  }

  public ResponseEntity<String> templatePost(TemplateAdapterModel templateModel) {
    log.info("templatePost");
    templateService.useCasetemplateMethod(templateMapper.map(templateModel));
    return new ResponseEntity<String>("TemplatePost", HttpStatus.OK);
  }

  public ResponseEntity<ApiError> templateError() {
    log.info("templateError");
    templateService.useCasetemplateFailure();
    return null;
  }

}
