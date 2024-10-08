package com.adobe.aem.guides.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Sidebar {

    
    @ValueMapValue
    private String logoPath;

    @ValueMapValue
    private String logoMobileImage;

    @ValueMapValue
    private String logoLink;

    @ValueMapValue
    private boolean enableSwitch;

    @ValueMapValue
    private String name;

    @ValueMapValue
    private String image;

    @ValueMapValue
    private String desktopIcon;

    @ValueMapValue
    private String mobileIcon;

    @ValueMapValue
    private String navigationUrl;

    @ValueMapValue
    private String country;

    public String getLogoPath() {
        return logoPath;
    }

    public String getLogoMobileImage() {
        return logoMobileImage;
    }

    public String getLogoLink() {
        return logoLink;
    }

    public boolean isEnableSwitch() {
        return enableSwitch;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getDesktopIcon() {
        return desktopIcon;
    }

    public String getMobileIcon() {
        return mobileIcon;
    }

    public String getNavigationUrl() {
        return navigationUrl;
    }

    public String getCountry() {
        return country;
    }
}
