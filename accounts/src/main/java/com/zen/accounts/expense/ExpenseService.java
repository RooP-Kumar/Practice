package com.zen.accounts.expense;

import com.zen.accounts.expense.model.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> getAllExpense();

    void addExpense(Expense expense);

    void addExpenses(List<Expense> expenses);
}
