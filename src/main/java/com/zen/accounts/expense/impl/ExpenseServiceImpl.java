package com.zen.accounts.expense.impl;

import com.zen.accounts.expense.ExpenseService;
import com.zen.accounts.expense.model.Expense;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    private final List<Expense> expenses = new ArrayList<>();
    @Override
    public List<Expense> getAllExpense() {
        return expenses;
    }

    @Override
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    @Override
    public void addExpenses(List<Expense> givenExpenses) {
        expenses.addAll(givenExpenses);
    }
}
