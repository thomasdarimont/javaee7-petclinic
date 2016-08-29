package org.woehlke.javaee7.petclinic.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.logging.Logger;

/**
 * Created by tom on 29.08.16.
 */
@ManagedBean(name="vcap")
@SessionScoped
public class VcapBean {

    private static final Logger LOGGER = Logger.getLogger(VcapBean.class.getName());

    public String getApplicationInfo(){
        LOGGER.info("ApplicationInfo");
        return System.getenv("VCAP_APPLICATION");
    }

    public String getInstanceGuid(){
        return System.getenv("CF_INSTANCE_GUID");
    }

    public String getInstanceIndex(){
        return System.getenv("CF_INSTANCE_INDEX");
    }
}
