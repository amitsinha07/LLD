package news_agency;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer subscriber1 = new Subscriber("Alice");
        Observer subscriber2 = new Subscriber("Bob");

        agency.attach(subscriber1);
        agency.attach(subscriber2);

        agency.publishNews("Breaking News: Observer Pattern Explained!");
        
        agency.detach(subscriber1);
        
        agency.publishNews("Update: Alice has unsubscribed.");
    }
}

