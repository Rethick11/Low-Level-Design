
class Employee:
    def __init__(self, name: str, position: str, salary: float):
        self.name = name
        self.position = position
        self.salary = salary

    def get_details(self) -> str:
        return f"Name: {self.name}, Position: {self.position}, Salary: {self.salary}"
    
    def set_details(self, name: str, position: str, salary: float) -> None:
        self.name = name
        self.position = position
        self.salary = salary
    
    def salary_computation(self) -> float:
        # some backend computation
        return self.salary * 12

    def performance_review(self) -> None:
        # processing the review of the employee from various parameters
        print(f"Performance review for {self.name}")
