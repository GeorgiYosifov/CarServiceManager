package com.informatics.CarServiceManager.web.api;

import com.informatics.CarServiceManager.data.entity.Client;
import com.informatics.CarServiceManager.data.entity.Vehicle;
import com.informatics.CarServiceManager.services.ClientService;
import com.informatics.CarServiceManager.services.MechanicService;
import com.informatics.CarServiceManager.services.VehicleService;
import com.informatics.CarServiceManager.web.view.ClientView;
import com.informatics.CarServiceManager.web.view.MechanicView;
import com.informatics.CarServiceManager.web.view.VehicleInfoView;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

@RestController
@AllArgsConstructor
@Validated
@RequestMapping("/api/clients")
public class ClientController
{
  private final ClientService   clientService;
  private final VehicleService  vehicleService;
  private final MechanicService mechanicService;

  /**
   * This method returns all clients by garage id.
   *
   * @param id - garage id.
   * @return list of ClientView's objects.
   */
  @GetMapping("/get-all-clients-by-garage-id/{id}")
  public List<ClientView> getAllClientsByGarageId(@PathVariable("id") Long id)
  {
    return clientService.findAllClientsByGarageId(id);
  }

  /**
   * This method creates new Client.
   *
   * @param addNewClient - client's information.
   * @return created object.
   */
  @PostMapping("/add-new-client")
  public Client addNewClient(@RequestBody @Valid Client addNewClient)
  {
    return clientService.create(addNewClient);
  }

  /**
   * This method updates client by id.
   *
   * @param id           - id of the garage
   * @param updateClient - this object store information about client.
   * @return the updated object.
   */
  @PutMapping("/update-client/{id}")
  public Client updateClient(@PathVariable("id") Long id, @RequestBody @Valid Client updateClient)
  {
    return clientService.updateClient(id, updateClient);
  }

  /**
   * This method deletes client by id.
   *
   * @param id - id of the client
   */
  @DeleteMapping("/delete-client/{id}")
  public void deleteClient(@PathVariable("id") Long id)
  {
    clientService.deleteClient(id);
  }

  /**
   * This method returns all vehicles by client id.
   *
   * @param id - client id.
   * @return list of vehicle's objects.
   */
  @GetMapping("/find-all-vehicles-by-client-id/{id}")
  public List<VehicleInfoView> findAllVehiclesByClientId(@PathVariable("id") Long id)
  {
    return vehicleService.findAllVehiclesByClientId(id);
  }

  /**
   * This method creates new vehicle.
   *
   * @param vehicle - vehicle's information.
   * @return created object.
   */
  @PostMapping("/add-new-vehicle")
  public Vehicle addNewVehicle(@RequestBody @Valid Vehicle vehicle)
  {
    return vehicleService.create(vehicle);
  }

  /**
   * This method deletes vehicle by id.
   *
   * @param id - id of the vehicle
   */
  @DeleteMapping("/delete-vehicle/{id}")
  public void deleteVehicleById(@PathVariable("id") Long id)
  {
    vehicleService.deleteVehicle(id);
  }

  /**
   * This method fixes vehicle by id.
   *
   * @param id - id of the vehicle
   */
  @PatchMapping("/fix-vehicle/{id}/{amount}")
  public void fixVehicleById(@PathVariable("id") Long id,
                             @PathVariable("amount") BigDecimal amountOfMoney)
  {
    vehicleService.fixVehicle(id, amountOfMoney);
  }

  /**
   * This returns mechanics by qualification and garage id.
   *
   * @param qualification - type of qualification.
   * @param id            - garage id.
   * @return MechanicView's object.
   */
  @GetMapping("/get-mechanics-by-qualification-and-by-garage-id/{qualification}/{id}")
  public List<MechanicView> getMechanicsByQualificationAndByGarageId(@PathVariable("qualification") String qualification, @PathVariable("id") Long id)
  {
    return mechanicService.findMechanicByQualificationAndGarageId(qualification, id);
  }
}
