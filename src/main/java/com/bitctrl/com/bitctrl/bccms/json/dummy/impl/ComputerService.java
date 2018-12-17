package com.bitctrl.com.bitctrl.bccms.json.dummy.impl;

import static com.bitctrl.com.bitctrl.bccms.json.dummy.App.getComputerList;

import com.bitctrl.bccms.json.api.Computer;
import com.bitctrl.bccms.json.api.Computers;

public class ComputerService implements Computers {

	@Override
	public GetComputersByIdResponse getComputersById(String id) {
		Computer result = getComputerList().stream().filter(c -> c.getId().equals(Long.valueOf(id))).findFirst()
				.orElse(null);
		return GetComputersByIdResponse.respond200WithApplicationJson(result);
	}

	@Override
	public GetComputersResponse getComputers(int offset, int limit) {
		//TODO offset & limit filtern
		return GetComputersResponse.respond200WithApplicationJson(getComputerList());
	}

}
