package com.lb.aop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author lb
 * @Title: OrderDao
 * @Description: TODO
 * @date 2019/03/04  18:58
 */
@Component
@Scope("prototype")
public class OrderDao {

    public void save() {
        System.out.println("-----核心业务：保存！！！------");
    }
}
