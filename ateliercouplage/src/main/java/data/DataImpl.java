package data;

import org.springframework.stereotype.Component;

@Component("data")
public class DataImpl implements IData {
    @Override
    public double getData() {
        System.out.println("Récupération de la base de données");
        return 10;
    }
}
