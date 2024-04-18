package com.zen.accounts.expenseItem;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zen.accounts.expenseItem.model.ExpenseItem;

public interface ExpenseItemRepository extends JpaRepository<ExpenseItem, Long> {}
