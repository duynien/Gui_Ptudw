/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Duy Nien
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailSalary {

  private int id;

  private int month;
  private int year;
  private double price;
  private Employee employee;
}
