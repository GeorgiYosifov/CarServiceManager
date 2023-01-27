package com.informatics.CarServiceManager.services;

import com.informatics.CarServiceManager.data.entity.Client;
import com.informatics.CarServiceManager.web.view.ClientView;

import java.util.List;


public interface ClientService
{
  Client create(Client addNewClient);

  Client updateClient(Long id, Client updateClient);

  void deleteClient(Long id);

  List<ClientView> findAllClientsByGarageId(Long id);

}
