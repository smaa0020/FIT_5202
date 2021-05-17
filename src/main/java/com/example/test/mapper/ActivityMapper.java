package com.example.test.mapper;


import com.example.test.bean.ActivityBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityMapper {

    List<ActivityBean> getInfo();

}
