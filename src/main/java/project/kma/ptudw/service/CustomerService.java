/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.service;

import project.kma.ptudw.entity.Customer;

/**
 *
 * @author Duy Nien
 */
public class CustomerService extends BaseService<Customer> {

  @Override
  protected Class<Customer> classEntity() {
    return Customer.class;
  }
}
