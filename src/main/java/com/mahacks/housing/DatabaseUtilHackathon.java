package com.mahacks.housing;

import java.util.ArrayList;

import java.sql.*;

class DatabaseUtilHackathon
{
   public static Connection connect(String path)
     {
	Connection c = null;
	try 
	  {
	     Class.forName("org.sqlite.JDBC");
	     c = DriverManager.getConnection("jdbc:sqlite:"+path); //test.db
	  }
	catch ( Exception e ) 
	  {
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	     System.exit(0);
	  }
	
	System.out.println("Opened database successfully");
	return c;
     }
   
   public static void createTable(String dbPath)
     {
	Connection c = null;
	Statement stmt = null;
	try 
	  {
	     
	     Class.forName("org.sqlite.JDBC");
	     c = connect(dbPath);
	     
	     stmt = c.createStatement();
	     String sql = "CREATE TABLE IF NOT EXISTS Applicants " +
	       " (id integer NOT NULL PRIMARY KEY AUTOINCREMENT, " +
	       " firstName text NOT NULL, " +
	       " middleName text NOT NULL, " +
	       " lastName text NOT NULL, " +
	       " sex integer NOT NULL, " +
	       " race integer NOT NULL, " +
	       " isHispanic integer NOT NULL, " +
	       " housingType integer NOT NULL, " +
	       " disability text NOT NULL, " +
	       " veteran text NOT NULL, " +
	       " income integer NOT NULL, " +
	       " address text NOT NULL, " +
	       " mailingAddress text NOT NULL, " +
	       " phone text NOT NULL, " +
	       " workPhone text NOT NULL, " +
	       " email text NOT NULL, " +
	       " emergencyHousing integer NOT NULL, " +
	       " preference integer NOT NULL, " +
	       " ssn text NOT NULL, " +
	       " timeOnWaitingList integer NOT NULL);";
	     stmt.executeUpdate(sql);
	     stmt.close();
	     c.close();
	  }
	catch ( Exception e ) 
	  {
	     
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	     System.exit(0);
	  }
	
	System.out.println("Table created successfully");
	
     }
   
   public static void insertInto(String dbPath, String table, String firstName, String middleName, String lastName, int sex, int race, int isHispanic, int housingType, String disability, String veteran, String income, String address, String mailingAddress, String phone, String workPhone, String email, int emergencyHousing, int preference, String ssn, int timeOnWaitingList)
     {
	
	Connection c = null;
	Statement stmt = null;
	try 
	  {
	     
	     Class.forName("org.sqlite.JDBC");
	     c = connect(dbPath);
	     c.setAutoCommit(false);
	     
	     stmt = c.createStatement();
	     String sql = "INSERT INTO "+table+"(firstName, middleName, lastName, sex, race, isHispanic, housingType, disability, veteran, income, address, mailingAddress, phone, workPhone, email, emergencyHousing, preference, ssn, timeOnWaitingList) " +
	       "VALUES ("+firstName+","+middleName+","+lastName+","+sex+","+race+","+isHispanic+","+housingType+","+disability+","+veteran+","+income+","+address+","+mailingAddress+","+phone+","+workPhone+","+email+","+emergencyHousing+","+preference+","+ssn+");";
	     stmt.executeUpdate(sql);
	     
	     stmt.close();
	     c.commit();
	     c.close();
	  }
	catch ( Exception e ) 
	  {
	     
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	     System.exit(0);
	  }
	
	System.out.println("Records created successfully");
	
     }   
   public static void setAtoBWhereCIsD(String dbpath, String table, String a, String b, String c, String d)
     {
	
	Connection cunt = null;
	Statement stmt = null;
	try 
	  {
	     
	     Class.forName("org.sqlite.JDBC");
	     cunt = connect(dbpath);
	     cunt.setAutoCommit(false);
	     
	     stmt = cunt.createStatement();
	     String sql = "UPDATE "+ table +" set "+ a +"="+ b +" where "+ c +"="+ d +" ;";
	     stmt.executeUpdate(sql);
	     cunt.commit();
	     
	     //ResultSet rs = stmt.executeQuery( "SELECT * FROM "+table+";" );
	     
	     //rs.close();
	     stmt.close();
	     cunt.close();
	  }
	catch ( Exception e ) 
	  {
	     
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	     System.exit(0);
	  }
	
	System.out.println("Operation done successfully");
	
     }
   
   public static void setAtoBWhereCIsD(String dbpath, String table, String a, int b, String c, int d)
     {
	
	
	Connection cuck = null;
	Statement stmt = null;
	try
	  {
	     
	     
	     Class.forName("org.sqlite.JDBC");
	     cuck = connect(dbpath);
	     cuck.setAutoCommit(false);
	     
	     stmt = cuck.createStatement();
	     String sql = "UPDATE "+ table +" set "+ a +"="+ b +" where "+ c +"="+ d +" ;";
	     stmt.executeUpdate(sql);
	     cuck.commit();
	     
	     //ResultSet rs = stmt.executeQuery( "SELECT * FROM "+table+";" );
	     
	     //rs.close();
	     stmt.close();
	     cuck.close();
	  }
	
	catch ( Exception e )
	  {
	     
	     
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	     System.exit(0);
	  }
	

	System.out.println("Operation done successfully");
	
     }
   
   public static void setAtoBWhereCIsD(String dbpath, String table, String a, String b, String c, int d)
     {
	
	
	Connection cuck = null;
	Statement stmt = null;
	try
	  {
	     
	     
	     Class.forName("org.sqlite.JDBC");
	     cuck = connect(dbpath);
	     cuck.setAutoCommit(false);
	     
	     stmt = cuck.createStatement();
	     String sql = "UPDATE "+ table +" set "+ a +"="+ b +" where "+ c +"="+ d +" ;";
	     stmt.executeUpdate(sql);
	     cuck.commit();
	     
	     //ResultSet rs = stmt.executeQuery( "SELECT * FROM "+table+";" );
	     
	     //rs.close();
	     stmt.close();
	     cuck.close();
	  }
	
	catch ( Exception e )
	  {
	     
	     
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	                        System.exit(0);
	  }
	
	
	System.out.println("Operation done successfully");
	
     }
   
   public static void setAtoBWhereCIsD(String dbpath, String table, String a, int b, String c, String d)
     {
	
	
	Connection cpenis = null;
	Statement stmt = null;
	try
	  {
	     
	     
	     Class.forName("org.sqlite.JDBC");
	     cpenis = connect(dbpath);
	     cpenis.setAutoCommit(false);
	     
	     stmt = cpenis.createStatement();
	     String sql = "UPDATE "+ table +" set "+ a +"="+ b +" where "+ c +"="+ d +" ;";
	     stmt.executeUpdate(sql);
	     cpenis.commit();
	     
	     //ResultSet rs = stmt.executeQuery( "SELECT * FROM "+table+";" );
	     
	     //rs.close();
	                        stmt.close();
	     cpenis.close();
	  }

	catch ( Exception e )
	  {
	     
	     
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	     System.exit(0);
	  }
	
	
	System.out.println("Operation done successfully");
	
     }
   
   public static void deleteWhereAIsB(String dbPath, String table, String a, String b)
     {
	Connection c = null;
	    Statement stmt = null;
	try 
	  {
	     
	     Class.forName("org.sqlite.JDBC");
	     c = connect(dbPath); 
	     c.setAutoCommit(false);
	     //System.out.println("Opened database successfully");
	     
	     stmt = c.createStatement();
	     String sql = "DELETE from "+ table +" where "+a+"="+b+";";
	     stmt.executeUpdate(sql);
	     c.commit();
	     
	     //ResultSet rs = stmt.executeQuery( "SELECT * FROM "+table+";" );
	     
	     //rs.close();
	     stmt.close();
	     c.close();
	  }
	catch ( Exception e ) 
	  {
	     
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	     System.exit(0);
	  }
	
	System.out.println("Operation done successfully");
	
	
     }
   
   public static void deleteWhereAIsB(String dbPath, String table, String a, int b)
     {
	
	Connection c = null;
	Statement stmt = null;
	try
	  {
	     
	     
	     Class.forName("org.sqlite.JDBC");
	     c = connect(dbPath);
	     c.setAutoCommit(false);
	     //System.out.println("Opened database successfully");
	     
	     stmt = c.createStatement();
	     String sql = "DELETE from "+ table +" where "+a+"="+b+";";
	     stmt.executeUpdate(sql);
	     c.commit();
	     
	     //ResultSet rs = stmt.executeQuery( "SELECT * FROM "+table+";" );
	     
	     stmt.close();
	     c.close();
	  }
	
	catch ( Exception e )
	  {
	     
	     
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	     System.exit(0);
	  }
	
	
	System.out.println("Operation done successfully");
	
	
	
     }
   
   public static Applicant[] getApplicantWhereAIsB(String dbPath, String table, String a, int b)
     {

	ArrayList<Applicant> applicants = new ArrayList<Applicant>();
	
	Connection c = null;
	Statement stmt = null;
	try 
	  {
	     
	     Class.forName("org.sqlite.JDBC");
	     c = connect(dbPath);
	     c.setAutoCommit(false);
	     //System.out.println("Opened database successfully");
	     
	     stmt = c.createStatement();
	     ResultSet rs = stmt.executeQuery( "SELECT FROM "+table+" where "+a+"="+b+";" );
	     while ( rs.next() ) 
	       {

                   applicants.add(new Applicant(rs.getInt("id"), rs.getString("firstName"), rs.getString("middleName"), rs.getString("lastName"), rs.getInt("sex") == 1, rs.getString("address"), rs.getString("mailingAddress"), rs.getString("workAddress"), rs.getInt("race"), rs.getInt("isHispanic") == 1, rs.getString("disability"), rs.getString("VeteranStatus"), rs.getInt("income"), rs.getString(" phone"), rs.getString("workPhone"), rs.getString("email"), (byte) rs.getInt("housingType"), rs.getInt("emergencyHousing") == 1, rs.getInt("preferance"), rs.getString("ssn"), rs.getInt("timeOnWaitlist")));
		  
	       }
	     
	     rs.close();
	     stmt.close();
	     c.close();
     }
	catch ( Exception e ) 
	  {
	     
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	     System.exit(0);
	  }
	
	System.out.println("Operation done successfully");
	return (Applicant[]) applicants.toArray();
     }
   
   
}
