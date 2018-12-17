package com.bitctrl.com.bitctrl.bccms.json.dummy.impl;

import static com.bitctrl.com.bitctrl.bccms.json.dummy.App.getPlayerSystemList;

import com.bitctrl.bccms.json.api.PlayerSystem;
import com.bitctrl.bccms.json.api.Playersystems;

public class PlayersystemsService implements Playersystems {


	@Override
	public GetPlayersystemsByIdResponse getPlayersystemsById(String id) {
		PlayerSystem result = getPlayerSystemList().stream().filter(c -> c.getId().equals(Long.valueOf(id))).findFirst()
				.orElse(null);
		return GetPlayersystemsByIdResponse.respond200WithApplicationJson(result);
	}

	@Override
	public GetPlayersystemsResponse getPlayersystems(int offset, int limit) {
		//TODO: offset & limit filtern
		return GetPlayersystemsResponse.respond200WithApplicationJson(getPlayerSystemList());
	}

}
