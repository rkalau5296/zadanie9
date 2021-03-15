package zad9.zad9.service.csv;


import zad9.zad9.model.User;

import java.io.IOException;
import java.util.List;

public interface CsvService {

    List<User> readCsv();

}
