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
package org.apache.sling.scripting.sightly.apps.blogsite.components.header;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class header_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_body = bindings.get("body");
Object _global_clientlib = null;
Object _global_body = null;
Collection var_collectionvar9_list_coerced$ = null;
out.write("<!--<div data-sly-use.body=\"com.mysite.core.models.HeaderModel\">-->\n");
{
    String var_0 = (("<!--   text : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_body, "color"), "comment"))) + "-->");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("\n");
{
    String var_1 = (("<!--   color : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_body, "text"), "comment"))) + "-->");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("\n<!--</div>-->\n");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar2 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
    {
        Object var_templateoptions3_field$_categories = (new Object[] {"blogsite.site"});
        {
            java.util.Map var_templateoptions3 = obj().with("categories", var_templateoptions3_field$_categories);
            callUnit(out, renderContext, var_templatevar2, var_templateoptions3);
        }
    }
}
out.write("\n");
_global_body = renderContext.call("use", com.blogsite.core.models.HeaderModel.class.getName(), obj());
out.write("\n<a name=\"top\"></a>\n<div class=\"row flex-nowrap justify-content-between align-items-center\">\n    <div class=\"col-12 text-center\">\n        <a class=\"blog-header-logo text-dark\" href=\"https://www.tothenew.com/\">\n            <img");
{
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_body, "logo");
    {
        Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "uri");
        {
            Object var_shoulddisplayattr7 = ((renderContext.getObjectModel().toBoolean(var_attrcontent5) ? var_attrcontent5 : ("false".equals(var_attrvalue4))));
            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr7)) {
                out.write(" src");
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
out.write(" class=\"ttn-logo\"/>");
{
    String var_8 = (("\n            " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_body, "title"), "text"))) + "\n        ");
    out.write(renderContext.getObjectModel().toString(var_8));
}
out.write("</a>\n    </div>\n</div>\n</header>\n\n<div class=\"nav-scroller py-1 mb-2\">\n    <nav class=\"nav d-flex\">\n        ");
{
    Object var_collectionvar9 = renderContext.getObjectModel().resolveProperty(_global_body, "links");
    {
        long var_size10 = ((var_collectionvar9_list_coerced$ == null ? (var_collectionvar9_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar9)) : var_collectionvar9_list_coerced$).size());
        {
            boolean var_notempty11 = (var_size10 > 0);
            if (var_notempty11) {
                {
                    long var_end14 = var_size10;
                    {
                        boolean var_validstartstepend15 = (((0 < var_size10) && true) && (var_end14 > 0));
                        if (var_validstartstepend15) {
                            if (var_collectionvar9_list_coerced$ == null) {
                                var_collectionvar9_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar9);
                            }
                            long var_index16 = 0;
                            for (Object item : var_collectionvar9_list_coerced$) {
                                {
                                    boolean var_traversal18 = (((var_index16 >= 0) && (var_index16 <= var_end14)) && true);
                                    if (var_traversal18) {
                                        out.write("\n        <a class=\"p-2 text-muted\"");
                                        {
                                            Object var_attrvalue19 = renderContext.getObjectModel().resolveProperty(item, "link");
                                            {
                                                Object var_attrcontent20 = renderContext.call("xss", var_attrvalue19, "uri");
                                                {
                                                    Object var_shoulddisplayattr22 = ((renderContext.getObjectModel().toBoolean(var_attrcontent20) ? var_attrcontent20 : ("false".equals(var_attrvalue19))));
                                                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr22)) {
                                                        out.write(" href");
                                                        {
                                                            boolean var_istrueattr21 = (var_attrvalue19.equals(true));
                                                            if (!var_istrueattr21) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent20));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(">");
                                        {
                                            Object var_23 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "name"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_23));
                                        }
                                        out.write("</a>\n        ");
                                    }
                                }
                                var_index16++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar9_list_coerced$ = null;
}
out.write("\n    </nav>\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

