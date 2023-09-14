package it.ss.demo004.card;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    public List<Card> getCards() {
        return List.of(
                new Card(
                        1L,
                        "P",
                        "A",
                        11
                )
        );
    }
}
