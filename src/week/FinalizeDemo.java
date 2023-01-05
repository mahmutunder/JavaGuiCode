package week;

public class FinalizeDemo {
    public static void main(String[] args)
    {
        String s1 = "Team Azha!!";
        s1 = null;
        System.gc(); // from system gc method calls garbage collector
        System.out.println("Garbage collector is called");
    }

    @Override
    protected void finalize()
    {
        System.out.println("Finalize method is called.");
    }
}
