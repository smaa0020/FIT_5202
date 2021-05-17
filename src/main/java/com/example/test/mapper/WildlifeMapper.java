package com.example.test.mapper;

import com.example.test.bean.WildlifeBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WildlifeMapper {

    List<WildlifeBean> getInfo();

}
