public class JtpExample {

    private String s;

    JtpExample(String s)
    {
        this.s = s;
    }

    public String getName()
    {
        return s;
    }

    public void setName(String coursename)
    {
        this.s = coursename;
    }


    public static void main(String[] args) {

        JtpExample j = new JtpExample("History");
        System.out.println(j.getName());

        j.setName("maths");

        System.out.println(j.getName());
    }
}
