/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.service;

import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.web.client.RestTemplate;
import project.kma.ptudw.entity.Employee;
import project.kma.ptudw.entity.LoginRequest;

/**
 *
 * @author Duy Nien
 */
public class EmployeeService extends BaseService<Employee> {

  @Override
  protected Class<Employee> classEntity() {
    return Employee.class;
  }

  public Employee handleLogin(String postURL, LoginRequest loginRequest) throws Exception {
    URI uri = new URI(postURL);
    RestTemplate restTemplate = new RestTemplate();
    Employee createEntity = restTemplate.postForObject(uri, loginRequest, classEntity());
    return createEntity;
  }

  public Employee getIsLogin(String activeUrl) throws Exception {
    URI uri = new URI(activeUrl);
    RestTemplate restTemplate = new RestTemplate();
    Employee createEntity = restTemplate.getForEntity(uri, classEntity()).getBody();
    return createEntity;
  }

  public int getMaxId(String getMaxIdUrl) throws URISyntaxException {
    URI uri = new URI(getMaxIdUrl);
    RestTemplate restTemplate = new RestTemplate();
    int maxId = restTemplate.getForObject(uri, Integer.class);
    return maxId;
  }

  public boolean existByEmail(String existByEmailUrl, String email) throws URISyntaxException {
    URI uri = new URI(existByEmailUrl + "/" + email);
    RestTemplate restTemplate = new RestTemplate();
    boolean existByEmail = restTemplate.getForObject(uri, Boolean.class);
    return existByEmail;
  }
  
  public void logout(String logoutUrl) throws URISyntaxException{
    URI uri = new URI(logoutUrl);
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.delete(uri);
  }
}
