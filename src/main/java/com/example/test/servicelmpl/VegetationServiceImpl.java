package com.example.test.servicelmpl;
import com.example.test.bean.UserBean;
import com.example.test.bean.VegetationBean;
import com.example.test.mapper.UserMapper;
import com.example.test.mapper.VegetationMapper;
import com.example.test.service.VegetationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetationServiceImpl implements VegetationService {
    //将DAO注入Service层
    @Autowired
    private VegetationMapper vegetationMapper;

    @Override
    public List<VegetationBean> getInfo() {
        return vegetationMapper.getInfo();
    }
}

