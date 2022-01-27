/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.service;

import java.util.List;
import java.net.URI;
import java.util.Arrays;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import static org.springframework.web.servlet.function.RequestPredicates.param;

/**
 *
 * @author Duy Nien
 */
public abstract class BaseService<T> {

  private RestTemplate restTemplate;

  public BaseService() {
    restTemplate = new RestTemplate();
  }

  protected abstract Class<T> classEntity();

  public T handleMethodGetById(String getURL, int id) throws Exception {
    URI uri = new URI(getURL + "/" + id);
    T entity = restTemplate.getForEntity(uri, classEntity()).getBody();
    return entity;
  }

  public List<T> handleMethodGetAll(String getURL, Class<T[]> classT) throws Exception {
    URI uri = new URI(getURL);
    T[] responseEntity = restTemplate
            .getForObject(uri, classT);
    List<T> result = Arrays.asList(responseEntity);
    return result;
  }

  public T handleMethodPost(String postURL, T entity) throws Exception {
    URI uri = new URI(postURL);
    T createEntity = restTemplate.postForObject(uri, entity, classEntity());
    return createEntity;
  }

  public void handleMethodPut(String puttURL, T entity) throws Exception {
    URI uri = new URI(puttURL);
    restTemplate.put(uri, entity);
//    HttpHeaders headers = new HttpHeaders();
//    HttpEntity requestEntity = new HttpEntity(entity, headers);
//    ResponseEntity<T> response
//            = restTemplate.exchange(uri, HttpMethod.PUT, requestEntity,classEntity());
//    response.getBody();
  }

  public void handleMethodDelete(String deleteURL, int id) throws Exception {
    URI uri = new URI(deleteURL + "/" + id);
    restTemplate.delete(uri);
  }
}
