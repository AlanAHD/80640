package mx.uv.c80640;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        get("/hello", (req, res) -> "Hello World");
        get("/eduardo", (req, res) -> "Hello Eduardo");
        get("/alex", (req, res) -> "Hello Alex");
        get("/brandon", (req, res) -> "Hello Brandon");
        get("/", (req, res) -> "<h1>Bienvenido</h1><img src='https://www.uv.mx/v2/images/logouv.jpg'>");
        // get("/", (req, res) -> "Hola");

        // post("/", (req, res) -> {
        //     System.out.println(req.queryParams(null));
        //     System.out.println(req.body());
        // });
        
    }
}
