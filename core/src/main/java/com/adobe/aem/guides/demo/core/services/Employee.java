package com.adobe.aem.guides.demo.core.services;
import org.slf4j.Logger;
import org.osgi.service.component.annotations.*;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.LoggerFactory;
@Component(service=Employee.class,enabled=true,immediate=true)
@Designate(ocd=EmployeeDetails.class)
public class Employee {
    private static final Logger LOG=LoggerFactory.getLogger("Employee.class");
private String ename;
private int eid;
private String address;
private String designation;

@Activate
public void activate(EmployeeDetails ed)
{
    display(ed);

    LOG.info("Employee details are available from Employee class");
}
@Deactivate
public void deactivate(EmployeeDetails ed)
{
    LOG.info("deactivate() executed");
}
@Modified
public void update(EmployeeDetails ed)
{
    LOG.info("update() executed"); 
}
public void display(EmployeeDetails ed)
{
    this.ename=ed.ename();
    this.eid=ed.eid();
    this.address=ed.address();
    this.designation=ed.designation();
    LOG.info("Employee name {},Employee id {},Employee address {},Employee designation {}",ename,eid,address,designation);

}
}
