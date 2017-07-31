package bookTests.helloWorld.model;

public class HelloModel implements bookTests.helloWorld.model.IModel {
    private String greeting = "";

    public HelloModel() {
        setGreeting("Hello World!");
    }

    public String getGreeting() { return greeting; }

    public void setGreeting(String greet) {
        greeting = greet;
    }
}
