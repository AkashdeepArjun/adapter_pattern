package home;

public class QuantityAdapterImp implements QuantityAdapter  {

    Quantity type;

    public QuantityAdapterImp(Quantity q){
        this.type=q;
    }

@Override
public String getUnits() {
    
    return type.getUnits();
}
    
}
