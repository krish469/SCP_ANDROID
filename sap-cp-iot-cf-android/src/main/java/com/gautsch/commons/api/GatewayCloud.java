package com.gautsch.commons.api;

import com.gautsch.commons.model.gateway.Measure;

import java.io.IOException;

/**
 * An abstraction over Cloud Gateways.
 */
public interface GatewayCloud {

	public void connect(String host)
	throws IOException;

	public void disconnect();

	public void sendMeasure(Measure measure)
	throws IOException;

	public void listenCommands()
	throws IOException;

}
