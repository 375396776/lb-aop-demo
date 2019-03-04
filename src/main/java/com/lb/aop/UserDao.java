package com.lb.aop;

import org.springframework.stereotype.Component;

/**
 * @author lb
 * @Title: UserDao
 * @Description: TODO
 * @date 2019/03/04  18:57
 */
@Component
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("-----核心业务：保存！！！------");
    }
}
