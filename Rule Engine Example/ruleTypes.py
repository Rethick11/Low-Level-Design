from abc import ABC, abstractmethod
from typing import Dict, List, Any

class RuleResult:
    def __init__(self, status: str, message: str):
        self.status = status
        self.message = message

class ExpenseRule(ABC):
    @abstractmethod
    def apply(self, expense: Dict[str, Any]) -> RuleResult:
        pass


class LimitRule(ExpenseRule):
    def __init__(self, category: str, field: str, min_value: float, max_value: float):
        self.category = category
        self.field = field
        self.min_value = min_value
        self.max_value = max_value

    def apply(self, expense: Dict[str, Any]) -> RuleResult:
        if expense.get("category") == self.category:
            value = expense.get(self.field, 0)
            if not (self.min_value <= value <= self.max_value):
                return RuleResult("Rejected", f"{self.category} {self.field} should be between {self.min_value}-{self.max_value}")
        return RuleResult("Accepted", "OK")

class CategoryBlockRule(ExpenseRule):
    def __init__(self, field: str, disallowed_values: List[str]):
        self.field = field
        self.disallowed_values = disallowed_values

    def apply(self, expense: Dict[str, Any]) -> RuleResult:
        value = expense.get(self.field)
        if value in self.disallowed_values:
            return RuleResult("Rejected", f"{value} expenses are not allowed")
        return RuleResult("Accepted", "OK")
