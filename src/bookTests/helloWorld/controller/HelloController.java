package bookTests.helloWorld.controller;

import bookTests.helloWorld.model.HelloModel;
import bookTests.helloWorld.model.IModel;

public class HelloController extends Controller {
    public HelloController(IModel model) { this.setModel(model); }

    public final HelloModel castModel() { return (HelloModel) this.getModel(); }
}
