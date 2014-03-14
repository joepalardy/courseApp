import courseapp.Course
import grails.converters.JSON

class BootStrap {
	def grailsApplication
    def init = { servletContext ->
		
		
		
		def filePath = "resources/courses.txt"
		def text = grailsApplication.getParentContext().getResource("classpath:$filePath").getInputStream().getText()
		def json = JSON.parse(text)
		for (courseData in json) {
		
		  def c = new Course(
				department: courseData ["department"],
		program: courseData ["program"],
		programCode: courseData ["programCode"],
		courseNum: courseData ["courseNum"],
		courseName: courseData ["courseName"],
		creditHours: courseData ["creditHours"],
		prereq: courseData ["prereq"],
		description: courseData ["description"],
		OTM: (courseData["OTM"]=="true")
			).save(failOnError: true);
		}
    }
    def destroy = {
    }
}
