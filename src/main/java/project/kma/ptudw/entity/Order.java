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
public class Order {
    private int id;
    private Customer customer;
    private Employee employee;
    private LocalDateTime time;
    private double total;
    private String status;
}
