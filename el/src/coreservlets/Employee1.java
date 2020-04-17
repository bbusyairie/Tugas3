package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class Employee1 extends Employee {
  public Employee1() {
    super(new Name("Busyroo", "Busyairie"),
          new Company("oke.com",
                      "Customized Java EE and Ajax Training"));
  }
}
