package com.zen.accounts.expenseItem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExpenseItem {
    @Id
    private Long id;
    
    private String itemName;
    private String itemType;
    private Long itemPrice;
    private int itemQty;
    private String itemFrom; // Only for itemType = Travel
    private String itemDestination; // Only for itemType = Travel

    public ExpenseItem() {
    }

    public ExpenseItem(Long id, String itemName, String itemType, Long itemPrice, int itemQty, String itemFrom, String itemDestination) {
        this.id = id;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemPrice = itemPrice;
        this.itemQty = itemQty;
        this.itemFrom = itemFrom;
        this.itemDestination = itemDestination;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Long getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

    public String getItemFrom() {
        return itemFrom;
    }

    public void setItemFrom(String itemFrom) {
        this.itemFrom = itemFrom;
    }

    public String getItemDestination() {
        return itemDestination;
    }

    public void setItemDestination(String itemDestination) {
        this.itemDestination = itemDestination;
    }
}
