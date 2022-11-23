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
package org.apache.sling.scripting.sightly.apps.blogsite.components.carouselHomepage;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class carouselHomepage_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_clientlib = null;
Collection var_collectionvar2_list_coerced$ = null;
Collection var_collectionvar18_list_coerced$ = null;
_global_model = renderContext.call("use", com.blogsite.core.models.CarouselModelHomepage.class.getName(), obj());
out.write("\n    ");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "all");
    {
        String var_templateoptions1_field$_categories = "blogsite.site";
        {
            java.util.Map var_templateoptions1 = obj().with("categories", var_templateoptions1_field$_categories);
            callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
        }
    }
}
out.write("\n\n\n    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n\n        <ol class=\"carousel-indicators\">\n\n            ");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_global_model, "listBanner");
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
                                    long itemlist_field$_index = var_index9;
                                    {
                                        boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                        if (var_traversal11) {
                                            out.write("\n                ");
                                            {
                                                boolean var_testvariable12 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(itemlist_field$_index, 0));
                                                if (var_testvariable12) {
                                                    out.write("\n                    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n                ");
                                                }
                                            }
                                            out.write("\n                ");
                                            {
                                                boolean var_testvariable13 = (!org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(itemlist_field$_index, 0));
                                                if (var_testvariable13) {
                                                    out.write("\n                    <li data-target=\"#myCarousel\"");
                                                    {
                                                        long var_attrvalue14 = itemlist_field$_index;
                                                        {
                                                            Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "attribute");
                                                            {
                                                                Object var_shoulddisplayattr17 = ((renderContext.getObjectModel().toBoolean(var_attrcontent15) ? var_attrcontent15 : ("false".equals(var_attrvalue14))));
                                                                if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr17)) {
                                                                    out.write(" data-slide-to");
                                                                    {
                                                                        boolean var_istrueattr16 = (((Object)var_attrvalue14).equals(true));
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
                                                    out.write("></li>\n                ");
                                                }
                                            }
                                            out.write("\n            ");
                                        }
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
out.write("\n        </ol>\n\n\n\n        <!-- Wrapper for slides -->\n        <div class=\"carousel-inner\">\n\n            ");
{
    Object var_collectionvar18 = renderContext.getObjectModel().resolveProperty(_global_model, "listBanner");
    {
        long var_size19 = ((var_collectionvar18_list_coerced$ == null ? (var_collectionvar18_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar18)) : var_collectionvar18_list_coerced$).size());
        {
            boolean var_notempty20 = (var_size19 > 0);
            if (var_notempty20) {
                {
                    long var_end23 = var_size19;
                    {
                        boolean var_validstartstepend24 = (((0 < var_size19) && true) && (var_end23 > 0));
                        if (var_validstartstepend24) {
                            if (var_collectionvar18_list_coerced$ == null) {
                                var_collectionvar18_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar18);
                            }
                            long var_index25 = 0;
                            for (Object item : var_collectionvar18_list_coerced$) {
                                {
                                    long itemlist_field$_index = var_index25;
                                    {
                                        boolean var_traversal27 = (((var_index25 >= 0) && (var_index25 <= var_end23)) && true);
                                        if (var_traversal27) {
                                            out.write("\n                ");
                                            {
                                                boolean var_testvariable28 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(itemlist_field$_index, 0));
                                                if (var_testvariable28) {
                                                    out.write("\n                    <div class=\"item active\">\n                        <img");
                                                    {
                                                        Object var_attrvalue29 = renderContext.getObjectModel().resolveProperty(item, "image");
                                                        {
                                                            Object var_attrcontent30 = renderContext.call("xss", var_attrvalue29, "uri");
                                                            {
                                                                Object var_shoulddisplayattr32 = ((renderContext.getObjectModel().toBoolean(var_attrcontent30) ? var_attrcontent30 : ("false".equals(var_attrvalue29))));
                                                                if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr32)) {
                                                                    out.write(" src");
                                                                    {
                                                                        boolean var_istrueattr31 = (var_attrvalue29.equals(true));
                                                                        if (!var_istrueattr31) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent30));
                                                                            out.write("\"");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    out.write(" alt=\"AEM 1\" style=\"width:100%;height: 325px;\"/>\n                        <div class=\"carousel-caption\">\n                            <a");
                                                    {
                                                        Object var_attrvalue33 = renderContext.getObjectModel().resolveProperty(item, "link");
                                                        {
                                                            Object var_attrcontent34 = renderContext.call("xss", var_attrvalue33, "uri");
                                                            {
                                                                Object var_shoulddisplayattr36 = ((renderContext.getObjectModel().toBoolean(var_attrcontent34) ? var_attrcontent34 : ("false".equals(var_attrvalue33))));
                                                                if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr36)) {
                                                                    out.write(" href");
                                                                    {
                                                                        boolean var_istrueattr35 = (var_attrvalue33.equals(true));
                                                                        if (!var_istrueattr35) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent34));
                                                                            out.write("\"");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    out.write("><h3>");
                                                    {
                                                        Object var_37 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "text"), "text");
                                                        out.write(renderContext.getObjectModel().toString(var_37));
                                                    }
                                                    out.write("</h3></a>\n                            <p>Read more about this</p>\n                        </div>\n                    </div>\n                ");
                                                }
                                            }
                                            out.write("\n                ");
                                            {
                                                boolean var_testvariable38 = (!org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(itemlist_field$_index, 0));
                                                if (var_testvariable38) {
                                                    out.write("\n                    <div class=\"item\">\n                        <img");
                                                    {
                                                        Object var_attrvalue39 = renderContext.getObjectModel().resolveProperty(item, "image");
                                                        {
                                                            Object var_attrcontent40 = renderContext.call("xss", var_attrvalue39, "uri");
                                                            {
                                                                Object var_shoulddisplayattr42 = ((renderContext.getObjectModel().toBoolean(var_attrcontent40) ? var_attrcontent40 : ("false".equals(var_attrvalue39))));
                                                                if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr42)) {
                                                                    out.write(" src");
                                                                    {
                                                                        boolean var_istrueattr41 = (var_attrvalue39.equals(true));
                                                                        if (!var_istrueattr41) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent40));
                                                                            out.write("\"");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    out.write(" alt=\"AEM 1\" style=\"width:100%;height: 325px;\"/>\n                        <div class=\"carousel-caption\">\n                            <a");
                                                    {
                                                        Object var_attrvalue43 = renderContext.getObjectModel().resolveProperty(item, "link");
                                                        {
                                                            Object var_attrcontent44 = renderContext.call("xss", var_attrvalue43, "uri");
                                                            {
                                                                Object var_shoulddisplayattr46 = ((renderContext.getObjectModel().toBoolean(var_attrcontent44) ? var_attrcontent44 : ("false".equals(var_attrvalue43))));
                                                                if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr46)) {
                                                                    out.write(" href");
                                                                    {
                                                                        boolean var_istrueattr45 = (var_attrvalue43.equals(true));
                                                                        if (!var_istrueattr45) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent44));
                                                                            out.write("\"");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    out.write("><h3>");
                                                    {
                                                        Object var_47 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "text"), "text");
                                                        out.write(renderContext.getObjectModel().toString(var_47));
                                                    }
                                                    out.write("</h3></a>\n                            <p>Read more about this</p>\n                            <script>");
                                                    {
                                                        String var_48 = (("\n                                console.log(" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "link"), "html"))) + ")\n                            ");
                                                        out.write(renderContext.getObjectModel().toString(var_48));
                                                    }
                                                    out.write("</script>\n                        </div>\n                    </div>\n                ");
                                                }
                                            }
                                            out.write("\n            ");
                                        }
                                    }
                                }
                                var_index25++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar18_list_coerced$ = null;
}
out.write("\n        </div>\n\n        <!-- Left and right controls -->\n        <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n            <span class=\"glyphicon glyphicon-chevron-left\"></span>\n            <span class=\"sr-only\">Previous</span>\n        </a>\n        <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n            <span class=\"glyphicon glyphicon-chevron-right\"></span>\n            <span class=\"sr-only\">Next</span>\n        </a>\n    </div>\n\n</div>\n\n<!-- Bootstrap core JavaScript\n================================================== -->\n\n\n<script>\n      Holder.addTheme('thumb', {\n        bg: '#55595c',\n        fg: '#eceeef',\n        text: 'Thumbnail'\n      });\n    </script>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

