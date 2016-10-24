/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jorge
 */
public class Player {
    private String name;
    protected Hand hand;

    public Player() {
        name = "";
        hand = new Hand();
    }
    
    public Player(String name) {
        this.name = name;
        hand = new Hand();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void showGame() {
        System.out.println(name);
        if(!hand.cards.isEmpty()) {
            System.out.println(hand.cards.get(0).getFace());
        }
    }
}
