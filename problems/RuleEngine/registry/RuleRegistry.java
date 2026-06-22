package problems.RuleEngine.registry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import problems.RuleEngine.models.ExpenseType;
import problems.RuleEngine.services.ExpenseRule;
import problems.RuleEngine.services.impl.DisallowRule;
import problems.RuleEngine.services.impl.MaxAmountRule;;


public class RuleRegistry {
    public static Map<ExpenseType, List<ExpenseRule>> getRules(){

    Map<ExpenseType, List<ExpenseRule>> map = new HashMap<>();
    map.put(ExpenseType.RESTAURANT, List.of(
        new MaxAmountRule(75.0)
    )
    );

    map.put(ExpenseType.AIRFARE, List.of(
        new DisallowRule()
    )
    );

    map.put(ExpenseType.ENTERTAINMENT, List.of(
        new DisallowRule()
    )
    );

    return map;
}

    public static List<ExpenseRule> getAllExpenseRules(){
        List<ExpenseRule> rules = List.of(
            new MaxAmountRule(1000.0)
            
        );

        return rules;
    }

}
