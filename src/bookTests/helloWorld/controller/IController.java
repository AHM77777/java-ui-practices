package bookTests.helloWorld.controller;

import bookTests.helloWorld.model.IModel;

public interface IController {
    public IModel getModel();
    public void setModel(IModel model);
}
