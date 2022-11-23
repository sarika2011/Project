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
package org.apache.sling.scripting.sightly.apps.blogsite.components.ArchivesOfBlogPage;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class ArchivesOfBlogPage_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
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
out.write("\n\n<head>\n    <meta charset=\"utf-8\"/>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n    <meta name=\"description\" content=\"\"/>\n    <meta name=\"author\" content=\"\"/>\n    <link rel=\"icon\" href=\"assets/img/favicons/favicon.ico\"/>\n\n    <title>Bootcamp Blog</title>\n\n    <link rel=\"canonical\" href=\"homepage.html\"/>\n\n    <!-- Bootstrap core CSS -->\n    <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\"/>\n    <link hreef=\"dist/css/custom.css\" <!-- Custom styles for this template --/>\n    <link href=\"https://fonts.googleapis.com/css?family=Playfair+Display:700,900\" rel=\"stylesheet\"/>\n    <link href=\"blog.css\" rel=\"stylesheet\"/>\n</head>\n\n<body>\n\n                <h4 class=\"font-italic\">Archives</h4>\n                <ol class=\"list-unstyled mb-0\">\n                    <li><a href=\"https://learning.tothenew.com/ttn/dashboard\">January 2022</a></li>\n                    <li><a href=\"https://learning.tothenew.com/ttn/dashboard\">February 2022</a></li>\n                    <li><a href=\"https://learning.tothenew.com/ttn/dashboard\">March 2022</a></li>\n                    <li><a href=\"https://learning.tothenew.com/ttn/dashboard\">April 2022</a></li>\n                    <li><a href=\"https://learning.tothenew.com/ttn/dashboard\">May 2022</a></li>\n                    <li><a href=\"https://learning.tothenew.com/ttn/dashboard\">June 2022</a></li>\n                    <li><a href=\"https://learning.tothenew.com/ttn/dashboard\">July 2022</a></li>\n                    <li><a href=\"https://learning.tothenew.com/ttn/dashboard\">August 2022</a></li>\n                    <li><a href=\"https://learning.tothenew.com/ttn/dashboard\">September 2022</a></li>\n                    <li><a href=\"https://learning.tothenew.com/ttn/dashboard\">October 2022</a></li>\n                    <li><a href=\"https://learning.tothenew.com/ttn/dashboard\">November 2022</a></li>\n                    <li><a href=\"https://learning.tothenew.com/ttn/dashboard\">December 2022</a></li>\n                </ol>\n\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

