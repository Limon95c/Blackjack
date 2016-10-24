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
public class Dealer extends Player{

    private Deck deck;
    
    public Dealer() {
        super("Dealer");
    }
    
    public void givePlayerACard(Player player) {
        player.hand.addCard(deck.withdraw());
    }
    
    public void showPartialGame() {
        System.out.println(super.getName());
        if(!super.hand.cards.isEmpty()) {
            System.out.println(super.hand.cards.get(0).getFace());
        }
    }
}
