package com.example.Test0304.Service;

import com.example.Test0304.Model.Item;

public interface ItemService {
    void saveItem(Item item);
    Item getItem(String id);
    void updateItem(String id, Item item);
    void deleteItem(String id);
}
