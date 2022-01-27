/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.client.RestTemplate;
import project.kma.ptudw.entity.DetailSalary;
import project.kma.ptudw.entity.DrinkType;

/**
 *
 * @author Duy Nien
 */
public class SalaryService extends BaseService<DetailSalary> {

  private RestTemplate restTemplate = new RestTemplate();

  @Override
  protected Class<DetailSalary> classEntity() {
    return DetailSalary.class;
  }

  public List<DetailSalary> getSalaryIsLike(String likeURL, String name) throws Exception {
    URI uri = new URI(likeURL + "/" + name);
    DetailSalary[] responseEntity = restTemplate
            .getForObject(uri, DetailSalary[].class);
    List<DetailSalary> result = Arrays.asList(responseEntity);
    return result;
  }
}
