package week3.day1.assignment5;

public class Automation extends MultipleLanguage implements Language,TestTool{

public void Selenium() 
          {
	           System.out.println("Selenium method implemented");
	      }
public void Java(){
	 
	           System.out.println("Java method implemented");
	      }
@Override
public void ruby(){
		
	           System.out.println("Ruby method implemented");
		  }
public static void main(String[] args){
	           Automation obj= new Automation();
	           obj.Java();
	           obj.Selenium();
	           obj.ruby();
	           obj.python();
          }
      }



	
	
	


