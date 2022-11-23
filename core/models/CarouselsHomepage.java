package com.blogsite.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CarouselsHomepage {

    @Inject
    private String image;

    @Inject
    private String link;

    @Inject
    private String text;

    public String getImage() {
        return image;
    }

    public String getLink() {
        return link;
    }

    public String getText() {
        return text;
    }
}
