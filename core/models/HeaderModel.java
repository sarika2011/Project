package com.blogsite.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderModel {

    @Inject
    @Default(values = "path")
    private String logo;

    @Inject
    private String title;

    @Inject
    @Default(values = "path")
    private List<AuthorableLinks> links;

    public String getLogo() {
        return logo;
    }

    public List<AuthorableLinks> getLinks() {
        return links;
    }

    public String getTitle() {
        return title;
    }
}
