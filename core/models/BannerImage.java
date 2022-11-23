package com.blogsite.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class)
public class BannerImage {


    @Inject
    @Default(values = "Path")
    private String BannerImage;

    public String getBannerImage() {
        return BannerImage;
    }
}
