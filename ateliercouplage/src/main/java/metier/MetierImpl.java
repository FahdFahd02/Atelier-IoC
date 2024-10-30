package metier;

import data.IData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("data")
    private IData datacall;

    @Override
    public double calcule() {
        double data = datacall.getData();
        return data * 15.6;
    }
    public void setDatacall(IData datacall) {
        this.datacall = datacall;
    }
}