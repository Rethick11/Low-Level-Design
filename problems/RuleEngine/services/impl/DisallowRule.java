package problems.RuleEngine.services.impl;
import java.util.Optional;
import problems.RuleEngine.services.ExpenseRule;
import problems.RuleEngine.services.Violation;
import problems.RuleEngine.models.Expense;


public class DisallowRule implements ExpenseRule {
    @Override
    public Optional<Violation> check(Expense expense){
        return Optional.of(Violation.of(expense.getExpenseType() + " is not allowed"));
    }
}
