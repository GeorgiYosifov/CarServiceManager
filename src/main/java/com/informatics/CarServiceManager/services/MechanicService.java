package com.informatics.CarServiceManager.services;

import com.informatics.CarServiceManager.data.entity.Mechanic;
import com.informatics.CarServiceManager.dto.MechanicDTO;
import com.informatics.CarServiceManager.web.view.MechanicView;

import java.util.List;

public interface MechanicService
{
  List<MechanicDTO> getMechanicsByGarageId(Long id);

  Mechanic hireMechanic(Mechanic hireMechanic);

  void fireMechanic(Long id);

  List<Mechanic> findAllMechanicsByGarageId(Long id);

  List<MechanicView> findMechanicByQualificationAndGarageId(String qualification, Long id);
}
