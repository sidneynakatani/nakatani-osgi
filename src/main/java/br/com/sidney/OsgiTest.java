package br.com.sidney;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class OsgiTest implements BundleActivator {

	@Override
	public void start(BundleContext arg0) throws Exception {
		System.out.println("Start");
		
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		System.out.println("Stop");
		
	}

}
