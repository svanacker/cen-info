package org.cen.robot.graphics;

import org.cen.com.ComDebugListener;
import org.cen.com.in.RawInData;

public class RawInDataComponent extends DataComponent implements
		ComDebugListener {

	private static final long serialVersionUID = 1L;

	public RawInDataComponent() {
		super("Raw data");
	}

	public void onRawInData(RawInData data) {
		textArea.setText(textArea.getText() + data.getRawData());
	}
}
