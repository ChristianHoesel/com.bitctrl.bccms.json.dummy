package com.bitctrl.com.bitctrl.bccms.json.dummy.impl;

import static com.bitctrl.com.bitctrl.bccms.json.dummy.App.addServicePoint;
import static com.bitctrl.com.bitctrl.bccms.json.dummy.App.deleteServicePoint;
import static com.bitctrl.com.bitctrl.bccms.json.dummy.App.getServicePointList;

import java.util.Date;
import java.util.Optional;

import com.bitctrl.bccms.json.api.ServicePoint;
import com.bitctrl.bccms.json.api.Servicepoints;

public class ServicePointService implements Servicepoints {

	@Override
	public PostServicepointsResponse postServicepoints(ServicePoint entity) {
		
		ServicePoint result = addServicePoint(entity);
		//TODO die anderen Fälle noch implementieren
		return PostServicepointsResponse.respond201WithApplicationJson(result);
	}

	@Override
	public DeleteServicepointsByIdResponse deleteServicepointsById(String id) {

		Optional<ServicePoint> optional = getServicePointList().stream().filter(s -> s.getId().equals(Long.valueOf(id)))
				.findFirst();
		if (optional.isPresent()) {
			deleteServicePoint(optional.get());
			return DeleteServicepointsByIdResponse.respond204();
		}
		return DeleteServicepointsByIdResponse.respond403();

	}

	@Override
	public GetServicepointsByIdResponse getServicepointsById(String id) {
		ServicePoint result = getServicePointList().stream().filter(s -> s.getId().equals(Long.valueOf(id))).findFirst()
				.orElseGet(null);
		return GetServicepointsByIdResponse.respond200WithApplicationJson(result);
	}

	@Override
	public GetServicepointsResponse getServicepoints(int offset, int limit) {
		//TODO: offset & limit implementieren
		return GetServicepointsResponse.respond200WithApplicationJson(getServicePointList());
	}

	@Override
	public GetServicepointsFilterResponse getServicepointsFilter(Date fromDate, Date toDate, int offset, int limit) {
		//TODO: offset, limit & Datumfilter implementieren
		return GetServicepointsFilterResponse.respond200WithApplicationJson(getServicePointList());

	}

}
