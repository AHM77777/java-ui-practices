package bookTests.helloWorld.view;

import bookTests.helloWorld.controller.IController;

public interface IView {
    public IController getController();
    public void setController(IController controller);
}
