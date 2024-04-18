package com.zen.accounts.expense.impl;

import com.zen.accounts.expense.ExpenseRepository;
import com.zen.accounts.expense.ExpenseService;
import com.zen.accounts.expense.model.Expense;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private ExpenseRepository expenseRepo;

    public ExpenseServiceImpl(ExpenseRepository expenseRepo) {
        this.expenseRepo = expenseRepo;
    }

    @Override
    public List<Expense> getAllExpense() {
        return expenseRepo.findAll();
    }

    @Override
    public void addExpense(Expense expense) {
        expenseRepo.save(expense);
    }

    @Override
    public void addExpenses(List<Expense> givenExpenses) {
        expenseRepo.saveAll(givenExpenses);
    }
}
