package com.example.test.mapper;

import com.example.test.bean.OrganizationBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationMapper {
    List<OrganizationBean> getInfo();

    List<OrganizationBean> findByKeyword(@Param("keyword") String keyword);

    List<OrganizationBean> findByFeature(@Param("keyword") String keyword);
}
