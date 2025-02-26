package Exploration_game;

import Exploration_game.Exploration_game.Direction;
import java.awt.*;
import java.util.ArrayList;

public abstract class Actor {
    protected int x, y, hp, maxHP, speed;
    private Color color;
    protected Direction lastDirection;



    public Actor(int x, int y, int maxHP, int speed, Color color){
        this.x = x;
        this.y = y;
        this.hp = maxHP;
        this.maxHP = maxHP;
        this.speed = speed;
        this.color = color;
        this.lastDirection = Direction.UP;
    }



    public void move(Direction moveDir){
        // move direction indicated by speed
    }
    public void changeHP(int change){
        // add change to HP, and then make sure it's between 0 - max;
    }
    public abstract void attack(ArrayList<Actor> enemies);
    public abstract Rectangle getAttackArea();
    public abstract boolean isAttacking();
}
