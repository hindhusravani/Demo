package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
@ObjectClassDefinition(name="EmployeeDetails",description = "about employee details")
public @interface EmployeeDetails {
   @AttributeDefinition(name="EmployeeName",
   description = "about employee name description",
   defaultValue = "sravani",type = AttributeType.STRING,required=true)
    public String ename();
    @AttributeDefinition(name="EmployeeId",
   description = "about employee Id description",
   defaultValue = "14853",type = AttributeType.INTEGER,required=true)
    public int eid();
    @AttributeDefinition(name="EmployeeAddress",
   description = "about employee address description",
   defaultValue = "ongole",type = AttributeType.STRING,required=true)
    public String address();
    @AttributeDefinition(name="EmployeeDesignation",
   description = "about employee Designation description",
   defaultValue = "sr Developer",type = AttributeType.STRING,required=true)
    public String designation();

}
