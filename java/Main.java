class Main {

    public static void main(String[] args){   
        System.out.println("Hola Mundo");

        Car car = new Car("AMQ123", new Account("Andres Herrera" , "AND123"));
        car.passenger = 4;
        car.printDataCar(); // Aqui llamamos al metodo

        Car car2 = new Car("QWE547" , new Account("Yorby Correa", "YCP897"));
        car2.printDataCar();



        
    }
}