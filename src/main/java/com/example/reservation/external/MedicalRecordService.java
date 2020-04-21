package com.example.reservation.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "diagnosis", url = "http://localhost:8083")
public interface MedicalRecordService {

    @RequestMapping(method = RequestMethod.POST, path = "/medicalRecords")
    public void diagnosis(@RequestBody MedicalRecord medicalRecord);
}
