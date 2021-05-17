package com.example.test.controller;
import com.example.test.bean.UserBean;
import com.example.test.bean.VegetationBean;
import com.example.test.bean.WildlifeBean;
import com.example.test.service.UserService;
import com.example.test.service.VegetationService;
import com.example.test.service.WildlifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BiodiversityController {

    //将Service注入Web层
    @Autowired
    VegetationService vegetationService;

    @Autowired
    WildlifeService wildlifeService;

    @RequestMapping(value = "/getVege", method = RequestMethod.GET)
    public List<VegetationBean> getVegeInfo(){
        return vegetationService.getInfo();
    }

    @RequestMapping(value = "/getWild", method = RequestMethod.GET)
    public List<WildlifeBean> getWildInfo(){
        return wildlifeService.getInfo();
    }

}
