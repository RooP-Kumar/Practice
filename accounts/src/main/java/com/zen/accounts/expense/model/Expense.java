package com.zen.accounts.expense.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zen.accounts.Constants;
import com.zen.accounts.expenseItem.model.ExpenseItem;

@Entity
public class Expense {

    @Id
    private Long id;
    private String title;

    @JsonFormat(pattern = Constants.date_formatter_patter_string)
    private Date date;

    private Long totalAmount;

    @OneToMany
    private List<ExpenseItem> items;

    public Expense() {
    }

    public Expense(Long id, String title, Date date, Long totalAmount, List<ExpenseItem> items) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.totalAmount = totalAmount;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<ExpenseItem> getItems() {
        return items;
    }

    public void setItems(List<ExpenseItem> items) {
        this.items = items;
    }
}
