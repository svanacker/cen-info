package org.cen.simulRobot.device.beacon.com;

import java.util.HashSet;
import java.util.Set;

import org.cen.com.IllegalComDataException;
import org.cen.com.InDataDecoder;
import org.cen.com.in.InData;

/**
 * Class which is responsible of decoding data from the configuration which come
 * from the server
 */
public class BeaconSimulDataDecoder implements InDataDecoder {
	private static Set<String> handled = new HashSet<String>();

	static {
	}

	private void checkLength(String data, int l) throws IllegalComDataException {
		if (data.length() != l)
			throw new IllegalComDataException();
	}

	@Override
	public InData decode(String data) throws IllegalComDataException {
		checkLength(data, 1);
		return new BeaconSimulReadInData();
	}

	@Override
	public int getDataLength(String header) {
		if (header.equals(BeaconSimulReadInData.HEADER)) {
			return 0;
		}
		return 0;
	}

	@Override
	public Set<String> getHandledHeaders() {
		return handled;
	}
}
