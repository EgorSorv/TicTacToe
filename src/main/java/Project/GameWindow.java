package Project;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    # Расположение и размер окна
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;

    # Кнопки для выхода и запуска игры
    JButton btnStart = new JButton("New Game");
    JButton btnExit = new JButton("Exit");

    # Данный класс задает игровое поле
    Map map;
    # Экран с настройками игры
    SettingsWindow settings;

    GameWindow() {
        # Создание окна
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("TicTacToe");
        setResizable(false);

        map = new Map();
        settings = new SettingsWindow(this);

        btnExit.addActionListener(e -> System.exit(0));

        btnStart.addActionListener(e -> settings.setVisible(true));

        # Расположение кнопок
        JPanel panBottom = new JPanel(new GridLayout(1, 2));
        panBottom.add(btnStart);
        panBottom.add(btnExit);
        add(panBottom, BorderLayout.SOUTH);
        add(map);
        setVisible(true);
    }

    # Запуск игры
    void startNewGame(int mode, int fSzX, int fSzY, int wLen) {
        map.startNewGame(mode, fSzX, fSzY, wLen);
    }
}
