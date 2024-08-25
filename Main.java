import Event.Fight;
import Model.Hero;
import Model.SkeletonWarriorTierOne;

public class Main{
    public static void main(String[] args){
        Fight fight = new Fight("Simple Fight");
        fight.showEnemiesStats();
        fight.showUserAction();
    }
    
}

