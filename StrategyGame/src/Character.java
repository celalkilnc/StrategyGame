public class Character {
    private int Id; // 1 = Villager 2 = Warrior
    private int power; // 1-10

    public int getId()        { return this.Id; }
    public void setId(int id) { this.Id = id;   }

    public int getPower()           { return this.power;  }
    public void setPower(int power) { this.power = power; }
}
