class GamesNameRev{
    public static void main(String[] args)
	{
	  System.out.println("Start main in GamesNameRev");
	  
	  String game1="Subway Surf";
	  String game2="Candy Crush";
	  String game3="Ludo";
	  String game4="Temple Run";
	  String game5="Word Connect";
	  String game6="Bubble Shot";
	  String game7="Hill Climbing";
	  String game8="Phasmo Phobia";
	  String game9="Amongus";
	  String game10="Pubg"; 
	  
	  String[] games={game1,game2,game3,game4,game5,game6,game7,game8,game9,game10};
	  
	  int total=games.length;
	  System.out.println("total no of games: "+total);
	  
	  for(int gName=9;gName>=0;gName--)
		{
			String game=games[gName];
			System.out.println("Games name: "+game);
			
		}
		
		System.out.println("End main in GamesNameRev");
	  
	}
	
	
}
//4. Store 10 game names and print reference
