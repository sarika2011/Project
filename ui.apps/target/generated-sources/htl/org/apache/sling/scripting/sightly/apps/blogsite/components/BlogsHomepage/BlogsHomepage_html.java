/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.blogsite.components.BlogsHomepage;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class BlogsHomepage_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlibs = null;
Object _global_model = null;
Collection var_collectionvar2_list_coerced$ = null;
Object _global_obj = null;
Object _dynamic_pageproperties = bindings.get("pageproperties");
_global_clientlibs = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_clientlibs, "all");
    {
        String var_templateoptions1_field$_categories = "blogsite.site";
        {
            java.util.Map var_templateoptions1 = obj().with("categories", var_templateoptions1_field$_categories);
            callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
        }
    }
}
out.write("\n");
_global_model = renderContext.call("use", com.blogsite.core.models.BlogsListHomepage.class.getName(), obj());
out.write("\n<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"utf-8\"/>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n    <meta name=\"description\" content=\"\"/>\n    <meta name=\"author\" content=\"\"/>\n\n\n    <title>Bootcamp Blog</title>\n\n    <!-- Bootstrap core CSS -->\n\n    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\"/>\n\n    <!-- Custom styles for this template -->\n    <link href=\"https://fonts.googleapis.com/css?family=Playfair+Display:700,900\" rel=\"stylesheet\"/>\n\n</head>\n<body>\n<div class=\"row mb-2\">\n    ");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_global_model, "multiBlogs");
    {
        long var_size3 = ((var_collectionvar2_list_coerced$ == null ? (var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2)) : var_collectionvar2_list_coerced$).size());
        {
            boolean var_notempty4 = (var_size3 > 0);
            if (var_notempty4) {
                {
                    long var_end7 = var_size3;
                    {
                        boolean var_validstartstepend8 = (((0 < var_size3) && true) && (var_end7 > 0));
                        if (var_validstartstepend8) {
                            if (var_collectionvar2_list_coerced$ == null) {
                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                            }
                            long var_index9 = 0;
                            for (Object item : var_collectionvar2_list_coerced$) {
                                {
                                    boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                    if (var_traversal11) {
                                        out.write("\n    <div class=\"col-md-4\">\n        <div class=\"card flex-md-row mb-4 shadow-sm h-md-400\">\n            <div class=\"card-body d-flex flex-column align-items-start\">\n                <img class=\"card-img-right flex-auto d-none d-lg-block\" data-src=\"holder.js/320x150?theme=thumb\" alt=\"Card image cap\"/>\n                <strong class=\"d-inline-block mb-2 text-success\">");
                                        {
                                            Object var_12 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "postTag"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_12));
                                        }
                                        out.write("</strong>\n                <h3 class=\"mb-0\">\n                    <a class=\"text-dark\"");
                                        {
                                            Object var_attrvalue13 = renderContext.getObjectModel().resolveProperty(item, "postLink");
                                            {
                                                Object var_attrcontent14 = renderContext.call("xss", var_attrvalue13, "uri");
                                                {
                                                    Object var_shoulddisplayattr16 = ((renderContext.getObjectModel().toBoolean(var_attrcontent14) ? var_attrcontent14 : ("false".equals(var_attrvalue13))));
                                                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr16)) {
                                                        out.write(" href");
                                                        {
                                                            boolean var_istrueattr15 = (var_attrvalue13.equals(true));
                                                            if (!var_istrueattr15) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent14));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(">");
                                        {
                                            Object var_17 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "postTitle"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_17));
                                        }
                                        out.write("</a>\n                </h3>\n                <div class=\"mb-1 text-muted\">");
_global_obj = renderContext.call("use", java.util.Date.class.getName(), obj());
                                        {
                                            Object var_18 = renderContext.call("xss", renderContext.call("format", "MMM-dd", obj().with("format", renderContext.getObjectModel().resolveProperty(_dynamic_pageproperties, "jcr:created"))), "text");
                                            out.write(renderContext.getObjectModel().toString(var_18));
                                        }
                                        out.write("</div>\n                <p class=\"card-text mb-auto\">");
                                        {
                                            String var_19 = ("\"" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "postDescription"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_19));
                                        }
                                        out.write("</p>\n                <a");
                                        {
                                            Object var_attrvalue20 = renderContext.getObjectModel().resolveProperty(item, "postLink");
                                            {
                                                Object var_attrcontent21 = renderContext.call("xss", var_attrvalue20, "uri");
                                                {
                                                    Object var_shoulddisplayattr23 = ((renderContext.getObjectModel().toBoolean(var_attrcontent21) ? var_attrcontent21 : ("false".equals(var_attrvalue20))));
                                                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr23)) {
                                                        out.write(" href");
                                                        {
                                                            boolean var_istrueattr22 = (var_attrvalue20.equals(true));
                                                            if (!var_istrueattr22) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent21));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(">Continue reading</a>\n            </div>\n        </div>\n    </div>\n    ");
                                    }
                                }
                                var_index9++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar2_list_coerced$ = null;
}
out.write("\n</div>\n<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n\n<script>\n      Holder.addTheme('thumb', {\n        bg: '#55595c',\n        fg: '#eceeef',\n        text: 'Thumbnail'\n      });\n    </script>\n</body>\n</html>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

