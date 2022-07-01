package week3.day1.assignment4;

public class Students {
	public void getStudentInfo(int ID)
	    {
		     System.out.println(ID);
	    }

	public void getStudentInfo(int ID,String name)
	   {
             System.out.println(ID+ name);
	   }
	public void getStudentInfo(String email, int phonenumber)
	   {
             System.out.println(email +phonenumber);
	   }
	   
	public static void main(String[] args){
	   Students obj = new Students();
	   obj.getStudentInfo(234567);
	   obj.getStudentInfo(234567, "Sneha");
	   obj.getStudentInfo("snehaabc@gmail.com", 345678990);
		
	 }
  }