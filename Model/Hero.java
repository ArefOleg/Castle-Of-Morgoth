package Model;

public class Hero extends AbstractEntity{
    

    public Hero(Integer level) {    
        this.setHp(level * 10);
        this.setName("Hero");
        this.setBaseDamage(level * 3);
    }
    
    
}
