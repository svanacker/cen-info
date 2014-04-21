package org.cen.cup.cup2012.device.arm2012.com;

import org.cen.com.documentation.DeviceDataSignature;
import org.cen.com.documentation.DeviceMethodSignature;
import org.cen.com.documentation.DeviceMethodType;
import org.cen.com.documentation.DeviceParameter;
import org.cen.com.documentation.DeviceParameterType;
import org.cen.cup.cup2012.device.arm2012.Arm2012Device;
import org.cen.cup.cup2012.device.arm2012.ArmType2012;

@DeviceDataSignature(deviceName = Arm2012Device.NAME, methods = { @DeviceMethodSignature(
		header = Arm2012DownOutData.HEADER,
		type = DeviceMethodType.INPUT,
		parameters = { @DeviceParameter(name = "index", length = 2, type = DeviceParameterType.SIGNED, unit = ""), }) })
public class Arm2012DownOutData extends Arm2012OutData {

	public static final String HEADER = "J";

	@Override
	public String getHeader() {
		return HEADER;
	}

	public Arm2012DownOutData(ArmType2012 type) {
		super(type);
	}
}
