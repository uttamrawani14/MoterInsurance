package com.finflowz.moterinsurancebackend.controller;

import com.finflowz.moterinsurancebackend.entity.MoterDetails;
import com.finflowz.moterinsurancebackend.service.MoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class MoterController {

    @Autowired
    private MoterService moterService;

    @PostMapping("insertData")
    public MoterDetails InsertData(@RequestBody MoterDetails moterDetails)
    {
        return moterService.InsertData(moterDetails);
    }

    @GetMapping("moter")
    public MoterDetails moterData(@RequestParam(value = "registrationNumber") String registrationNumber) {
        return moterService.moterData(registrationNumber);
    }
}
