from car import Car


class UberVan (Car):
    typerCarAccepter = []
    seatsMaterial    = []
    
    
    def __init__(self,license, driver, typerCarAccepter, seatsMaterial):
        super().__init__(license, driver)
        self.typerCarAccepter = typerCarAccepter
        self.seatsMaterial = seatsMaterial