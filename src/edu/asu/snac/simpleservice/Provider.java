package edu.asu.snac.simpleservice;

public class Provider implements SimpleServiceInterface {

  @Override
  public Integer add(Integer a, Integer b) {
    System.out.println("service called with params " + a + " " + b);
    return a + b;
  }

}
