package com.finflowz.moterinsurancebackend.repo;

import com.finflowz.moterinsurancebackend.entity.MoterDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MoterInsuranceRepo extends JpaRepository<MoterDetails,Integer> {

    Optional<MoterDetails> findByregistrationNumber(String registrationNumber);

}
