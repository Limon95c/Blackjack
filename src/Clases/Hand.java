/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.List;

/**
 *
 * @author Jorge
 */
public class Hand {
    protected List<Card> cards;
    
    public void addCard(Card card) {
        cards.add(card);
    }
}
