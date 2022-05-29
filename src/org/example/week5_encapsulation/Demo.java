package org.example.week5_encapsulation;

 public class Demo {

  private int i;
  private boolean b;

  Demo(int i, boolean b){
   this.i = i;
   this.b = b;
  }

  public int getI() {
   return i;
  }

  public void setI(int i) {
   this.i = i;
  }

  public boolean getB() {
   return b;
  }

  public void setB(boolean b) {
   this.b = b;
  }
 }

 /*

 Java class with private data members and public getter & setter methods is known as Java Bean Class or
 POJO - Plain Old Java Object

getter method gives read access.
setter method gives write access.

  */