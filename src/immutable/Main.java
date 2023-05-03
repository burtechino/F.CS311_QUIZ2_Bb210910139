package immutable;

public class Main { public static void main(String[] args) {
	
	// TODO Auto-generated method stub
	
	Course course = new Course("Software Construction"); 
	course.setCourseName("Software Construction"); 
	
	System.out.println(course.courseName);
	System.out.println(course.getCourseName());
	
	course.setCourseName("Программ хангамжийн бүтээлт");
	System.out.println(course.getCourseName());
	} 

}


