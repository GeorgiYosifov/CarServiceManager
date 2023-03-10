package com.informatics.CarServiceManager.data.repository;

import com.informatics.CarServiceManager.data.entity.KindOfServices;
import com.informatics.CarServiceManager.data.entity.Mechanic;
import com.informatics.CarServiceManager.dto.MechanicDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MechanicRepository extends JpaRepository<Mechanic, Long>
{
  // List<Vehicle> findAllVehiclesByClientId(Long id);
  List<Mechanic> findAllMechanicsByGarageId(Long id);

  List<Mechanic> findMechanicByQualificationAndGarageId(String qualification,Long id);
}
