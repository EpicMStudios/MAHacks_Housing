import java.util.HashMap;

import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import spark.Response;
import spark.Request;

class Main
{

   public static final string GOODRESPONSE = "200";

   public static String index()
     {
         return GOODRESPONSE;
     }

   public static String handleFirstApplication(Request req, Response res)
     {
         System.out.println(req.body());
         res.redirect("/apply_2");
         return GOODRESPONSE;
     }

    public static String handleSecondApplication(Request req, Response res)
     {
         System.out.println(req.body());
         res.redirect("/apply_3");
         return GOODRESPONSE;
     }

    public static String handleThirdApplication(Request req, Response res)
     {
         System.out.println(req.body());
         res.redirect("/");
         return GOODRESPONSE;
     }

   public static void main(String args[])
     {
         staticFileLocation("/public");
         get("/", (req, res) -> {return index();});
         get("/apply", (req, res) -> {
                 return new ModelAndView(new HashMap<>(), "application.html");
             }, new FreeMarkerEngine());
         post("/apply", (req, res) -> {return handleFirstApplication(req, res);});
         get("/apply_2", (req, res) -> {
                 return new ModelAndView(new HashMap<>(), "application2.html");
             }, new FreeMarkerEngine());
         post("/apply_2", (req, res) -> {return handleSecondApplication(req, res);});
         get("/apply_3", (req, res) -> {
                 return new ModelAndView(new HashMap<>(), "application3.html");
             }, new FreeMarkerEngine());
         post("/apply_3", (req, res) -> {return handleThirdApplication(req, res);});
     }
   
}
