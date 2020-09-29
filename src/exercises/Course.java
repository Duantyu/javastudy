package exercises;

public class Course {
	String courseName, college,courseId;
	int credit;
	String getName() {
		return courseName;
	}
	void setName (String courseName) {
		this.courseName = courseName;
	}
	String getCollege() {
		return college;
	}
	void setCollege(String college) {
		this.college = college;
	}
	int getcredit() {
		return credit;
	}
	void setcredit(int credit) {
		this.credit = credit;
		}
	String getcourseId() {
		return courseId;
			}
	void setcourseId(String courseId) {
		this.courseId = courseId;
		}
	public static void main(String args[]) {
		Course course1 = new Course();
		course1.setName("JAVA");
		course1.setcourseId("4213678");
		course1.setCollege("SCS");
		course1.setcredit(4);
		System.out.println(course1.getName());
		System.out.println(course1.getcourseId());
		System.out.println(course1.getcredit());
		System.out.println(course1.getCollege());
	} 
}
