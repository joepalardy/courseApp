package courseapp
import grails.rest.*

@Resource()
class Course {

	String department
	String program
	String programCode
	String courseNum
	String courseName
	String creditHours
	String prereq
	String description
	Boolean OTM 
	
	
    static constraints = {
		department blank:false
		program blank:false
		courseNum blank:false
		programCode blank:false
		courseName blank:false
		creditHours blank:false
		
    }
}
