package com.marui.service;

import com.marui.domain.Items;

/**
 * 商品业务层接口
 * @author MaRui
 * @date 2021-05-07 10:59
 */
public interface IItemsService {
    /**
     * 根据id查询商品
     *
     * @param id
     * @return
     */
    public Items findById(Integer id);
}
