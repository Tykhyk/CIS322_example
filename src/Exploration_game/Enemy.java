package Exploration_game;

import java.awt.*;
import java.util.ArrayList;
import static Exploration_game.Exploration_game.TILE_SIZE;

public class Enemy extends Actor{
    protected boolean visible;
    protected int attackDamage;
    public Enemy(int x, int y){
        super(x, y, 50, 2, new Color(255, 0, 0));
        this.visible = true;
        this.attackDamage = 5;
    }



    public void setVisible(boolean visible){
        this.visible = visible;
    }
    public boolean getVisible(){
        return this.visible;
    }
    Rectangle getBound(){
        return new Rectangle(x, y, TILE_SIZE, TILE_SIZE);
    }
    public void move(Actor activeUnit){

    }



    @Override
    public void attack(ArrayList<Actor> enemies) {

    }
    @Override
    public Rectangle getAttackArea() {
        return null;
    }
    @Override
    public boolean isAttacking() {
        return false;
    }
}
