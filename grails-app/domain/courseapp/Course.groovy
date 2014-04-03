package courseapp
import grails.rest.*

@Resource()
class Course{
	String courseId
	String department
	String programCode
	String courseNum
	String courseName
	String creditHours
	String prereq
	String description
	String otm
	String tag
	String genEd
	String genEdAlt

    static constraints = {
		courseId blank: false, nullable: false
		department blank:true, nullable: true
		courseNum blank:true, nullable: true
		programCode blank:true, nullable: true
		courseName blank:true, nullable: true
		creditHours blank:true, nullable: true
		prereq blank: true, nullable: true
		description maxSize:1000, blank: true, nullable: true
		genEd blank:true, nullable: true
		genEdAlt blank:true, nullable: true
		otm blank:true, nullable: true
		tag blank:true, nullable: true

    }
}
