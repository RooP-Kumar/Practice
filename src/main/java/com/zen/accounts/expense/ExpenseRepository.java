package com.zen.accounts.expense;

import com.zen.accounts.expense.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository  extends JpaRepository<Expense, Long> {
}
