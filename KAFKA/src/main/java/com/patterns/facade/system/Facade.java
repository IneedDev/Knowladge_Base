package com.patterns.facade.system;

public class Facade implements SystemFacadeInterface{

    private java.lang.System system;
    private Device device;
    private Login login;

    public Facade() {
        this.system = system;
        this.device = device;
        this.login = login;
    }

    public void loginUser() {
        login.loginUser();
    }

    public void connectToDevice() {
        device.connectToDevice();
    }

    public void sendRequestToDevice() {
        device.connectToDevice();
    }

    public void confirmUserInSystem() {

    }
}
