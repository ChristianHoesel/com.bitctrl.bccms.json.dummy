package com.bitctrl.com.bitctrl.bccms.json.dummy;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.UriBuilder;

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.bitctrl.bccms.json.api.Computer;
import com.bitctrl.bccms.json.api.ComputerImpl;
import com.bitctrl.bccms.json.api.PlayerSystem;
import com.bitctrl.bccms.json.api.PlayerSystemImpl;
import com.bitctrl.bccms.json.api.ServicePoint;
import com.bitctrl.bccms.json.api.ServicePointImpl;
import com.bitctrl.com.bitctrl.bccms.json.dummy.impl.ComputerService;
import com.bitctrl.com.bitctrl.bccms.json.dummy.impl.PlayersystemsService;
import com.bitctrl.com.bitctrl.bccms.json.dummy.impl.PlayersystemtypsService;
import com.bitctrl.com.bitctrl.bccms.json.dummy.impl.ServicePointService;

import edu.emory.mathcs.backport.java.util.Collections;
import edu.emory.mathcs.backport.java.util.concurrent.atomic.AtomicLong;

public class App {

	private static AtomicLong lastId = new AtomicLong(1);

	private static List<Computer> computerList = new ArrayList<>();

	private static List<PlayerSystem> playerSystemList = new ArrayList<>();
	private static List<ServicePoint> servicePointList = new ArrayList<>();

	public static List<Computer> getComputerList() {
		return Collections.unmodifiableList(computerList);
	}

	public static List<PlayerSystem> getPlayerSystemList() {
		return Collections.unmodifiableList(playerSystemList);
	}

	public static List<ServicePoint> getServicePointList() {
		return Collections.unmodifiableList(servicePointList);
	}

	public static void main(String[] args) throws Exception {
		initialize();
		URI baseUri = UriBuilder.fromUri("http://localhost/").port(9998).build();
		ResourceConfig config = new ResourceConfig(ComputerService.class, PlayersystemsService.class,
				PlayersystemtypsService.class, ServicePointService.class);
		Server server = JettyHttpContainerFactory.createServer(baseUri, config);
		server.start();
	}

	private static void initialize() {
		for (int i = 0; i < 100; i++) {
			computerList.add(createComputer("Computer " + i));
			playerSystemList.add(createPlayersystem("Fahrzeug " + i));
			servicePointList.add(createServicePoint());
		}
	}

	private static ServicePoint createServicePoint() {
		ServicePoint result = new ServicePointImpl();
		result.setId(lastId.getAndIncrement());
		result.setServicetime(new Date());
		PlayerSystem playerSystem = playerSystemList
				.get((int) Math.round(Math.random() * (playerSystemList.size() - 1)));
		if (playerSystem != null) {
			result.setPlayersystem(playerSystem.getId());
		}

		Computer computer = computerList.get((int) Math.round(Math.random() * (computerList.size() - 1)));
		if (computer != null) {
			result.setComputer(computer.getId());
		}

		// ...

		return result;
	}

	private static PlayerSystem createPlayersystem(String name) {
		PlayerSystem result = new PlayerSystemImpl();
		result.setId(lastId.getAndIncrement());
		result.setPlayerstystemGroup("Gruppe 1");
		result.setEnable(true);
		result.setName(name);

		// ...

		return result;
	}

	private static Computer createComputer(String hostname) {
		Computer result = new ComputerImpl();
		result.setId(lastId.incrementAndGet());
		result.setHostname(hostname);

		// ....
		return result;
	}

	public static ServicePoint addServicePoint(final ServicePoint servicePoint) {
		servicePoint.setId(lastId.getAndIncrement());
		servicePointList.add(servicePoint);
		return servicePoint;
	}

	public static void deleteServicePoint(final ServicePoint servicePoint) {
		Optional<ServicePoint> optional = servicePointList.stream().filter(s -> s.getId().equals(servicePoint.getId()))
				.findFirst();
		if(optional.isPresent()) {
			servicePointList.remove(optional.get());
		}
	}
}
