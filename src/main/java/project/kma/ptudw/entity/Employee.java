/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.entity;

import java.time.LocalDateTime;
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
public class Employee {

  private int id;
  private String empName;
  private String address;
  private String phone;
  private LocalDateTime startJob;
  private String sex;
  private String email;
  private String password;
  private String role;
  private String status;
}
