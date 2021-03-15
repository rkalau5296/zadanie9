package zad9.zad9.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import zad9.zad9.model.User;
import zad9.zad9.service.csv.CsvService;
import zad9.zad9.service.user.UserService;
import java.util.List;

@Component
public class Start {

    private final CsvService csvService;
    private final UserService userService;

    @Autowired
    public Start(CsvService csvService, UserService userService) {
        this.csvService = csvService;
        this.userService = userService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void userInit() {
        List<User> users = csvService.readCsv();
        userService.saveAll(users);
        userService.findAll();
    }
}
