/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kma.ptudw.api;

/**
 *
 * @author Duy Nien
 */
public interface CONSTANT {

  static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
          + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
  static final String HOST = "http://localhost:8080";
  static final String EMPLOYEE_API = "/employee";
  static final String CUSTOMER_API = "/customer";
  static final String ORDER_API = "/order";
  static final String DRINK_TYPE_API = "/drink-type";
  static final String DRINK_API = "/drink";
  static final String PENDING_API = "/pending";
  static final String DETAIL_SALARY_API = "/detail-salary";
  static final String GET_BY_ID = "/by-id";
  static final String GET_BY_STATUS = "/by-status";
  static final String GET_MAX_ID = "/max-id";
  static final String GET_BY_TYPE = "/by-type";
  static final String GET_BY_LIKE = "/is-like";
  static final String LOGOUT = "/logout";
  static final String ISLOGIN = "/active";
  static final String EXIST_BY_EMAIL = "/exist-email";
  static final String ALL = "/all";
  static final String CREATE = "/create";
  static final String UPDATE = "/update";
  static final String DELETE = "/delete";
  static final String LOGIN = "/login";
}
