package com.arjun.h2.h2db;

import com.arjun.h2.h2db.dao.OrderRepo;
import com.arjun.h2.h2db.dao.ProductRepo;
import com.arjun.h2.h2db.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.*;

@RestController
public class MyController {

    @Autowired
    ProductRepo repo;

    @Autowired
    OrderRepo repo2;

    @RequestMapping("/try")
    Map performOpt(){
        HashMap map = new HashMap();
        List<Product> list = repo.findAll();
        map.put("Item1", list.get(0).getProductName());
        return map;
    }
}
