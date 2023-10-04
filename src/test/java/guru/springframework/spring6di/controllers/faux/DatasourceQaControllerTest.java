package guru.springframework.spring6di.controllers.faux;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author cleberson
 */
@ActiveProfiles(value = {"qa", "EN"})
@SpringBootTest
class DatasourceQaControllerTest {

    @Autowired
    private FauxController fauxController;

    @Test
    void getDatasource() {
        Assertions.assertThat(fauxController.getDatasource()).isEqualTo("jdbc:postgresql://localhost:5432/my-database-qa");
    }
}