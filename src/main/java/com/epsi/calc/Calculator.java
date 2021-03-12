package com.epsi.calc;

public class Calculator {
  public int add(int a01, int b01) {
    return a01 + b01;
  }

  public int sub(int a01, int b01) {
    return a01 - b01;
  }

  public int mul(int a01, int b01) {
    return a01 * b01;
  }

  public int div(int a01, int b01) {
    return a01 / b01;
  }

  public boolean isPair(int a01) {
    boolean flag = false;
    if (a01 % 2 == 0){
      flag = true;
    }
    return flag;
  }

  public boolean isPrime(int a01) {
    boolean flag = true;

    for (int i = 2; i < a01; i++)  {
      if (a01 % i == 0) {
        flag = false;
      }
    }
    return flag;
  }

}
