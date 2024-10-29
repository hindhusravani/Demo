package com.adobe.aem.guides.demo.core.services;
import org.slf4j.Logger;
import org.osgi.service.component.annotations.*;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.LoggerFactory;
@Component(service=Student.class,enabled=true,immediate=true)
@Designate(ocd=StudentDetails.class)
public class Student {
    private static final Logger LOG=LoggerFactory.getLogger("Employee.class");
private String sname;
private int sid;
private String address;
private String grade;

@Activate
public void activate(StudentDetails sd)
{
    print(sd);
    LOG.info("Student details from Student class");
}
@Deactivate
public void deactivate(StudentDetails sd)
{
    LOG.info("deactivate() executed");
}
@Modified
public void update(StudentDetails sd)
{
    LOG.info("update() executed"); 
}
public void print(StudentDetails sd)
{
    this.sname=sd.sname();
    this.sid=sd.sid();
    this.address=sd.address();
    this.grade=sd.grade();
    LOG.info("Student name {},Student id {},Student address {},Student grade {}",sname,sid,address,grade);

}
}
