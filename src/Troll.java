public class Troll {
    private float hp;
    private float dmg;
    private String name;

    public Troll(float hp, float dmg, String name) throws Exception {
        if(hp > 0) {
            this.hp = hp;
            this.dmg = dmg;
            this.name = name;
        } else {
            throw new Exception("\nValore punti vita non valido!");
        }
    }
}
