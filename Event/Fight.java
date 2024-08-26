package Event;

import java.util.ArrayList;
import java.util.Scanner;

import Model.*;

public class Fight extends AbstractEvent {

    private ArrayList<AbstractEntity> listOfEnemies; 
    private Integer floor;

    public Fight(String name, Integer floor) {
        super(name);
        this.floor = floor;
        setListOfEnemies();
        
    }

    public Integer getFloor(){
        return this.floor;
    }

    public void showEnemiesStats(){
        System.out.println(" " + listOfEnemies.get(0).getName()
        + " " + listOfEnemies.get(0).getHp()+"hp");
    }

    public ArrayList<AbstractEntity> getListOfEnemies() {
        return listOfEnemies;
    }

    public void setListOfEnemies() {
        switch(getFloor()){
            case 1:
                Integer enemyCount = 1 + (int) (Math.random() * 2);
                for(int i=0; i <= enemyCount; i++){
                    
                }
                System.out.println("enemyCount: " + enemyCount);
                break;
            default:
        }
            

        ArrayList<AbstractEntity> listOfEnemies = new ArrayList<AbstractEntity>();
        listOfEnemies.add(new SkeletonWarriorTierOne("Skeletor", 2, 5, 1));
        this.listOfEnemies = listOfEnemies;
    }

    public void showUserAction(){
        System.out.println("Choose your action ");
        System.out.println("1. Attack");
        System.out.println("2. Run");
        Scanner userChoise = new Scanner(System.in);
        int numberChoise = userChoise.nextInt();
        switch(numberChoise){
            case 1:
                
                break;
            default:
                
        }
    }

}
