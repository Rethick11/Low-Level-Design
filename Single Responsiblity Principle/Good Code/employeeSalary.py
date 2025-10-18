
from employee import Employee

class EmployeeSalary:
    def __init__(self , e: Employee) -> None:
        self.salary = e.get_salary()

    def compute_annual_salary(self) -> float:

        # here goes the logic for the salary computation
        return self.salary * 12