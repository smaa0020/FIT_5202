package com.example.test.controller;

import com.example.test.bean.ActivityBean;
import com.example.test.bean.VegetationBean;
import com.example.test.service.ActivityService;
import com.example.test.service.VegetationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActivityController {

    //将Service注入Web层
    @Autowired
    ActivityService activityService;

    @RequestMapping(value = "/getActivity", method = RequestMethod.GET)
    public List<ActivityBean> getActivityInfo(){
        return activityService.getInfo();
    }

}
