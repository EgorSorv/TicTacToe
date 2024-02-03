package Project;

import javax.swing.*;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 230;
    private static final int WINDOW_WIDTH = 350;

    # Кнопка для начала игры
    JButton btnStart = new JButton("Start new game");

    # Создание экрана с настройками
    SettingsWindow(GameWindow gameWindow) {
        setLocationRelativeTo(gameWindow);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        btnStart.addActionListener(e -> {
            gameWindow.startNewGame(0, 3, 3, 3);
            setVisible(false);
        });

        add(btnStart);
    }
}
