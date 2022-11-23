package com.blogsite.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MultiFieldItems {




    @Inject
    private String num;

    @Inject
    private String image;

    @Inject
    private String Banner;

    @Inject
    private String text;

    public String getNum() {
        return num;
    }

    public String getBanner() {
        return Banner;
    }

    public String getText() {
        return text;
    }

    public String getImage() {
        return image;
    }
//    public void setLink(String link) {
//        this.link = link;
//    }




}
