package com.adobe.aem.guides.demo.core.handler;

import org.apache.sling.api.SlingConstants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.osgi.service.event.EventConstants;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
@Component(service=EventHandler.class,immediate=true,
property={EventConstants.EVENT_TOPIC+"=org/apache/sling/api/resource/Resource/*"})
public class Task implements EventHandler{
    private static final Logger LOG=LoggerFactory.getLogger(Task.class);

    @Override
    public void handleEvent(Event event) {
        LOG.info("Event Topic={},path {}",event.getTopic());
        event.getProperty(SlingConstants.PROPERTY_PATH);
        
    }

}
