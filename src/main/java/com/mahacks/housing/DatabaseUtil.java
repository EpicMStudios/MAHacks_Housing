import java.sql.*;

public class DatabaseUtil
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
	     String sql = "CREATE TABLE Applicants " +
	       " (firstName text NOT NULL, " +
	       " middleName text NOT NULL, " +
	       " lastName text NOT NULL, " +
	       " sex int NOT NULL, " +
	       " race int NOT NULL, " +
	       " isHispanic int NOT NULL, " +
	       " housingType int NOT NULL, " +
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
	       " ssn text NOT NULL, ";
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
   
   public static void insertInto(String dbPath, String table, String firstName, String middleName, String lastName, int sex, int race, int isHispanic, int housingType, String disability, String veteran, String income, String address, String mailingAddress, String phone, String workPhone, String email, int emergencyHousing, int preference, String ssn)
     {
	
	Connection c = null;
	    Statement stmt = null;
	    try 
	  {

	           Class.forName("org.sqlite.JDBC");
	           c = connect(dbPath);
	           c.setAutoCommit(false);

	           stmt = c.createStatement();
	           String sql = "INSERT INTO "+table+"(firstName, middleName, lastName, sex, race, isHispanic, housingType, disability, veteran, income, address, mailingAddress, phone, workPhone, email, emergencyHousing, preference, ssn) " +
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

	Connection c = null;
	    Statement stmt = null;
	    try 
	  {

	           Class.forName("org.sqlite.JDBC");
	           c = connect(dbpath);
	           c.setAutoCommit(false);

	           stmt = c.createStatement();
	           String sql = "UPDATE "+ table +" set "+ a +"="+ b +" where "+ c +"="+ d +" ;";
	           stmt.executeUpdate(sql);
	           c.commit();

	           ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );

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
	
     }

   public static void setAtoBWhereCIsD(String dbpath, String table, String a, int b, String c, int d)
     {


	        Connection c = null;
	            Statement stmt = null;
	            try
	  {


	                        Class.forName("org.sqlite.JDBC");
	                        c = connect(dbpath);
	                        c.setAutoCommit(false);

	                        stmt = c.createStatement();
	                        String sql = "UPDATE "+ table +" set "+ a +"="+ b +" where "+ c +"="+ d +" ;";
	                        stmt.executeUpdate(sql);
	                        c.commit();

	                        ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );

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

     }

   public static void setAtoBWhereCIsD(String dbpath, String table, String a, String b, String c, int d)
     {


	        Connection c = null;
	            Statement stmt = null;
	            try
	  {


	                        Class.forName("org.sqlite.JDBC");
	                        c = connect(dbpath);
	                        c.setAutoCommit(false);

	                        stmt = c.createStatement();
	                        String sql = "UPDATE "+ table +" set "+ a +"="+ b +" where "+ c +"="+ d +" ;";
	                        stmt.executeUpdate(sql);
	                        c.commit();

	                        ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );

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

     }

   public static void setAtoBWhereCIsD(String dbpath, String table, String a, int b, String c, String d)
     {


	        Connection c = null;
	            Statement stmt = null;
	            try
	  {


	                        Class.forName("org.sqlite.JDBC");
	                        c = connect(dbpath);
	                        c.setAutoCommit(false);

	                        stmt = c.createStatement();
	                        String sql = "UPDATE "+ table +" set "+ a +"="+ b +" where "+ c +"="+ d +" ;";
	                        stmt.executeUpdate(sql);
	                        c.commit();

	                        ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );

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

	           ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );

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
     }
   
     }
   
}
