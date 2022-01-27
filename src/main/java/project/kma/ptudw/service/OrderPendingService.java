/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.service;

import project.kma.ptudw.entity.OrderPending;

/**
 *
 * @author Duy Nien
 */
public class OrderPendingService extends BaseService<OrderPending>{

  @Override
  protected Class<OrderPending> classEntity() {
    return OrderPending.class; //To change body of generated methods, choose Tools | Templates.
  }
  
}
