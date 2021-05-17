package com.example.test.servicelmpl;

import com.example.test.bean.ActivityBean;
import com.example.test.bean.OrganizationBean;
import com.example.test.mapper.ActivityMapper;
import com.example.test.mapper.OrganizationMapper;
import com.example.test.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    //将DAO注入Service层
    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public List<OrganizationBean> getInfo() {
        return organizationMapper.getInfo();
    }

    @Override
    public List<OrganizationBean> findByKeyword(String keyword){
        return organizationMapper.findByKeyword(keyword);
    }

    @Override
    public List<OrganizationBean> findByFeature(String keyword){
        return organizationMapper.findByFeature(keyword);
    }

}
