public class being {
    private int health;
    private int atk;
    private int def;
    private int speed;
    public being()
    {

    }
    public being(int health, int atk, int def, int speed)
    {
        health = this.health;
        atk = this.atk;
        def = this.def;
        speed = this.speed;
    }

    public String whoAmI()
    {
        return "Being";
    }

    public int getHealth() {
        return health;
    }


    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void damage(being being)
    {
       this.setHealth(health - being.getAtk() - this.def);
        System.out.println(whoAmI() + " " + (being.getAtk() - this.def) + " points of damage!");
    }
}
