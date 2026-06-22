package problems.RuleEngine.services;
import java.util.Optional;
import problems.RuleEngine.models.Expense;


public interface ExpenseRule {
    Optional<Violation> check(Expense expense);
}
