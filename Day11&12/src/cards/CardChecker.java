package cards;

import java.util.ArrayList;
import java.util.List;

import static cards.Card.Rank.*;
import static cards.Card.Suit.*;

public class CardChecker {
    public boolean duplicateCheck(Card card,List<Card> cardList) {

        final byte EXIST = 1;
        final byte NOT_EXIST = 2;

        byte cardCheck = NOT_EXIST;

        for (Card oldCard : cardList) {
            if (card.toString().equals(oldCard.toString())) {
                cardCheck = EXIST;
                break;
            }
        }
        if (cardCheck == EXIST)
            return true;
        else
            return false;
    }
}
