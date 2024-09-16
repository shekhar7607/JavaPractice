public class Singleton {

    private static Singleton single_instance = null;

    public String s;

    private Singleton(){
        s = "Hello i am a string, part of singleton class";
    }

    public static Singleton swami()
    {
        if (single_instance == null)
        {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}




