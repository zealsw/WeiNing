package com.hesicare.health.services;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.hesicare.health.entity.PersonMeasureData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/*动态数据源*/
@DS("Slave_1")
public class Push {
   /**
    * @Author lishiwei
    * @Description Todo
    * @Date 17:16 2020/9/15
    * @Param [personMeasureData]
    * @return int
    **/
    public int pushcenter(PersonMeasureData personMeasureData) {
        return 0;
    }
}
