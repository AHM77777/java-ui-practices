package bookTests.helloWorld.controller;

import bookTests.helloWorld.model.IModel;

public abstract class Controller implements IController {
    private IModel model;

    @Override
    public IModel getModel() { return this.model; }

    @Override
    public void setModel(IModel model) { this.model = model; }
}
