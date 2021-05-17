package com.example.test.controller;

import com.example.test.bean.ActivityBean;
import com.example.test.bean.OrganizationBean;
import com.example.test.service.ActivityService;
import com.example.test.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganizationController {
    //将Service注入Web层
    @Autowired
    OrganizationService organizationService;

    @RequestMapping(value = "/getOrganization", method = RequestMethod.GET)
    public List<OrganizationBean> getOrganizationInfo(){
        return organizationService.getInfo();
    }

    @RequestMapping(value = "/findByKeyword", method = RequestMethod.GET)
    public List<OrganizationBean> findByKeyword(String keyword){

        return organizationService.findByKeyword("contact@");
    }
}
