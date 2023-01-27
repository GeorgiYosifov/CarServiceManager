package com.informatics.CarServiceManager.data.repository;

import com.informatics.CarServiceManager.data.entity.Vehicle;
import com.informatics.CarServiceManager.web.view.VehicleInfoView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>
{
  List<Vehicle> findAllVehiclesByClientId(Long id);

  List<Vehicle> findVehicleByLicensePlate(String licensePlate);
}
