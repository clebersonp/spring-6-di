package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author cleberson
 */
@Profile(value = {"uat"})
@Service
public class DatasourceUat implements DatasourceService {
    @Override
    public String getDatasource() {
        return "jdbc:postgresql://localhost:5432/my-database-uat";
    }
}
