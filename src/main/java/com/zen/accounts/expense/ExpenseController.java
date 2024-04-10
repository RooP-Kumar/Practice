package com.zen.accounts.expense;


import com.zen.accounts.expense.model.Expense;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return this.expenseService.getAllExpense();
    }

    @PostMapping
    public void addExpense(@RequestBody Expense expense) {
        this.expenseService.addExpense(expense);
    }

    @PostMapping("multi")
    public void addExpenses(@RequestBody List<Expense> expenses) {
        this.expenseService.addExpenses(expenses);
    }
}
