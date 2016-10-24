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
public class Blackjack_Game {
    
    private Dealer dealer;
    private Player player;
    
    public Blackjack_Game() {
        dealer = new Dealer();
        player = new Player();
    }
    
    public Blackjack_Game(String playerName) {
        dealer = new Dealer();
        player = new Player("playerName");
    }
}
