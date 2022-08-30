from car import Car

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car()
    car.license = "MTR456"
    car.driver = "Elizabeth Correa"
    print(vars(car))
    
    car2 = Car()
    car2.license = "RTE398"
    car2.driver = "letty Arceles"
    print(vars(car2))
    
    