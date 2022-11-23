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
package org.apache.sling.scripting.sightly.apps.blogsite.components.HeadingOfBlog;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class HeadingOfBlog_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
Object _dynamic_properties = bindings.get("properties");
Object _dynamic_pageproperties = bindings.get("pageproperties");
out.write("\n");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
    {
        Object var_templateoptions1_field$_categories = (new Object[] {"blogsite.site"});
        {
            java.util.Map var_templateoptions1 = obj().with("categories", var_templateoptions1_field$_categories);
            callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
        }
    }
}
out.write("\n\n<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"utf-8\"/>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n    <meta name=\"description\" content=\"\"/>\n    <meta name=\"author\" content=\"\"/>\n\n\n    <title>Bootcamp Blog</title>\n\n\n\n    <!-- Bootstrap core CSS -->\n\n\n    <!-- Custom styles for this template -->\n    <link href=\"https://fonts.googleapis.com/css?family=Playfair+Display:700,900\" rel=\"stylesheet\"/>\n\n</head>\n\n<body>\n    <h2 class=\"blog-post-title\">");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</h2>\n    <p class=\"blog-post-meta\">");
{
    String var_3 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.call("format", "MMM-dd, YYYY", obj().with("format", renderContext.getObjectModel().resolveProperty(_dynamic_pageproperties, "jcr:created"))), "text")) + " By ");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("<a");
{
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "link");
    {
        Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "uri");
        {
            Object var_shoulddisplayattr7 = ((renderContext.getObjectModel().toBoolean(var_attrcontent5) ? var_attrcontent5 : ("false".equals(var_attrvalue4))));
            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr7)) {
                out.write(" href");
                {
                    boolean var_istrueattr6 = (var_attrvalue4.equals(true));
                    if (!var_istrueattr6) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent5));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">");
{
    Object var_8 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "author"), "text");
    out.write(renderContext.getObjectModel().toString(var_8));
}
out.write("</a></p>\n\n    <!-- Placed at the end of the document so the pages load faster -->\n    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n    <script>window.jQuery || document.write('<script src=\"assets/js/vendor/jquery-slim.min.js\"><\\/script>')</script>\n\n    <script>\n      Holder.addTheme('thumb', {\n        bg: '#55595c',\n        fg: '#eceeef',\n        text: 'Thumbnail'\n      });\n    </script>\n</body>\n</html>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

