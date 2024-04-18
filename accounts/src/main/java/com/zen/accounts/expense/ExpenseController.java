package com.zen.accounts.expense;

import com.zen.accounts.expense.model.Expense;
import com.zen.accounts.expenseItem.ExpenseItemService;
import com.zen.accounts.expenseItem.model.ExpenseItem;

import org.springframework.boot.actuate.autoconfigure.health.HealthProperties.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    private final ExpenseService expenseService;
    private final ExpenseItemService expenseItemService;

    public ExpenseController(
            ExpenseService expenseService,
            ExpenseItemService expenseItemService) {
        this.expenseService = expenseService;
        this.expenseItemService = expenseItemService;
    }

    @GetMapping
    public ResponseEntity<List<Expense>> getAllExpenses() {
        List<Expense> expenses = this.expenseService.getAllExpense();
        if(expenses.isEmpty()){
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(expenses, HttpStatus.OK);
        }
    }

    @PostMapping
    public void addExpense(@RequestBody Expense expense) {
        List<ExpenseItem> expenseItemList = expense.getItems();
        java.util.Iterator<ExpenseItem> iterator = expenseItemList.iterator();

        while (iterator.hasNext()) {
            ExpenseItem expenseItem = iterator.next();
            this.expenseItemService.saveExpenseItem(expenseItem);
        }
        this.expenseService.addExpense(expense);
    }

    @PostMapping("multi")
    public void addExpenses(@RequestBody List<Expense> expenses) {
        this.expenseService.addExpenses(expenses);
    }
}
