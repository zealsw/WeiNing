package com.hesicare.health.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hesicare.health.entity.BloodPressure;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface DataPressureDao extends BaseMapper<BloodPressure> {
    @Update("update data_blood_pressure set  status=#{status} where id=#{id}")
    int updatebyid(@Param("id") Long id, @Param("status") int status);
        }
 