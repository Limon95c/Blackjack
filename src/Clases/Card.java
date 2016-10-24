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
public class Card {
    private String face;
    private int value;
    
    public Card(String face) {
        this.face = face;
        switch(face) {
            case "2":
            case "3":
            case "4":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                value = Integer.parseInt(face);
                break;
            case "J":
            case "Q":
            case "K":
                value = 10;
                break;
            case "A":
                value = 1;
                break;
            default:
                    value = -1;
        } 
    }

    public String getFace() {
        return face;
    }

    public int getValue() {
        return value;
    }
}
