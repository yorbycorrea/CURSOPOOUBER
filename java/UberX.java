public class UberX extends Car {   // esta clase hereda de la clase Car
    String brand;
    String model;


    public UberX(String license, Account driver, String brand, String model){
        super(license, driver);  // super reemplza a la super clase
        this. brand = brand;
        this.model = model;
    }
    
}
