package com.demo.app;

import org.springframework.stereotype.Service;
import org.springframework.scheduling.annotation.Scheduled;
import javax.annotation.PostConstruct;
import java.nio.file.*;
import java.io.IOException;
import java.util.List;

@Service
public class FileUpdaterService {

    private int counter = 0;
    private final Path filePath = Paths.get("counter.txt");

    @PostConstruct
    public void initCounterFromFile() {
        if (Files.exists(filePath)) {
            try {
                List<String> lines = Files.readAllLines(filePath);
                if (!lines.isEmpty()) {
                    String lastLine = lines.get(lines.size() - 1);
                    int index = lastLine.lastIndexOf(" ");
                    if (index != -1) {
                        String possibleNumber = lastLine.substring(index).trim();
                        counter = Integer.parseInt(possibleNumber);
                        System.out.println("Counter initialized to " + counter + " from file.");
                    }
                    if (!lastLine.isEmpty()) {
                        Files.writeString(filePath, System.lineSeparator(), StandardOpenOption.APPEND);
                    }
                }
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }


    @Scheduled(fixedRate = 10000)
    public void updateFileEveryTenSeconds() {
        counter ++;
        try {
            Files.writeString(
                    filePath,
                    counter + " Mississippi" + System.lineSeparator(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
            System.out.println("Mississippi updated to " + counter + " and appended to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}