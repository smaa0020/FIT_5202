package com.example.test.mapper;

import com.example.test.bean.VegetationBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VegetationMapper {

    List<VegetationBean> getInfo();

}
