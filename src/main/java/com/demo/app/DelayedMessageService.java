package com.demo.app;

import org.springframework.context.event.EventListener;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.stereotype.Service;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class DelayedMessageService {

    @EventListener(ApplicationReadyEvent.class)
    public void scheduleDelayedMessage() {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.schedule(() -> {
            System.out.println("Why so serious? ⠀⠀⠀\n" +
                    "   ⣿⣿⣷⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⢀⣿⣿⣿⣿⣿⣿⣆⡀⠀⠀⠀⠀⣠⣴⣦⡄⢤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣷⣷⣶⣶⣿⣿⣿⣿⡀⣽⡿⣶⣦⡀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡿⣿⣿⣿⣿⣆⠀⠀⠀⠀\n" +
                    "⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣦⠀⠀⠀\n" +
                    "⠀⠀⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣟⣿⣿⣿⣿⣿⡿⢟⣿⣷⡀⠀\n" +
                    "⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣭⣿⣿⣽⣿⣽⣾⣿⣿⣿⠛⠉⠉⠀⢈⣿⣿⡇⠀\n" +
                    "⠀⠀⠀⢻⣿⣿⠛⠉⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠡⠤⠄⠁⠀⠀⢻⣿⡇⠀\n" +
                    "⠀⠀⠀⠘⣿⣿⠄⠀⠀⠀⠀⠀⣉⠙⠋⢿⣿⣯⠀⠀⠀⠀⠀⠀⣰⣿⣿⡿⡃⠀\n" +
                    "⠀⠀⠀⠀⢹⣿⣇⣀⠀⠈⠉⠉⠁⠀⣤⢠⣿⣿⣧⡆⣤⣤⡀⣾⣿⣿⣿⢠⡇⠀\n" +
                    "⠀⠀⠀⠀⠀⣿⣿⣿⣷⣤⠄⣀⣴⣧⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⠇⠀\n" +
                    "⠀⠀⠀⠀⠀⠸⣿⣯⠉⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⡯⠁⡌⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠙⢿⡄⢿⣿⣿⣿⣿⣿⣎⠙⠻⠛⣁⣼⣿⣿⡿⠛⠁⡸⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠈⢿⡄⠉⣿⡿⣿⣿⣿⣿⣷⣬⣿⡿⠟⠋⢀⣴⡞⠁⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⠀⠀⠀⠀⠉⠉⠋⠉⠉⠁⠀⢀⣴⣿⡿⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⣿⣿⣿⣿⣿⠿⢃⣴⣿⣿⣿⠃⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀");
        }, 5, TimeUnit.SECONDS);
    }
}
