/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package highercard;

/**
 *
 * @author aotsn
 */

public class Player {
    private String name;
    private Card card;

    public Player(String name) {
        this.name = name;
        this.card = null;
    }

    public String getName() {
        return name;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void playCard() {
        System.out.println(name + " plays: " + card);
    }
}

