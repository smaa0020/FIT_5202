package com.example.test.service;

import com.example.test.bean.ActivityBean;
import com.example.test.bean.OrganizationBean;

import java.util.List;

public interface OrganizationService {
    List<OrganizationBean> getInfo();

    List<OrganizationBean> findByKeyword(String keyword);

    List<OrganizationBean> findByFeature(String keyword);
}
