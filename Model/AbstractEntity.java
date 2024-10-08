package Model;

public class AbstractEntity {
    
    private Integer initiative;
    public Integer getInitiative() {
        return initiative;
    }

    public void setInitiative(Integer initiative) {
        this.initiative = initiative;
    }

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer hp;
    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    private Integer baseDamage;
    public AbstractEntity(String name, Integer hp, Integer baseDamage, Integer initiative) {
        this.initiative = initiative;
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    public Integer getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(Integer baseDamage) {
        this.baseDamage = baseDamage;
    }

}
