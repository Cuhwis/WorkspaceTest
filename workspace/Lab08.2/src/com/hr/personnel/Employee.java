/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * 
 * The Employee class is a fairly simple class.  It mainly serves as a simple 
 * superclass to illustrate inheritance.
 * 
 * Employee includes the following properties:
 *   String name
 *   LocalDate hireDate - LocalDate is a Java 8 Date class.
 *  
 *  Employee includes the following methods (besides get/set methods)
 *  void work(): Just outputs string to show it was called.
 *  String toString(): Generates string from Employee object.
 *    
 */

package com.hr.personnel;

import java.time.LocalDate;

public class Employee {
  // FIELDS
  private String name;
  private LocalDate hireDate;
  
  // CONSTRUCTORS
  public Employee() {
  }
  
  public Employee(String name, LocalDate hireDate) {
    setName(name);
    setHireDate(hireDate);
  }
  
  // BEHAVIORAL METHODS
  public void work() {
    System.out.println(getName() + " working hard since " + getHireDate());
  }
  
  // ACCESSOR METHODS
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public LocalDate getHireDate() {
    return hireDate;
  }
  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }
  
  public String toString() {
    return "Employee: name=" + getName() + ", hireDate=" + getHireDate();
  }
}