class Employee:
    def __init__(self, id:int,  name: str, position: str, salary: float):
        self.id = id
        self.name = name
        self.position = position
        

    def get_name(self) -> str:
        return self.name

    def get_position(self) -> str:
        return self.position


    
    def set_name(self, name: str) -> None:
        self.name = name

    def set_position(self, position: str) -> None:
        self.position = position

  

