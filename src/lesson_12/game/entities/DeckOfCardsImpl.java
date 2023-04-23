package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.DeckOfCards;

import java.util.concurrent.ThreadLocalRandom;

public class DeckOfCardsImpl implements DeckOfCards {
    CardBJ[] cardBJS = new CardBJ[52];

    public DeckOfCardsImpl() {
        cardBJS[0] = new CardBJImpl("Двойка Треф", 2);
        cardBJS[1] = new CardBJImpl("Двойка Черви", 2);
        cardBJS[2] = new CardBJImpl("Двойка Бубны", 2);
        cardBJS[3] = new CardBJImpl("Двойка Пики",2);

        cardBJS[4] = new CardBJImpl("Тройка Треф", 3);
        cardBJS[5] = new CardBJImpl("Тройка Треф", 3);
        cardBJS[6] = new CardBJImpl("Тройка Треф", 3);
        cardBJS[7] = new CardBJImpl("Тройка Треф", 3);

        cardBJS[8] = new CardBJImpl("Четвёрка Треф", 4);
        cardBJS[9] = new CardBJImpl("Четвёрка Черви", 4);
        cardBJS[10] = new CardBJImpl("Четвёрка Бубны", 4);
        cardBJS[11] = new CardBJImpl("Четвёрка Пики", 4);

        cardBJS[12] = new CardBJImpl("Пятерка Треф", 5);
        cardBJS[13] = new CardBJImpl("Пятерка Черви", 5);
        cardBJS[14] = new CardBJImpl("Пятерка Бубны", 5);
        cardBJS[15] = new CardBJImpl("Пятерка Пики", 5);

        cardBJS[16] = new CardBJImpl("Шестёрка Треф", 6);
        cardBJS[17] = new CardBJImpl("Шестёрка Черви", 6);
        cardBJS[18] = new CardBJImpl("Шестёрка Бубны", 6);
        cardBJS[19] = new CardBJImpl("Шестёрка Пики", 6);

        cardBJS[20] = new CardBJImpl("Семёрка Треф", 7);
        cardBJS[21] = new CardBJImpl("Семёрка Черви", 7);
        cardBJS[22] = new CardBJImpl("Семёрка Бубны", 7);
        cardBJS[23] = new CardBJImpl("Семёрка Пики", 7);

        cardBJS[24] = new CardBJImpl("Восьмёрка Треф", 8);
        cardBJS[25] = new CardBJImpl("Восьмёрка Черви", 8);
        cardBJS[26] = new CardBJImpl("Восьмёрка Бубны", 8);
        cardBJS[27] = new CardBJImpl("Восьмёрка Пики", 8);

        cardBJS[28] = new CardBJImpl("Девятка Треф", 9);
        cardBJS[29] = new CardBJImpl("Девятка Черви", 9);
        cardBJS[30] = new CardBJImpl("Девятка Бубны", 9);
        cardBJS[31] = new CardBJImpl("Девятка Пики", 9);

        cardBJS[32] = new CardBJImpl("Валет Треф", 10);
        cardBJS[33] = new CardBJImpl("Валет Черви", 10);
        cardBJS[34] = new CardBJImpl("Валет Бубны", 10);
        cardBJS[35] = new CardBJImpl("Валет Пики", 10);

        cardBJS[36] = new CardBJImpl("Дама Треф", 10);
        cardBJS[37] = new CardBJImpl("Дама Черви", 10);
        cardBJS[38] = new CardBJImpl("Дама Бубны", 10);
        cardBJS[39] = new CardBJImpl("Дама Пики", 10);

        cardBJS[40] = new CardBJImpl("Король Треф", 10);
        cardBJS[41] = new CardBJImpl("Король Черви", 10);
        cardBJS[42] = new CardBJImpl("Король Бубны", 10);
        cardBJS[43] = new CardBJImpl("Король Пики", 10);

        cardBJS[44] = new CardBJImpl("Туз Треф", 11);
        cardBJS[45] = new CardBJImpl("Туз Черви", 11);
        cardBJS[46] = new CardBJImpl("Туз Бубны", 11);
        cardBJS[47] = new CardBJImpl("Туз Пики", 11);

        cardBJS[48] = new CardBJImpl("Треф", 11);
        cardBJS[49] = new CardBJImpl("Черви", 11);
        cardBJS[50] = new CardBJImpl("Бубны", 11);
        cardBJS[51] = new CardBJImpl("Пики", 11);
    }

    @Override
    public CardBJ getRandomCard() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, 51);
        return cardBJS[randomIndex];
    }
}
