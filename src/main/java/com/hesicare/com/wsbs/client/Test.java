package com.hesicare.com.wsbs.client;

import com.hesicare.com.wsbs.client.service.SyncInfoService;
import com.hesicare.com.wsbs.client.service.SyncInfoServiceImplService;
import org.springframework.util.DigestUtils;

public class Test {
    public static void main(String[] args) {
        String name="Y0001";
        String pwd="TBRNnITWNj6ZS1c6CeeSqg==";
        String s=name+pwd+"20200728";
        String sign = DigestUtils.md5DigestAsHex(s.getBytes());
        SyncInfoServiceImplService syncInfoServiceImplService=new SyncInfoServiceImplService();
        SyncInfoService syncInfoService=syncInfoServiceImplService.getSyncInfoServiceImplPort();
        Object login = syncInfoService.login(name, pwd, sign);
        System.out.println("获得令牌"+login);
        Object patientInfo = syncInfoService.getPatientInfo(name, String.valueOf(login), "202006240001");
        System.out.println("患者信息"+patientInfo);
        Object o = syncInfoService.setBGResult("Y0001","2fe484d3a8df35fb66429e0ed8ed160d","202007270001","8.6");
        System.out.println("推送血糖结果"+o);
    }
}
