package blackjack.entity;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by betterFLY on 2018. 5. 9.
 * Github : http://github.com/betterfly88
 */


/*
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLUB("♣");
 */

public class CardTest {
    String type;
    int num;

    Card card;

    @Before
    public void setUp(){
        card = new Card();
//        card = new Card(CardShapeEntity.SPADE, CardNumberEntity.ACE);
//        card = new Card(CardShapeEntity.DIAMOND, CardNumberEntity.THREE);
    }

    @Test
    public void getCardNum(){
//        Card heartCard = new Card(CardShapeEntity.HEART, CardNumberEntity.TWO);
        System.out.println(card.getCardDeckList());
        for(Card tempCard : card.getCardDeckList()){
            System.out.println(tempCard);
        }
    }

    public int isAce(String selectAce){
        int aceNum = selectAce == "" ? 1 : 10;

        return aceNum;
    }

    @Test
    public void 카드덱_생성(){
        card.setCardDeckList();
        Assertions.assertThat(card.getCardDeckList().size()).isEqualTo(52);
        System.out.println(card.getCardNum());
        System.out.println(card.getCardNum());
        System.out.println(card.getCardNum());
        System.out.println(card.getCardNum());
        System.out.println(card.getCardNum());
        System.out.println(card.getCardNum());
        System.out.println(card.getCardNum());
        System.out.println(card.getCardNum());
    }

    @Test
    public void 카드_(){

    }
}