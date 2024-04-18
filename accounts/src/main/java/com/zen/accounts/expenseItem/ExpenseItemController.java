package com.zen.accounts.expenseItem;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zen.accounts.expenseItem.model.ExpenseItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("expenseitem")
public class ExpenseItemController {
    private ExpenseItemService expenseItemService;

    public ExpenseItemController(ExpenseItemService expenseItemService) {
        this.expenseItemService = expenseItemService;
    } 

    @GetMapping
    public ResponseEntity<List<ExpenseItem>> getExpenseItems() {
        List<ExpenseItem> expenseItems = this.expenseItemService.getExpenseItems();
        return ResponseEntity.ok(expenseItems);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExpenseItem> getExpenseItem(@PathVariable Long id) {
        ExpenseItem expenseItem = this.expenseItemService.getExpenseItem(id);
        if (expenseItem != null) {
            return ResponseEntity.ok(expenseItem);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
}
