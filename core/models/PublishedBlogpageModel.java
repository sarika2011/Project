package com.blogsite.core.models;

import com.blogsite.core.services.PublishedBlogs;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PublishedBlogpageModel {

    @Inject
    private List<BlogFields> publishedBlogs;

    @OSGiService
    PublishedBlogs publishedblogs;

    int numBlogs;

    public List<BlogFields> getPublishedBlogs() {
        return publishedBlogs;
    }

    public int getNumBlogs() {
        return publishedblogs.noOfPages();
    }
}
