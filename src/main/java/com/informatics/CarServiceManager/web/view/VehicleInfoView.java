package com.informatics.CarServiceManager.web.view;

import com.informatics.CarServiceManager.data.entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class VehicleInfoView extends BaseEntity
{
  private String    licensePlate;
  private String    brand;
  private String    petrol;
  private String    litres;
  private Long      horsePower;
  private String    drive;
  private LocalDate year;
  private String    mechanicDecision;
}
