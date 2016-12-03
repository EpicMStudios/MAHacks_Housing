import java.util.HashMap;

import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

class Main
{

   public static void main(String args[])
     {
         staticFileLocation("/public");
         get("/", (req, res) -> new ModelAndView(new HashMap<>(), "index.ftl"));
     }
   
}
