package com.informatics.CarServiceManager.services;

import com.informatics.CarServiceManager.data.entity.Vehicle;
import com.informatics.CarServiceManager.web.view.VehicleInfoView;

import java.math.BigDecimal;
import java.util.List;

public interface VehicleService
{
  Vehicle create(Vehicle vehicle);

  void fixVehicle(Long id, BigDecimal amountOfMoney);

  void deleteVehicle(Long id);

  List<VehicleInfoView> findAllVehiclesByClientId(Long id);
}
