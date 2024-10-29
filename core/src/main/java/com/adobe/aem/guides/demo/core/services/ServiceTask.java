package com.adobe.aem.guides.demo.core.services;
import org.osgi.service.component.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component(immediate=true,service=ServiceTask.class)
public class ServiceTask {
    private static final Logger LOG=LoggerFactory.getLogger(ServiceTask.class);
@Activate
public void activate()
{
LOG.info(" activate() execution started");
}
@Deactivate
public void deactivate()
{
    LOG.info(" deactivate() execution started");  
}
@Modified
public void update()
{
    LOG.info(" update() execution started");
}
public String printMessage()
{
    return "Data coming from the printMessage()";
}

}
