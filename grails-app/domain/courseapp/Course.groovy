package courseapp
import grails.rest.*

@Resource()
class Course {

	String department
	String program
	String courseCode
	String courseName
	String creditHours
	String prereq
	String description
	Boolean OTM 
	
	
    static constraints = {
		department blank:false
		program blank:false
		courseCode blank:false
		courseName blank:false
		creditHours blank:false
		
    }
}
