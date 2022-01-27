/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.client.RestTemplate;
import project.kma.ptudw.entity.Drink;

public class DrinkService extends BaseService<Drink> {

  private RestTemplate restTemplate;

  public DrinkService() {
    restTemplate = new RestTemplate();
  }

  @Override
  protected Class<Drink> classEntity() {
    return Drink.class;
  }

  public List<Drink> getDrinksByTypeId(String getURL, int typeId) {
    try {
      URI uri = new URI(getURL+"/"+typeId);
      Drink[] responseEntity = restTemplate
              .getForObject(uri, Drink[].class);
      List<Drink> result = Arrays.asList(responseEntity);
      return result;
    } catch (URISyntaxException ex) {
      Logger.getLogger(DrinkService.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }
}
