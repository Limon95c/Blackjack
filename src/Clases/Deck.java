/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.List;
import java.util.Random;

/**
 *
 * @author Jorge
 */
public class Deck {
    
    List<Card> cards;
    
    public Deck() {
        shuffle();
    }
    
    public final void shuffle() {
        cards.clear();
        for(int i = 0; i < 4; i++) {
            for(int j = 2; j <= 10; j++) {
                cards.add(new Card(Integer.toString(j)));
            }
        }
        for(int i = 0; i < 4; i++) {
            cards.add(new Card("A"));
        }
        for(int i = 0; i < 4; i++) {
            cards.add(new Card("J"));
        }
        for(int i = 0; i < 4; i++) {
            cards.add(new Card("Q"));
        }
        for(int i = 0; i < 4; i++) {
            cards.add(new Card("K"));
        }
    }
    
    public Card withdraw() {
        Random rand = new Random();
        int position = rand.nextInt(cards.size());
        Card temp = cards.get(position);
        return cards.remove(position);
    }
}
