package com.adobe.aem.guides.demo.core.models;
import java.util.Date;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;
@Model(adaptables = {Resource.class,SlingHttpServletRequest.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Product implements Company{
@Inject
@Default(values="Iphone 16 pro")
@Named(value="sling:resourceType")
    private String str;
    @ValueMapValue
    @Required
    private String description;
    @ValueMapValue
    private String image;
    @ValueMapValue
    private Date date;
    @ValueMapValue
    private int num;
    @ScriptVariable
    Page currentPage;
    @Override
    public Date getPhoneDate() {
        // TODO Auto-generated method stub
        return date;
    }
    @Override
    public String getPhoneDescription() {
        // TODO Auto-generated method stub
        return description;
    }
    @Override
    public String getPhoneImage() {
        // TODO Auto-generated method stub
        return image;
    }
    @Override
    public int getPhoneNumber() {
        // TODO Auto-generated method stub
        return num;
    }
    @Override
    public String getPhoneTitle() {
        // TODO Auto-generated method stub
        return str;
    }
    @Override
    public String getPhonePageTitle() {
        // TODO Auto-generated method stub
        return currentPage.getPageTitle();
    }
   
    
    


}
