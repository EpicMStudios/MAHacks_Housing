package com.mahacks.housing;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.util.HashMap;

import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import spark.Response;
import spark.Request;

class Main {
    public static final String GOODRESPONSE = "200";

    public static String index() {
        return GOODRESPONSE;
    }

    public static String handleFirstApplication(Request req, Response res, Applicant currentApplicant) {
        HashMap<String, String> values = parsePost(req.body());
        currentApplicant.setFirstName(values.get("firstname"));
        currentApplicant.setMiddleName(values.get("middlename"));
        currentApplicant.setLastName(values.get("lastname"));
        currentApplicant.setAddress(values.get("address"));
        currentApplicant.setAddress(currentApplicant.getAddress() + values.get("aptno"));
        currentApplicant.setAddress(currentApplicant.getAddress() + values.get("mailcity"));
        currentApplicant.setAddress(currentApplicant.getAddress() + values.get("mailstate"));
        currentApplicant.setAddress(currentApplicant.getAddress() + values.get("mailzipcode"));
        currentApplicant.setMailingAddress("" + values.get("mailaddress"));
        currentApplicant.setWorkAddress(values.get("workaddress"));
        currentApplicant.setPhone(values.get("homenum"));
        currentApplicant.setWorkPhone(values.get("worknum"));
        currentApplicant.setSsn(values.get("SSN"));
        //currentApplicant.setRace((values.get("nationality1")); //
       byte race = 0;

       if(values.get("nationality1"))
	 {
	    race += 1;
	 }
       if(values.get("nationality2"))
	 {
	    race+= 2;
	 }
       if(values.get("nationality3"))
	 {

	    race += 4;
	 }

       if(values.get("nationality4"))
	 {

	    race+= 8;
	 }
       if(values.get("nationality5"))
	 {

	    race += 16;
	 }

       

       currentApplicant.setRace(race);
        // currentApplicant.setHispanic((boolean) values.get("hispanic"));
        currentApplicant.setHispanic(true);
        System.out.println(currentApplicant.getFirstName());
        res.redirect("/apply_2");
        return GOODRESPONSE;
    }

    public static String handleSecondApplication(Request req, Response res, Applicant currentApplicant) {
        HashMap<String, String> values = parsePost(req.body());
        // currentApplicant.setGender(values.get("gender") == "Elderly");
        currentApplicant.setHousingType(2);
        currentApplicant.setPreference(2);
        currentApplicant.setWorkAddress(values.get("city"));
       byte fts;
       if(values.get("fuckthisshit") == "Elderly")
	 {

	    fts = 1;
	    
	 }
       else if(values.get("fuckthisshit") == "Non-Elderly, Handicapped")
	 {


	                fts = 2;

	 }
       else if(values.get("fuckthisshit") == "Congregate Elderly/Handicapped")
	 {



	                            fts = 3;

	 }

       else if(values.get("fuckthisshit") == "Family")
	 {



	                            fts = 4;

	 }

       else if(values.get("fuckthisshit") == "AHVP")
	 {



	                            fts = 5;

	 }

       else if(values.get("fuckthisshit") == "MRVP")
	 {



	                            fts = 6;

	 }

       
       
       currentApplicant.setHousingType(fts);

       
       
       res.redirect("/apply_3");
        return GOODRESPONSE;
    }

    public static String handleThirdApplication(Request req, Response res, Applicant currentApplicant) {
        HashMap<String, String> values = parsePost(req.body());
        currentApplicant.setDisability(values.get("wheelchair"));
        currentApplicant.setDisability(currentApplicant.getDisability() + values.get("bedrooms"));
        currentApplicant.setDisability(currentApplicant.getDisability() + values.get("transitional"));
        currentApplicant.setDisability(currentApplicant.getDisability() + values.get("owncar"));
        res.redirect("/");
        return GOODRESPONSE;
    }

    public static String stringCopy(String string, int start, int end) {
        String newString = "";
        for (int i = start; i < end; i++) {
            newString += string.charAt(i);
        }
        return newString;
    }

    public static HashMap<String, String> parsePost(String body) {
        try {
            body = URLDecoder.decode(body, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return new HashMap<String, String>();
        }
        HashMap<String, String> values = new HashMap<String, String>();
        int start = 0;
        String key = "";
        for (int i = 0; i < body.length(); i++) {
            if (body.charAt(i) == '=') {
                key = stringCopy(body, start, i);
                start = i + 1;
            } else if (body.charAt(i) == '&') {
                values.put(key, stringCopy(body, start, i));
                start = i + 1;
            }
        }
        return values;
    }

    public static void main(String args[]) {
        Applicant currentApplicant = new Applicant();
        DatabaseUtilHackathon.createTable("/home/jakob/temp/application.db");
        
        staticFileLocation("/public");
        get("/", (req, res) -> {return index();});
        get("/apply", (req, res) -> {
                return new ModelAndView(new HashMap<>(), "application.html");
            }, new FreeMarkerEngine());
         post("/apply", (req, res) -> {return handleFirstApplication(req, res, currentApplicant);});
        get("/apply_2", (req, res) -> {
                return new ModelAndView(new HashMap<>(), "application2.html");
            }, new FreeMarkerEngine());
        post("/apply_2", (req, res) -> {return handleSecondApplication(req, res, currentApplicant);});
        get("/apply_3", (req, res) -> {
                return new ModelAndView(new HashMap<>(), "application3.html");
            }, new FreeMarkerEngine());
        post("/apply_3", (req, res) -> {return handleThirdApplication(req, res, currentApplicant);});
    }
}
