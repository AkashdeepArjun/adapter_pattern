package home;

public class Test {

    public static void main(String[] args){

        Quantity liquid= new Liquid();
        QuantityAdapterImp quantityAdapterImp=new QuantityAdapterImp(liquid);
        QuantityAdapterImp veg_adapter_imp=new QuantityAdapterImp((Quantity)new Vegetables());
        System.out.println(quantityAdapterImp.getUnits());
        System.out.println(veg_adapter_imp.getUnits());
        
        

    }
    
    
}
