package org.cen.cup.cup2012.ui.web;

import org.cen.cup.cup2012.device.arm2012.ArmDownRequest2012;
import org.cen.cup.cup2012.device.arm2012.ArmType2012;
import org.cen.cup.cup2012.device.arm2012.ArmUpRequest2012;
import org.cen.robot.IRobotService;
import org.cen.robot.IRobotServiceProvider;
import org.cen.robot.device.DeviceRequestDispatcher;
import org.cen.robot.device.IRobotDevicesHandler;
import org.cen.robot.device.RobotDeviceRequest;

/**
 * Backing bean for that actions view.
 */
public class Actions2012View implements IRobotService {

	private IRobotServiceProvider servicesProvider;

	private DeviceRequestDispatcher getDispatcher() {
		IRobotDevicesHandler handler = servicesProvider.getService(IRobotDevicesHandler.class);
		return handler.getRequestDispatcher();
	}

	private void sendRequest(RobotDeviceRequest request) {
		getDispatcher().sendRequest(request);
	}

	public void leftArmUp() {
		sendRequest(new ArmUpRequest2012(ArmType2012.LEFT));
	}

	public void leftArmDown() {
		sendRequest(new ArmDownRequest2012(ArmType2012.LEFT));
	}

	public void rightArmUp() {
		sendRequest(new ArmUpRequest2012(ArmType2012.RIGHT));
	}

	public void rightArmDown() {
		sendRequest(new ArmDownRequest2012(ArmType2012.RIGHT));
	}

	@Override
	public void setServicesProvider(IRobotServiceProvider provider) {
		servicesProvider = provider;
	}
}
