package com.example.Test0304.Service;

import com.example.Test0304.DAO.ItemDAOImp;
import com.example.Test0304.Model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemServiceImp implements ItemService {

    @Autowired
    private ItemDAOImp itemDAOImp;

    @Transactional
    @Override
    public void saveItem(Item item) {
        if(item.getRelatedItem() == null){
            System.out.println("Setting related item to none");
            item.setRelatedItem("none");
            System.out.println("related item:" + item.getRelatedItem());
        }

        try {
            itemDAOImp.saveItem(item);
        }catch (Exception e){
            System.out.println("Saving error " + e.getMessage());
        }

    }

    @Override
    public Item getItem(String id) {
        return null;
    }

    @Override
    public void updateItem(String id, Item item) {

    }

    @Override
    public void deleteItem(String id) {

    }
}
