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

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getDmg() {
        return dmg;
    }

    public void setDmg(float dmg) {
        this.dmg = dmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attacca(Troll enemy) {
        enemy.setHp(enemy.getHp()-dmg);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return "Troll {" +
                "Punti vita = " + hp +
                ", punti danno = " + dmg +
                ", nome = '" + name + '\'' +
                '}';
    }
}
