from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    
    car = Car("AMR456" , Account("Anres Herrera " , "AND875"))
    print(vars(car))
    print(vars(car.driver))
    
    