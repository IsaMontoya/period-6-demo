
/**
 * A guess the password program.
 *
 * @author  Isa Montoya
 * @version 11/20/18
 */
public class Reverse
{
    public static final String SECRET_PASSWORD = "CLOUDS";
    
    static String obfuscate(String input)
    {
        return input.replace('C', 'K') .replace('O', '0') .replace('S' , 'Z');
    }
    public static void main(String [] args) {
        if (args.length != 1)
        {
            System.out.print("Wrong! You have to run thid program with one argument :\njava Reverse <argument>");
            return;
        }
        
        if (args[0]. equals (obfuscate(SECRET_PASSWORD)))
        {
            System.out.println("You win! Congratulations!");
        }
        else
        {
            System.out.println("Wrong password! Try wrong!");
        }
    }
}
