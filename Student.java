package org.student;

import org.college.College;
import org.department.Department;
public class Student extends Department {
public static void studentName()
      {
          System.out.println("Sneha");
      }
public static void studentDept()
      {
          System.out.println("BCA");
      }
public static void studentId()
      {
          System.out.println("MYSCU3BCA13092");
      }
public static void main(String[] args) {
         //object creation
         College college= new College();
         //calling the college class methods
         college.collegeName();
         college.collegeCode();
         college.collegeRank();
         //Calling the Department class methods
         Department dept=new Department();
         dept.deptName();
         //Calling the student class methods
         studentName();
         studentDept();
         studentId();
       }
     }

