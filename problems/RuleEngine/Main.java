package problems.RuleEngine;

import problems.RuleEngine.utils.RuleEngine;
import problems.RuleEngine.models.Expense;
import problems.RuleEngine.models.ExpenseType;
import java.util.*;
import problems.RuleEngine.services.Violation;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Expense>> tripExpenses = new HashMap<>();
        List <Expense> expenseList = List.of(
            new Expense("1", "trip1", 100.0, ExpenseType.RESTAURANT),
            new Expense("2", "trip1", 200.0, ExpenseType.AIRFARE),
            new Expense("3", "trip1", 300.0, ExpenseType.ENTERTAINMENT),
            new Expense("4", "trip1", 50.0, ExpenseType.RESTAURANT),
            new Expense("5", "trip1", 150.0, ExpenseType.AIRFARE),
            new Expense("6", "trip1", 250.0, ExpenseType.ENTERTAINMENT)
        );

         for (Expense e: expenseList){
            if (!tripExpenses.containsKey(e.getTripId())) {
                tripExpenses.put(e.getTripId(), new ArrayList<>());
            }
            tripExpenses.get(e.getTripId()).add(e);
        }
        RuleEngine ruleEngine = new RuleEngine(expenseList, tripExpenses);

        List<Optional<Violation>> violations = ruleEngine.run();
        

       

        for (Optional<Violation> violation : violations) {
            System.out.println(violation.orElse(Violation.of("No violation")).getMessage());
            
        }

    }
}
