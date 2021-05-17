package com.example.test.servicelmpl;

import com.example.test.bean.VegetationBean;
import com.example.test.bean.WildlifeBean;
import com.example.test.mapper.VegetationMapper;
import com.example.test.mapper.WildlifeMapper;
import com.example.test.service.VegetationService;
import com.example.test.service.WildlifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WildlifeServiceImpl implements WildlifeService {
    //将DAO注入Service层
    @Autowired
    private WildlifeMapper wildlifeMapper;

    @Override
    public List<WildlifeBean> getInfo() {
        return wildlifeMapper.getInfo();
    }
}