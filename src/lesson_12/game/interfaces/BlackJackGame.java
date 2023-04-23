package lesson_12.game.interfaces;

public interface BlackJackGame {
    // Добавить игрока в игру
    void addPlayerInGame(Player player);

    // Выдать всем нам по две карты
    void giveTwoCardsToEachPlayer();

    // Выдать по одной карте, если нужна
    void giveCardIfNeedToPlayer();

    // Определить победителя
    void printWinner();
}
