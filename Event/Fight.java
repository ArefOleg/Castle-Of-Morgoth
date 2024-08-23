package Event;

import java.util.ArrayList;

import Model.*;

public class Fight extends AbstractEvent {

    private ArrayList<AbstractEntity> listOfEnemies; 
    

    public Fight(String name) {
        super(name);
        setListOfEnemies();
        
    }

    public void initiateEnemies(){
        System.out.println(" " + listOfEnemies.get(0).getName()
        + " " + listOfEnemies.get(0).getHp()+"hp");
    }

    public ArrayList<AbstractEntity> getListOfEnemies() {
        return listOfEnemies;
    }

    public void setListOfEnemies() {
        ArrayList<AbstractEntity> listOfEnemies = new ArrayList<AbstractEntity>();
        listOfEnemies.add(new SkeletonWarriorTierOne("Skeletor", 2, 5, 1));
        this.listOfEnemies = listOfEnemies;
    }
}
