package com.finflowz.moterinsurancebackend.service;

import com.finflowz.moterinsurancebackend.entity.MoterDetails;
import com.finflowz.moterinsurancebackend.repo.MoterInsuranceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MoterService {

    private MoterInsuranceRepo moterInsuranceRepo;

    @Autowired
    public MoterService(MoterInsuranceRepo moterInsuranceRepo) {
        this.moterInsuranceRepo = moterInsuranceRepo;
    }


    public MoterDetails InsertData(MoterDetails moterDetails) {
        System.out.println(moterDetails.toString());
        return moterInsuranceRepo.save(moterDetails);
    }

    public MoterDetails moterData(String registrationNumber) {
        Optional<MoterDetails> moterData = moterInsuranceRepo.findByregistrationNumber(registrationNumber);
        MoterDetails moterDetails = null;    
        if (moterData.isPresent())
            {
                moterDetails= moterData.get();
            }
        return moterDetails;
    }
}
