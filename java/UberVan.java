import java.util.ArrayList;
import java.util.Map;

class UberVan  extends Car{
    Map<String,  Map<String, Integer>> typerCarAccepter;
    ArrayList<String> seatsMaterial;



    public UberVan (String license, Account driver,Map<String,  Map<String, Integer>> typerCarAccepter,
    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typerCarAccepter = typerCarAccepter;
        this.seatsMaterial = seatsMaterial;

    }
}        