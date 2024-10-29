package com.adobe.aem.guides.demo.core.workflows;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
@Component(service=WorkflowProcess.class,immediate=true,enabled=true,property = {"process.label="+"Display241024"})
public class Display implements WorkflowProcess{
    private static final Logger LOG=LoggerFactory.getLogger(Display.class);

    @Override
    public void execute(WorkItem workItem, WorkflowSession wflow, MetaDataMap metaData) throws WorkflowException {
      String getPayload= workItem.getWorkflowData().getPayloadType();
        if(getPayload.equals("JCR_PATH"))
        {
            LOG.info("payload type {}",getPayload);
           String path= workItem.getWorkflowData().getPayload().toString();
           LOG.info("path {}",path);
        }
    }

}
