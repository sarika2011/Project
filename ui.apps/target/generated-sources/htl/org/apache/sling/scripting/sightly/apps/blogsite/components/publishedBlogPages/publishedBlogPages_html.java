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
package org.apache.sling.scripting.sightly.apps.blogsite.components.publishedBlogPages;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class publishedBlogPages_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_body = null;
Object _global_clientlibs = null;
Object _global_var = null;
Collection var_collectionvar3_list_coerced$ = null;
Object _dynamic_pageproperties = bindings.get("pageproperties");
_global_body = renderContext.call("use", com.blogsite.core.models.PublishedBlogpageModel.class.getName(), obj());
out.write("\n\n");
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
out.write("\n\n<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"utf-8\"/>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n    <meta name=\"description\" content=\"\"/>\n    <meta name=\"author\" content=\"\"/>\n\n\n    <title>Bootcamp Blog</title>\n\n    <link href=\"https://fonts.googleapis.com/css?family=Playfair+Display:700,900\" rel=\"stylesheet\"/>\n\n</head>\n\n<body>\n\n<div class=\"container\">\n");
{
    String var_2 = (("<!--    <sly  data-sly-resource=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", "header", "comment"))) + "\"></sly>-->");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("\n    ");
_global_var = renderContext.getObjectModel().resolveProperty(_global_body, "numBlogs");
if (renderContext.getObjectModel().toBoolean(_global_var)) {
}
out.write("\n    ");
{
    Object var_collectionvar3 = renderContext.getObjectModel().resolveProperty(_global_body, "publishedBlogs");
    {
        long var_size4 = ((var_collectionvar3_list_coerced$ == null ? (var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3)) : var_collectionvar3_list_coerced$).size());
        {
            boolean var_notempty5 = (var_size4 > 0);
            if (var_notempty5) {
                {
                    Object var_end8 = _global_var;
                    {
                        boolean var_validstartstepend9 = (((0 < var_size4) && true) && (!(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.leq(var_end8, 0))));
                        if (var_validstartstepend9) {
                            if (var_collectionvar3_list_coerced$ == null) {
                                var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3);
                            }
                            long var_index10 = 0;
                            for (Object item : var_collectionvar3_list_coerced$) {
                                {
                                    long var_stepcondition11 = (renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.REM.eval((renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.SUB.eval(var_index10, 0)).longValue()), 1)).longValue());
                                    {
                                        boolean var_traversal12 = (((var_index10 >= 0) && (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.leq(var_index10, var_end8))) && (var_stepcondition11 == 0));
                                        if (var_traversal12) {
                                            out.write("\n    <div class=\"row\">\n        <div class=\"card flex-md-row mb-4 shadow-sm h-md-1200\">\n            <div class=\"card-body d-flex flex-column align-items-start\">\n                <strong class=\"d-inline-block mb-2 text-primary\">");
                                            {
                                                Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "tags"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_13));
                                            }
                                            out.write("</strong>\n                <h3 class=\"mb-0\">\n                    <a class=\"text-dark\"");
                                            {
                                                Object var_attrvalue14 = renderContext.getObjectModel().resolveProperty(item, "link");
                                                {
                                                    Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "uri");
                                                    {
                                                        Object var_shoulddisplayattr17 = ((renderContext.getObjectModel().toBoolean(var_attrcontent15) ? var_attrcontent15 : ("false".equals(var_attrvalue14))));
                                                        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr17)) {
                                                            out.write(" href");
                                                            {
                                                                boolean var_istrueattr16 = (var_attrvalue14.equals(true));
                                                                if (!var_istrueattr16) {
                                                                    out.write("=\"");
                                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                                                                    out.write("\"");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            out.write(">Featured post</a>\n                </h3>\n                <div class=\"mb-1 text-muted\">");
                                            {
                                                Object var_18 = renderContext.call("xss", renderContext.call("format", "MMM-dd", obj().with("format", renderContext.getObjectModel().resolveProperty(_dynamic_pageproperties, "jcr:created"))), "text");
                                                out.write(renderContext.getObjectModel().toString(var_18));
                                            }
                                            out.write("</div>\n                <p class=\"card-text mb-auto\">");
                                            {
                                                Object var_19 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "subHeading"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_19));
                                            }
                                            out.write("</p>\n                <a");
                                            {
                                                Object var_attrvalue20 = renderContext.getObjectModel().resolveProperty(item, "link");
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
                                            out.write(">Continue reading</a>\n            </div>\n            <img class=\"card-img-right flex-auto d-none d-lg-block\"");
                                            {
                                                Object var_attrvalue24 = renderContext.getObjectModel().resolveProperty(item, "img");
                                                {
                                                    Object var_attrcontent25 = renderContext.call("xss", var_attrvalue24, "uri");
                                                    {
                                                        Object var_shoulddisplayattr27 = ((renderContext.getObjectModel().toBoolean(var_attrcontent25) ? var_attrcontent25 : ("false".equals(var_attrvalue24))));
                                                        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr27)) {
                                                            out.write(" src");
                                                            {
                                                                boolean var_istrueattr26 = (var_attrvalue24.equals(true));
                                                                if (!var_istrueattr26) {
                                                                    out.write("=\"");
                                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent25));
                                                                    out.write("\"");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            out.write(" width=\"250px\" height=\"200px\" alt=\"Card image cap\"/>\n        </div>\n    </div>\n    ");
                                        }
                                    }
                                }
                                var_index10++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar3_list_coerced$ = null;
}
out.write("\n");
{
    String var_28 = (("<!--    <sly  data-sly-resource=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", "footer", "comment"))) + "\"></sly>-->");
    out.write(renderContext.getObjectModel().toString(var_28));
}
out.write("\n</div>\n\n<!-- Bootstrap core JavaScript\n================================================== -->\n<!-- Placed at the end of the document so the pages load faster -->\n<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n<script>window.jQuery || document.write('<script src=\"assets/js/vendor/jquery-slim.min.js\"><\\/script>')</script>\n\n<script>\n      Holder.addTheme('thumb', {\n        bg: '#55595c',\n        fg: '#eceeef',\n        text: 'Thumbnail'\n      });\n    </script>\n</body>\n</html>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

