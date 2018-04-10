package com.example.Test0304.DAO;

import com.example.Test0304.Model.Item;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ItemDAOImp implements ItemDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void saveItem(Item item) {
        em.persist(item);

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
