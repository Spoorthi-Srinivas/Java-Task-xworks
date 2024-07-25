class SongList{
	public static void main(String[] args)
	{
		System.out.println("Start main in SongList");
		
		String song1="Bisilu Kudureyondu";
		String song2="Kane agiruve nanu";
		String song3="Galiya";
		String song4="Ram Sita Ram";
		String song5="Pookal Pookum";
		String song6="Nenagaage";
		String song7="Naguva Nayana";
		String song8="Kaanunna Kalyanam";
		String song9="Oh Prema";
		String song10="llle llle Ello";
		String song11="Eradu Jadeyannu";
		String song12="Hombale Hombale";
		String song13="Sita Kalyanam";
		String song14="Gatiya Ilidu";
		String song15="Ninyaarele";
		String song16="Kavithe Kavithe";
		String song17="Eradu Jedeyannu";
		String song18="Yenendhu Hessaridalli";
		String song19="Mouna thalithe dhari";
		String song20="Neenu Iruvaaga";
		
		String[] songs={song1,song2,song3,song4,song5,song6,song7,song8,song9,song10,song11,song12,song13,song14,song15,song16,song17,song18,song19,song20};
		
		int total=songs.length;
		System.out.println("Total number of songs: "+total);
		
		for(int sngName=0;sngName<20;sngName++)
		{
			String song=songs[sngName];
			System.out.println("Song names: "+song);
			
		}
		
		System.out.println("End main in SongList");
	}
}

//2. Store 10 song names and print reference
