package archunittests;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.library.Architectures.onionArchitecture;
import static com.tngtech.archunit.library.GeneralCodingRules.NO_CLASSES_SHOULD_USE_FIELD_INJECTION;
import static java.util.stream.Collectors.toMap;
import static org.springframework.data.util.Pair.of;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.library.dependencies.SlicesRuleDefinition;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.data.util.Pair;

public class DependenciesTest extends AbstractArchitectureTest {

    @Test
    public void domainModelShouldNotDependOnDomainServices() {
        noClasses().that().resideInAPackage("..domain.model")
            .should().dependOnClassesThat()
            .resideInAnyPackage("..domain.service..")
            .check(ALL_CLASSES);
    }

    @Test
    public void controllerShouldDependentOnlyWithService() {
        classes().that().haveSimpleNameEndingWith("Controller")
            .should().onlyHaveDependentClassesThat()
            .haveSimpleNameContaining("Service")
            .check(ALL_CLASSES);
    }

    @Test
    public void serviceClassesShouldOnlyUsedByControllerOrServiceClassesOrAdapterClass() {
        classes()
            .that().resideInAPackage("com.vass.jos.backend.domain.service")
            .should().onlyBeAccessed()
                .byAnyPackage("com.vass.jos.backend.domain.service..",
                        "com.vass.jos.backend.application.usescases..",
                        "com.vass.jos.backend.ui..",
                        "com.vass.jos.backend.infrastructure..")
            .check(ALL_CLASSES);
    }

    @Test
    public void mapperShoulBeInMapperPackage() {
        classes().that().haveSimpleNameEndingWith("Mapper")
            .should().resideInAPackage("..mapper").check(ALL_CLASSES);
    }

    @Test
    public void springFieldDependencyInjectionShouldNotBeUsed() {
        NO_CLASSES_SHOULD_USE_FIELD_INJECTION.check(ALL_CLASSES);
    }

    @Test
    public void  thereShouldBeNoCyclicalDependenciesBetweenClasses(){

        SlicesRuleDefinition.slices().matching("com.vass.jos.(*)..")
            .should().beFreeOfCycles().check(ALL_CLASSES);
    }

    @Test
    public void onionArchitectureTest(){
        onionArchitecture()
                .domainModels("com.vass.jos.backend.domain.model..")
                .domainServices("com.vass.jos.backend.domain.service..")
                .applicationServices("com.vass.jos.backend.application..")
                .adapter("persistence","com.vass.jos.backend.infrastructure.persistence..")
                .adapter("rest","com.vass.jos.backend.ui.apirest.v1..")
            .check(AbstractArchitectureTest.ALL_CLASSES);
    }
}
