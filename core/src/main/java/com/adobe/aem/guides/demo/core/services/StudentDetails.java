package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
@ObjectClassDefinition(name="StudentDetails",description = "about Student details")
public @interface StudentDetails {
    @AttributeDefinition(name="StudentName",
   description = "about Student name description",
   defaultValue = "Nagasai",
   type = AttributeType.STRING,
   required=true)
    public String sname();
    @AttributeDefinition(name="StudentId",
   description = "about Student Id description",
   defaultValue = "534",
   type = AttributeType.INTEGER,
   required=true)
    public int sid();
    @AttributeDefinition(name="StudentAddress",
   description = "about Student address description",
   defaultValue = "Hyderabad",
   type = AttributeType.STRING,
   required=true)
    public String address();
    @AttributeDefinition(name="StudentGrade",
   description = "about Student Grade description",
   defaultValue = "Firstclass",
   type = AttributeType.STRING,
   required=true)
    public String grade();

}
