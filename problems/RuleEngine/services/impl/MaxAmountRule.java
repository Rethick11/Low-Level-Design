package problems.RuleEngine.services.impl;
import java.util.Optional;
import problems.RuleEngine.services.ExpenseRule;
import problems.RuleEngine.services.Violation;
import problems.RuleEngine.models.Expense;

public class MaxAmountRule implements ExpenseRule {

    private final double maxAmount;

    public MaxAmountRule(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    @Override
    public Optional<Violation> check(Expense expense) {
        if (expense.getAmountUsd() > maxAmount) {
            return Optional.of(Violation.of( expense.getExpenseType() + "Expense amount exceeds maximum allowed limit of " + maxAmount));
        }
        return Optional.empty();

    }
    
}
