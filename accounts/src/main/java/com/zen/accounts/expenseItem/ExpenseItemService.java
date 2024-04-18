package com.zen.accounts.expenseItem;

import java.util.*;
import com.zen.accounts.expenseItem.model.ExpenseItem;

public interface ExpenseItemService {
    public Long saveExpenseItem(ExpenseItem expenseItem);

    public ExpenseItem getExpenseItem(Long id);

    public List<ExpenseItem> getExpenseItems();
}
