package com.enrol

class Module {

	string module_title
	string module_code
	int credits
	string lecturer
	string course
	string description

    static constraints = {
	module_title (nullable:false, blank:false)
	module_code (nullable:false, blank:false)
	credits (nullable:false, blank:false)
	lecturer (nullable:false, blank:false)
	description (nullable:false, blank:false)
    }
}
