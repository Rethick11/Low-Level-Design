from ruleTypes import LimitRule, CategoryBlockRule, ExpenseRule
from typing import Dict, List

class ExpenseRuleEngine:
    def __init__(self, rules: List[ExpenseRule]):
        self.rules = rules

    def evaluate(self, expenses: List[Dict]) -> List[Dict]:
        results = []
        for e in expenses:
            for r in self.rules:
                result = r.apply(e)
                if result.status == "Rejected":
                    results.append({
                        "id": e["id"],
                        "status": result.status,
                        "message": result.message
                    })
                    break
            else:
                results.append({
                    "id": e["id"],
                    "status": "Accepted",
                    "message": "All OK"
                })
        return results


rules = [
    LimitRule(category="restaurant", field="amount", min_value=0, max_value=100),
    LimitRule(category="travel", field="amount", min_value=0, max_value=200),
    CategoryBlockRule(field="category", disallowed_values=["pub", "bar"]),
]

expenses = [
    {"id": 1, "category": "restaurant", "amount": 120},
    {"id": 2, "category": "travel", "amount": 150},
    {"id": 3, "category": "pub", "amount": 50},
]

engine = ExpenseRuleEngine(rules)
output = engine.evaluate(expenses)

for o in output:
    print(o)
