package dio.gof.facade;

import dio.gof.subsystem1.CrmService;
import dio.gof.subsystem2.CepService;

public class Facade {
    public void migrateCient(String name, String cep) {
        String cidade = CepService.getInstance().findCityBy(cep);
        String estado = CepService.getInstance().findStateBy(cep);
        CrmService.saveClient(name, cep, cidade, estado);
    }
}
