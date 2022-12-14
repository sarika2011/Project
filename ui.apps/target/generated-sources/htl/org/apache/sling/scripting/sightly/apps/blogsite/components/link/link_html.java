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
package org.apache.sling.scripting.sightly.apps.blogsite.components.link;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class link_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_model = bindings.get("model");
out.write("\n\n<!--<sly data-sly-use.model = \"com.blogsite.core.models.LinkModel\"></sly>-->\n");
{
    String var_0 = (("<!--<sly data-sly-test.var = \"" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_model, "target"), "comment"))) + "\"></sly>-->");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("\n");
{
    String var_1 = (("<!--<sly data-sly-test = \"" + renderContext.getObjectModel().toString(renderContext.call("xss", false, "comment"))) + "\">-->");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("\n");
{
    String var_2 = (((("<!--<a href = \"" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_model, "source"), "comment"))) + "\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_model, "label"), "comment"))) + "</a>-->");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("\n<!--</sly>-->\n");
{
    String var_3 = (("<!--<sly data-sly-test = \"" + renderContext.getObjectModel().toString(renderContext.call("xss", false, "comment"))) + "\">-->");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("\n");
{
    String var_4 = (((("<!--    <a href = \"" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_model, "source"), "comment"))) + "\" target = \"_blank\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_model, "label"), "comment"))) + "</a>-->");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("\n<!--</sly>-->\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

