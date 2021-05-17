package com.example.test.servicelmpl;

import com.example.test.bean.ActivityBean;
import com.example.test.bean.VegetationBean;
import com.example.test.mapper.ActivityMapper;
import com.example.test.service.ActivityService;
import com.example.test.service.VegetationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    //将DAO注入Service层
    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public List<ActivityBean> getInfo() {
        return activityMapper.getInfo();
    }
}
