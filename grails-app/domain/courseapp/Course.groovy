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
		department blank:true, nullable: false
		program blank:true, nullable: false
		courseNum blank:true, nullable: true
		programCode blank:true, nullable: true
		courseName blank:true, nullable: true
		creditHours blank:true, nullable: true
		prereq nullable: true
		description maxSize:1000, blank: true
		
    }
}
