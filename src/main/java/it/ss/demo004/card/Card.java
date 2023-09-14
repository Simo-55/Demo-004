package it.ss.demo004.card;

public class Card {
    public Card(Long id, String suit, String number, Integer value) {
        this.id = id;
        this.suit = suit;
        this.number = number;
        this.value = value;
    }

    public Card(String suit, String number, Integer value) {
        this.suit = suit;
        this.number = number;
        this.value = value;
    }

    private Long id;
    private String suit;
    private String number;
    private Integer value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", suit='" + suit + '\'' +
                ", number='" + number + '\'' +
                ", value=" + value +
                '}';
    }
}
