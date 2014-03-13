import courseapp.Course

class BootStrap {

    def init = { servletContext ->
		
		
new Course(department: "Lariccia School of Accounting and Finance",
		program: "ACCOUNTING",
		programCode: "ACCT",
		courseNum: "2600",
		courseName: "Accounting Field Experience. ",
		creditHours: "1 s.h.",
		prereq: " 2.5 GPA, department approval and sophomore standing. ",
		description: "Accounting Field Experience. Internship and/or cooperative education experiences in accounting. Students may be assigned to corporate, non-profit, or government entities on a semester basis. Can repeat this course once for a different field experience.",OTM: true).save()	
		
	
	new Course(department: "Lariccia School of Accounting and Finance",
		program: "ACCOUNTING",
		programCode: "ACCT",
		courseNum: "1503",
		courseName: "Elementary Accounting. ",
		creditHours: "3 s.h.",
		prereq: " none",
		description: "Elementary Accounting. Principles, concepts, and terminology related to the accounting cycle. Examination of procedures related to control of cash and payroll activities. Does not fulfill WCBA requirements.",OTM: true).save()
		
		new Course(department: "Lariccia School of Accounting and Finance",
			program: "ACCOUNTING",
			programCode: "ACCT",
			courseNum: "2610",
			courseName: "Accounting Field Experience. ",
			creditHours: "1 s.h.",
			prereq: " 2.5 GPA, department approval and sophomore standing. ",
			description: "Accounting Field Experience. Internship and/or cooperative education experiences in accounting. Students may be assigned to corporate, non-profit, or government entities on a semester basis. Can repeat this course once for a different field experience.",OTM: false).save()
			
			new Course(department: "Lariccia School of Accounting and Finance",
				program: "ACCOUNTING",
				programCode: "ACCT",
				courseNum: "2900",
				courseName: "Elementary Accounting. ",
				creditHours: "3 s.h.",
				prereq: " none",
				description: "Elementary Accounting. Principles, concepts, and terminology related to the accounting cycle. Examination of procedures related to control of cash and payroll activities. Does not fulfill WCBA requirements.",OTM: true).save()
				
	}
    def destroy = {
    }
}
