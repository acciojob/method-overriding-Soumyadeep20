package com.driver;

public class Main {
  public class A
    {
      public static String meth()
      {
        return "Invoking method from class A";
      }
    }
  public class B extends A{
    public static String meth()
      {
        return "Method is overridden in Extendend class B";
      }
  }
  public static void main(String args[])
  {
    B obj=new B();
    B.meth();
  }
}
