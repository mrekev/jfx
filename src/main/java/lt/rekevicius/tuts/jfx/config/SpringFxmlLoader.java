package lt.rekevicius.tuts.jfx.config;

import javafx.fxml.FXMLLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by Mindaugas on 2016.11.03.
 */
public class SpringFxmlLoader {

    private static final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringApplicationConfig.class);

    public Object load(String url) {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(clazz -> applicationContext.getBean(clazz));
        loader.setLocation(getClass().getClassLoader().getResource(url));
        try {
            return loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
