package com.example.test.mapper;

import com.example.test.bean.UserBean;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    UserBean getInfo(String password);

}
