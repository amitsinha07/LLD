package news_agency;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
