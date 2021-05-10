package com.marui.dao;

import com.marui.domain.Items;

/**
 * 商品持久层接口
 * @author MaRui
 * @date 2021-05-07 10:21
 */
public interface IItemsDao {
    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    public Items findById(Integer id);
}
