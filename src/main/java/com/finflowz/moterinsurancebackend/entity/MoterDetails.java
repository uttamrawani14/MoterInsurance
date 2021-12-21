package com.finflowz.moterinsurancebackend.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoterDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private Date previousPolicyEndDate;
  private String claimsInCurrentPolicy;
  private String compulsoryDeductible;
  private String claimInCurrentPolicy;
  private String voluntryDeductible;
  private String ncb;
  private  String registeredUnder;
  private int vehicleOwner;
  private String previouspolicyType;
  private String previousPolicyInsurer;
  private String previousPolicyNumber;

  private String car;
  private String registrationNumber;
  private String engineNumber;
  private String chasisNumber;
  private String cityOfReg;
  private Date vehiclePurchaseDate;
  private String exShowroomPrice;
  private String previousPolicyDate;


  private String mobile;
  private String email;
  private String title;
  private String name;
  private String dob;
  private String gender;
  private String address;
  private int pinCode;
  private String cityAndState;
  private String nomineeName;
  private String nomineeDob;
  private String nomineeRelnship;

}
