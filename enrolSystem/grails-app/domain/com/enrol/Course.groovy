package com.enrol

class Course {
	
	String courseTitle
	String department
	String courseLeader
	String courseCode
	int numberOfStudents
	Date startDate
	Date endDate
	String studyMode
	String description
	double tuitionFees

    static constraints = {
	courseTitle (nullable:false, blank:false)
	department (nullable:false, blank:false)
	courseLeader (nullable:false, blank:false)
	courseCode (nullable:false, blank:false)
	numberOfStudents (nullable:false, blank:false, min:20, max:60)
	startDate (nullable:false, blank:false)
	endDate (nullable:false, blank:false)
	studyMode (nullable:false, blank:false)
	description (nullable:false, blank:false)
	tuitionFees (nullable:false, blank:false)
    }
}
