package org.system;

public class Desktop extends Computer {
public static void desktopSize()
         {
              System.out.println("30 inches");
         }
public static void main(String[] args) {
             Computer computer=new Computer();
             computer.computerModel();
             desktopSize();
         }
       }
