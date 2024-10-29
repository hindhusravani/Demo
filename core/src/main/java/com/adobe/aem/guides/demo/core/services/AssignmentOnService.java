package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate=true)
public class AssignmentOnService {
private static final Logger LOG=LoggerFactory.getLogger(AssignmentOnService.class);
@Reference
ServiceTask st;
@Activate
public void activate()
{
   String result= st.printMessage();
LOG.info(" activate() execution started");
LOG.info("result {}",result);
}
@Deactivate
public void deactivate()
{
    LOG.info(" deactivate() execution started");  
}
@Modified
public void modify()
{
    LOG.info(" modify() execution started");
}
}
