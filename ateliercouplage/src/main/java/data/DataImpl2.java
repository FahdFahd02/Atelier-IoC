package data;

import org.springframework.stereotype.Component;

@Component("dataImpl2")
public class DataImpl2 implements IData {
    @Override
    public double getData() {
        return 20;
    }
}
