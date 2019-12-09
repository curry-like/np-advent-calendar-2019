package org.acme.quickstart.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserServiceImpl implements UserService {

    @Override
    public String findById(int id) {
        return "テスト太郎";
    }
}
