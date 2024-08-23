import Event.Fight;
import Model.Hero;
import Model.SkeletonWarriorTierOne;

public class Main{
    public static void main(String[] args){
        Hero hero = new Hero(1);
        Fight fight = new Fight("Simple Fight");
        fight.initiateEnemies();
    }
    
}

