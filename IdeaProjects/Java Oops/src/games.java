class Tommy_Vecetti{
    public void hit()
    {
        System.out.println("Hitting the enemy");
    }
    public void run()
    {
        System.out.println("Running from the enemy");
    }
    public void fire()
    {
        System.out.println("Firing on the enemy");
    }
}
public class games {
    public static void main(String[] args) {
        Tommy_Vecetti t=new Tommy_Vecetti();
        t.hit();
        t.run();
        t.fire();

    }
}
