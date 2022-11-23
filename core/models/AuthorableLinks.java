package com.blogsite.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AuthorableLinks {

    @Inject
    @Default(values = "link")
    private String link;

    @Inject
    @Default(values = "name")
    private String name;

    public String getLink() {
        return link;
    }

    public String getName() {
        return name;
    }
}
