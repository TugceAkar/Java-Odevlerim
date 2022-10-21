package oopWithNLayeredDemo.entities;

public class Course {
	 	private int courseId;
	    private String courseName;
	    private double coursePrice;
	    
		public Course() {
			super();
		}
		public Course(int courseId, String courseName, double coursePrice) {
			super();
			this.courseId = courseId;
			this.courseName = courseName;
			this.coursePrice = coursePrice;
		}
		public int getCourseId() {
			return courseId;
		}
		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public double getCoursePrice() {
			return coursePrice;
		}
		public void setCoursePrice(double coursePrice) {
			this.coursePrice = coursePrice;
		}
	    
	    
}