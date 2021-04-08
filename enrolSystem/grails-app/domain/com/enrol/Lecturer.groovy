package com.enrol

class Lecturer {

	string fullName
	string post
	string subject
	string lecturerEmail
	string office
	string bio

    static constraints = {
	
	fullName (nullable:false, blank:false)
	post (nullable:false, blank:false)
	subject (nullable:false, blank:false)
	lecturerEmail (nullable:false, blank:false)
	office (nullable:false, blank:false)
	bio (nullable:false, blank:false)
    }
}
