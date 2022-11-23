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
package org.apache.sling.scripting.sightly.apps.blogsite.components.footer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class footer_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_model = bindings.get("model");
Object _global_clientlib = null;
Object _global_body = null;
Collection var_collectionvar3_list_coerced$ = null;
out.write("<!--<div data-sly-use.model=\"com.mysite.core.models.FooterModel\">-->\n");
{
    String var_0 = (("<!--   Content of Footer : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_model, "textFooter"), "comment"))) + "-->");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("\n<!--</div>-->\n");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar1 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
    {
        Object var_templateoptions2_field$_categories = (new Object[] {"blogsite.site"});
        {
            java.util.Map var_templateoptions2 = obj().with("categories", var_templateoptions2_field$_categories);
            callUnit(out, renderContext, var_templatevar1, var_templateoptions2);
        }
    }
}
out.write("\n");
_global_body = renderContext.call("use", com.blogsite.core.models.FooterModel.class.getName(), obj());
out.write("\n<p class=\"align-center\">\n    <a href=\"#top\">Back to top</a>\n</p>\n\n<footer class=\"blog-footer\">\n    <div class=\"row\">\n        <div class=\"col-xs-12 col-sm-12 \">\n            <div class=\"footer__block\">\n                ");
{
    Object var_collectionvar3 = renderContext.getObjectModel().resolveProperty(_global_body, "links");
    {
        long var_size4 = ((var_collectionvar3_list_coerced$ == null ? (var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3)) : var_collectionvar3_list_coerced$).size());
        {
            boolean var_notempty5 = (var_size4 > 0);
            if (var_notempty5) {
                {
                    long var_end8 = var_size4;
                    {
                        boolean var_validstartstepend9 = (((0 < var_size4) && true) && (var_end8 > 0));
                        if (var_validstartstepend9) {
                            if (var_collectionvar3_list_coerced$ == null) {
                                var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3);
                            }
                            long var_index10 = 0;
                            for (Object item : var_collectionvar3_list_coerced$) {
                                {
                                    boolean var_traversal12 = (((var_index10 >= 0) && (var_index10 <= var_end8)) && true);
                                    if (var_traversal12) {
                                        out.write("\n                <a target=\"\"");
                                        {
                                            Object var_attrvalue13 = renderContext.getObjectModel().resolveProperty(item, "link");
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
                                        out.write(" aria-label=\"PwC office locations\">");
                                        {
                                            Object var_17 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "name"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_17));
                                        }
                                        out.write("</a></t>\n                ");
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
out.write("\n            </div>\n        </div>\n    </div>\n    <p>\u00A9 2022  - 2023 TTN Bootcamp. All rights reserved.</p>\n</footer>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

