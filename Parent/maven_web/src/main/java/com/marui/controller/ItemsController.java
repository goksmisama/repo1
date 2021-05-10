package com.marui.controller;

import com.marui.domain.Items;
import com.marui.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类
 * @author MaRui
 * @date 2021-05-07 11:28
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private IItemsService iItemsService;

    @RequestMapping("/findById")
    public String findById(Model model) {
        Items items = iItemsService.findById(1);
        model.addAttribute("item", items);
        return "itemDetail";
    }
}
