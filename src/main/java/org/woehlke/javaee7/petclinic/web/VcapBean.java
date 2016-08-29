package org.woehlke.javaee7.petclinic.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by tom on 29.08.16.
 */
@ManagedBean(name="vcap")
@SessionScoped
public class VcapBean {

    public String getApplicationInfo(){
        return System.getenv("VCAP_APPLICATION");
    }

    public String getInstanceGuid(){
        return System.getenv("CF_INSTANCE_GUID");
    }

    public String getInstanceIndex(){
        return System.getenv("CF_INSTANCE_INDEX");
    }
}
