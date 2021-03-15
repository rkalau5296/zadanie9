package zad9.zad9.service.csv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Service;
import zad9.zad9.model.User;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

@Service
public class CsvServiceImpl implements CsvService{

    private static final String CSV_PATH = "./src/main/resources/static/MOCK_DATA.csv";

    @Override
    public List<User> readCsv()  {

        try {
                Reader reader = Files.newBufferedReader(Path.of(CSV_PATH));
                CsvToBean<User> csvToBean = new CsvToBeanBuilder<User>(reader)
                    .withType(User.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
                List<User> users = csvToBean.parse();
                reader.close();
                return users;
            } catch (IOException e) {
                e.printStackTrace();
            }
                return Collections.emptyList();
    }

}
