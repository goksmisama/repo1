package com.marui.service.impl;

import com.marui.dao.IItemsDao;
import com.marui.domain.Items;
import com.marui.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author MaRui
 * @date 2021-05-07 11:08
 */
@Service("itemsService")
public class ItemsServiceImpl implements IItemsService {
    @Autowired
    private IItemsDao itemsDao;
    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(1);
    }
}
