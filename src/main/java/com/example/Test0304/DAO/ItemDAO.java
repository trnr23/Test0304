package com.example.Test0304.DAO;

import com.example.Test0304.Model.Item;

public interface ItemDAO {
    void saveItem(Item item);
    Item getItem(String id);
    void updateItem(String id, Item item);
    void deleteItem(String id);
}
