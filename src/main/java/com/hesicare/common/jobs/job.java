package com.hesicare.common.jobs;

import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hesicare.common.utils.wonders.InterfaceEnCode;
import com.hesicare.health.dao.PressureDao;
import com.hesicare.health.entity.BloodPressure;
import com.hesicare.health.entity.PatientBloodPressureView;
import com.hesicare.health.entity.PersonMeasureData;
import com.hesicare.health.services.Push;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class job {
    @Autowired
    private PressureDao pressureDao;
    @Autowired
    private Push push;
    @Scheduled(cron = "0 0/1 * * * ?")
    public void doPressure() throws Exception {
        List<BloodPressure> pressuress= pressureDao.selectList(null);
        PersonMeasureData personMeasureData=new PersonMeasureData();
        for (BloodPressure bloodPressure : pressuress) {
            /*设置中间表字段值  接着写*/
            personMeasureData.setSystolic(String.valueOf(bloodPressure.getSystolic()));
            personMeasureData.setDiastolic(String.valueOf(bloodPressure.getDiastolic()));

            int pushcenter = push.pushcenter(personMeasureData);
            if(pushcenter>0){
                pressureDao.updatebyid(bloodPressure.getId(),2);
            }
            personMeasureData=null;
        }


    }

}
