package com.se.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.se.api.Player;

@Repository
public class PlayerDAOImpl implements PlayerDAO{

	private List<Player> playerslist;
	
	@PostConstruct
	public void setupPlayersList()
	{
		playerslist= new ArrayList<>();
		System.out.println("Setting up player list");
		Player player1= new Player();
		player1.setId(1);
		player1.setName("sachin T");
		player1.setType("Batsman");
		
		Player player2= new Player();
		player2.setId(2);
		player2.setName("Virat K");
		player2.setType("Batsman");
		
		Player player3= new Player();
		player3.setId(3);
		player3.setName("Rahul D");
		player3.setType("Batsman");
		playerslist.add(player1);
		playerslist.add(player2);
		playerslist.add(player3);
	}
	
	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerslist;
	}

	@Override
	public Player getPlayer(int id) {
		// TODO Auto-generated method stub
		Player player= playerslist.get(--id);
		return player;
	}

	@Override
	public Player addPlayer(Player player) {
		// TODO Auto-generated method stub
		playerslist.add(player);
		player.setId(playerslist.size());
		return player;
	}

	@Override
	public Player updatePlayer(int id, Player player) {
		// TODO Auto-generated method stub
		Player player1= playerslist.get(--id);
		player1.setName(player.getName());
		player1.setType(player.getType());
		
		return player1;
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
//		for(Player player:playerslist)
//		{
//			if((id-1)==player.getId())
//			{
				playerslist.remove(--id);
//			}
//			player.setId(playerslist.size());
//		}
		
		
	}

}
