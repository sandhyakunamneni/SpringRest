package com.se.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.se.api.Player;

@Repository
public interface PlayerDAO {
	
	List<Player> getAllPlayers();

	Player getPlayer(int id);
	
	Player addPlayer(Player player);

	Player updatePlayer(int id, Player player);

	void deletePlayer(int id);

}
