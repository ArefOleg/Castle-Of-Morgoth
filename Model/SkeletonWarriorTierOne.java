package Model;

public class SkeletonWarriorTierOne extends AbstractEntity{
    public SkeletonWarriorTierOne(String name, int damage, int hp){
        this.setBaseDamage(damage);
        this.setName(name);
        this.setHp(hp);
    }
    
}
