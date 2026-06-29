package problems.RuleEngine.utils;
import java.util.*;
import problems.RuleEngine.models.Expense;
import problems.RuleEngine.models.ExpenseType;
import problems.RuleEngine.services.ExpenseRule;
import problems.RuleEngine.registry.RuleRegistry;
import problems.RuleEngine.services.Violation;

public class RuleEngine {
    private final List<Expense> expenseList;
    private final Map<ExpenseType, List<ExpenseRule>> rules;
    private final Map<String, List<Expense>> tripExpenses;
    
    public RuleEngine(List<Expense> expenseList, Map<String, List<Expense>> tripExpenses) {
        this.expenseList = expenseList;
        this.rules = RuleRegistry.getRules();
        this.tripExpenses = tripExpenses;
    }

    public List<Optional<Violation>> run(){
        List<Optional<Violation>> violations = new ArrayList<>();
        for (Expense e : expenseList){
            for (ExpenseRule rule: rules.get(e.getExpenseType())){
                violations.add(rule.check(e));
            }
        }
        return violations;
    }

}
