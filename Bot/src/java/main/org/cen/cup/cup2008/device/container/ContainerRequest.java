package org.cen.cup.cup2008.device.container;

import org.cen.robot.device.request.impl.RobotDeviceRequest;

public class ContainerRequest extends RobotDeviceRequest {

    public enum Action {
        CLOSE, MOVE, OPEN, UNDEPLOY, DEPLOY;
    }

    private final Action action;

    private final int data;

    public ContainerRequest(Action action) {
        this(action, 0);
    }

    public ContainerRequest(Action action, int data) {
        super(ContainerDevice.NAME);
        this.action = action;
        this.data = data;
    }

    public Action getAction() {
        return action;
    }

    public int getData() {
        return data;
    }
}
