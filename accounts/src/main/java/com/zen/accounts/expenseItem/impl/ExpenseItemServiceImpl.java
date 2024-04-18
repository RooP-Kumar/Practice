package com.zen.accounts.expenseItem.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zen.accounts.expenseItem.ExpenseItemRepository;
import com.zen.accounts.expenseItem.ExpenseItemService;
import com.zen.accounts.expenseItem.model.ExpenseItem;

@Service
public class ExpenseItemServiceImpl implements ExpenseItemService {

    private ExpenseItemRepository expenseItemRepo;
    

    public ExpenseItemServiceImpl(ExpenseItemRepository expenseItemRepo) {
        this.expenseItemRepo = expenseItemRepo;
    }

    @Override
    public Long saveExpenseItem(ExpenseItem expenseItem) {
        this.expenseItemRepo.save(expenseItem);
        return expenseItem.getId();
    }

    @Override
    public ExpenseItem getExpenseItem(Long id) {
        return this.expenseItemRepo.findById(id).orElse(null);
    }

    @Override
    public List<ExpenseItem> getExpenseItems() {
        return this.expenseItemRepo.findAll();
    }
    
}
