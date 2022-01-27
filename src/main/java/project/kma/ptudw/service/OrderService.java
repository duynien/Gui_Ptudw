/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.service;

import project.kma.ptudw.entity.Order;

/**
 *
 * @author Duy Nien
 */
public class OrderService extends BaseService<Order>{
  @Override
  protected Class<Order> classEntity() {
    return Order.class;
  }
}
