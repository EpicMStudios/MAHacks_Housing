import static spark.Spark.*;

class Main
{

   public static void main(String args[])
     {
         get("/hello", (req, res) -> "Hello World");
	
     }
   
}
