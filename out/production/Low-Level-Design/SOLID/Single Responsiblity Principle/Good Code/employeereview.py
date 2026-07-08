
from employee import Employee

class EmployeeReview:
    def __init__(self, e: Employee) -> None:
        self.employee = e.id

    def conduct_review(self) -> None:
        # processing the review of the employee from various parameters
        print(f"Performance review for {self.employee.get_name()}")