package guru.springframework.spring6di.controllers.faux;

import guru.springframework.spring6di.services.faux.DatasourceService;
import org.springframework.stereotype.Controller;

/**
 * @author cleberson
 */
@Controller
public class FauxController {
    private final DatasourceService datasourceService;

    public FauxController(DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getDatasource() {
        return this.datasourceService.getDatasource();
    }
}
