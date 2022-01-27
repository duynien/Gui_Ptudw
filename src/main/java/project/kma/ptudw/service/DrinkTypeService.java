/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.service;

import java.net.URI;
import org.springframework.web.client.RestTemplate;
import project.kma.ptudw.entity.DrinkType;

/**
 *
 * @author Duy Nien
 */
public class DrinkTypeService extends BaseService<DrinkType> {

  private RestTemplate restTemplate = new RestTemplate();

  @Override
  protected Class<DrinkType> classEntity() {
    return DrinkType.class;
  }

  public DrinkType getdDrinkTypeLike(String likeURL, String name) throws Exception {
    URI uri = new URI(likeURL + "/" + name);
    DrinkType entity = restTemplate.getForEntity(uri, DrinkType.class).getBody();
    return entity;
  }
}
