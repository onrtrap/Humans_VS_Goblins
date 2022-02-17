public class goblin extends being{
    private int health;
    private int atk;
    private int def;
    private int speed;
    public goblin()
    {

    }
    public goblin(int health, int atk, int def, int speed)
    {
        health = this.health;
        atk = this.atk;
        def = this.def;
        speed = this.speed;
    }
    public String toString()
    {
        String output = "Type: " + whoAmI() + " Health: " + this.getHealth() + " ATK: " + this.getAtk() + " DEF: "  + this.getDef() + " SPD: " + this.getSpeed();
        return output;
    }

    public String whoAmI()
    {
        return "Goblin";
    }
}
