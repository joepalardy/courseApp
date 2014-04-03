import courseapp.Course
import grails.converters.JSON

class BootStrap {
	def grailsApplication
    def init = { servletContext ->
		
		
		
		def filePath = "resources/fullOutput.txt"
		def text = grailsApplication.getParentContext().getResource("classpath:$filePath").getInputStream().getText()
		def json = JSON.parse(text)
		for (courseData in json) {
		
		  def c = new Course(
			  courseId: courseData["courseId"],
				department: courseData ["Department"],
		programCode: courseData ["programCode"],
		courseNum: courseData ["courseNum"],
		courseName: courseData ["courseTitle"],
		creditHours: courseData ["creditHours"],
		prereq: courseData ["prereq"],
		description: courseData ["description"],
		otm: courseData ["transferModule"],
		tag: courseData ["transferArticulation"],
		genEd: courseData ["GenEd"],
		genEdAlt: courseData ["GenEdAlt"]
			).save(failOnError: true);
		}
    }
    def destroy = {
    }
}
