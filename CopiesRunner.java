class CopiesRunner{
	public static void main(String[] values)
	{
		System.out.println("\nStart main in CopiesRunner");
		
		
		Wardrobe wardrobeRef =new Wardrobe();
	    wardrobeRef.dress="Saree";
		wardrobeRef.ornaments="Necklace";
		System.out.println("Dress :"+wardrobeRef.dress);
		System.out.println("ornaments :"+wardrobeRef.ornaments);
		System.out.println("=============================================");
		wardrobeRef.dress="SwaetShirt";
		wardrobeRef.ornaments="Braclet";
		System.out.println("Dress :"+wardrobeRef.dress);
		System.out.println("ornaments :"+wardrobeRef.ornaments);
		System.out.println("\n");
		
		
		Niraksha nirakshaRef =new Niraksha();
	    nirakshaRef.age=22;
		nirakshaRef.contact="9578468252";
		System.out.println("Age of Niraksha :"+nirakshaRef.age);
		System.out.println("Contact details of Niraksha :"+nirakshaRef.contact);
		System.out.println("=============================================");
		nirakshaRef.age=23;
		nirakshaRef.contact="8354216972";
		System.out.println("Age of Niraksha :"+nirakshaRef.age);
		System.out.println("Contact details of Niraksha :"+nirakshaRef.contact);
		System.out.println("\n");
		

		ATM atmRef =new ATM();
	    atmRef.bankName="Canara Bank";
		atmRef.branch="Vijayanagar";
		System.out.println("Bank Name :"+atmRef.bankName);
		System.out.println("Branch Name of the Bank :"+atmRef.branch);
		System.out.println("=============================================");
		atmRef.bankName="SBI Bank";
		atmRef.branch="Banashankari";
		System.out.println("Bank Name :"+atmRef.bankName);
		System.out.println("Branch Name of the Bank :"+atmRef.branch);
		System.out.println("\n");
		
		
		
		Coin coinRef =new Coin();
	    coinRef.rupees=10;
		coinRef.rsInWords="Ten Rupees";
		System.out.println("Rupees :"+coinRef.rupees);
		System.out.println("Rupees in words :"+coinRef.rsInWords);
		System.out.println("=============================================");
	    coinRef.rupees=20;
		coinRef.rsInWords="Twenty Rupees";
		System.out.println("Rupees :"+coinRef.rupees);
		System.out.println("Rupees in words :"+coinRef.rsInWords);
		System.out.println("\n");
		
		
		
		Furniture furnitureRef =new Furniture();
	    furnitureRef.shopName="Ikea";
		furnitureRef.price=38000;
		System.out.println("Furniture Shop Name :"+furnitureRef.shopName);
		System.out.println("Cost of Furniturein Rupees :"+furnitureRef.price);
		System.out.println("=============================================");
		furnitureRef.shopName="WoodLand";
		furnitureRef.price=35000;
		System.out.println("Furniture Shop Name :"+furnitureRef.shopName);
		System.out.println("Cost of Furniturein Rupees :"+furnitureRef.price);
		System.out.println("\n");
		
		
		
		Aeroplane aeroplaneRef =new Aeroplane();
	    aeroplaneRef.airportName="Kempegowda International Airport";
		aeroplaneRef.flightName="AirAsia India";
		System.out.println("Airport Name :"+aeroplaneRef.airportName);
		System.out.println("Flight Name :"+aeroplaneRef.flightName);
		System.out.println("=============================================");
		aeroplaneRef.airportName="Cochin International Airport";
		aeroplaneRef.flightName=" SpiceJet";
		System.out.println("Airport Name :"+aeroplaneRef.airportName);
		System.out.println("Flight Name :"+aeroplaneRef.flightName);
		System.out.println("\n");


		CCTV cctvRef =new CCTV();
	    cctvRef.companyName="BOSCH";
		cctvRef.cameraCost=20000;
		System.out.println("Camera Company Name :"+cctvRef.companyName);
		System.out.println("Camera Cost :"+cctvRef.cameraCost);
		System.out.println("=============================================");
	    cctvRef.companyName="Godrej";
		cctvRef.cameraCost=15000;
		System.out.println("Camera Company Name :"+cctvRef.companyName);
		System.out.println("Camera Cost :"+cctvRef.cameraCost);
		System.out.println("\n");
		
		
		
		Tripod tripod=new Tripod();
	    tripod.companyName="Manfrotto";
		tripod.costInRs=32000;
		System.out.println("Tripod Company Name :"+tripod.companyName);
		System.out.println("Tripod Cost :"+tripod.costInRs);
		System.out.println("=============================================");
		tripod.companyName="Gitzo";
		tripod.costInRs=22000;
		System.out.println("Tripod Company Name :"+tripod.companyName);
		System.out.println("Tripod Cost :"+tripod.costInRs);
		System.out.println("\n");
		
		
		
		Zip zipRef =new Zip();
	    zipRef.quantity=5;
		zipRef.cost=300;
		System.out.println("No of Zips :"+zipRef.quantity);
		System.out.println("Total Cost of zip :"+zipRef.cost);
		System.out.println("=============================================");
		zipRef.quantity=10;
		zipRef.cost=600;
		System.out.println("No of Zips :"+zipRef.quantity);
		System.out.println("Total Cost of zip :"+zipRef.cost);
		System.out.println("\n");
		
		
		Helmet helmetRef =new Helmet();
	    helmetRef.barnd="Vega";
		helmetRef.cost=3500;
		System.out.println("Helmet Brand :"+helmetRef.barnd);
		System.out.println("Cost :"+helmetRef.cost);
		System.out.println("=============================================");
		helmetRef.barnd="Bell Helmet";
		helmetRef.cost=6500;
		System.out.println("Helmet Brand :"+helmetRef.barnd);
		System.out.println("Cost :"+helmetRef.cost);
		System.out.println("\n");
		
		
		HillStation hillStation =new HillStation();
	    hillStation.hillName="Manali";
		hillStation.location="Himachal Pradesh";
		System.out.println("Name of HillStation :"+hillStation.hillName);
		System.out.println("Location of Hillstation :"+hillStation.location);
		System.out.println("=============================================");
		hillStation.hillName="Mullayanagiri";
		hillStation.location="Chikkamagaluru";
		System.out.println("Name of HillStation :"+hillStation.hillName);
		System.out.println("Location of Hillstation :"+hillStation.location);
		System.out.println("\n");
		
		
		Camera camera =new Camera();
	    camera.brand="Canon";
		camera.price=35000;
		System.out.println("Camera brand :"+camera.brand);
		System.out.println("cost of camera :"+camera.price);
		System.out.println("=============================================");
		camera.brand="Nikon";
		camera.price=31000;
		System.out.println("Camera brand :"+camera.brand);
		System.out.println("cost of camera :"+camera.price);
		System.out.println("\n");
		
		
		Hat hatRef =new Hat();
	    hatRef.brand="New Era Cap";
		hatRef.price=5000;
		System.out.println("Hat brand :"+hatRef.brand);
		System.out.println("cost of Hat :"+hatRef.price);
		System.out.println("=============================================");
		hatRef.brand="eager";
		hatRef.price=3000;
		System.out.println("Hat brand :"+hatRef.brand);
		System.out.println("cost of Hat :"+hatRef.price);
		System.out.println("\n");
		
		
		SelfieStick selfieStickRef =new SelfieStick();
	    selfieStickRef.noOfPiceses=5;
		selfieStickRef.price=5000;
		System.out.println("No of SelfieSticks :"+selfieStickRef.noOfPiceses);
		System.out.println("Total cost of SelfieSticks :"+selfieStickRef.price);
		System.out.println("=============================================");
		selfieStickRef.noOfPiceses=8;
		selfieStickRef.price=8000;
		System.out.println("No of SelfieSticks :"+selfieStickRef.noOfPiceses);
		System.out.println("Total cost of SelfieSticks :"+selfieStickRef.price);
		System.out.println("\n");
		
		
		
		Clothes clothesRef =new Clothes();
	    clothesRef.brand="Adidas";
		clothesRef.cost=5000;
		System.out.println("Cloth brand :"+clothesRef.brand);
		System.out.println("cost of Clothes :"+clothesRef.cost);
		System.out.println("=============================================");
		clothesRef.brand="PUMA";
		clothesRef.cost=3500;
		System.out.println("Cloth brand :"+clothesRef.brand);
		System.out.println("cost of Clothes :"+clothesRef.cost);
		System.out.println("\n");
		
		
		Poster posterRef =new Poster();
	    posterRef.type="Educational";
		posterRef.cost=500;
		System.out.println("Type of poster :"+posterRef.type);
		System.out.println("cost of poster :"+posterRef.cost);
		System.out.println("=============================================");
		posterRef.type="Social";
		posterRef.cost=1200;
		System.out.println("Type of poster :"+posterRef.type);
		System.out.println("cost of poster :"+posterRef.cost);
		System.out.println("\n");
		
		
		
		PostBox postBoxRef =new PostBox();
	    postBoxRef.postboxNo="577203";
		postBoxRef.address="shimoga";
		System.out.println("PostBox Number :"+postBoxRef.postboxNo);
		System.out.println("PostBox Address:"+postBoxRef.address);
		System.out.println("=============================================");
		postBoxRef.postboxNo="560026";
		postBoxRef.address="BayatarayanPura, Mysore Road, Bangalore";
		System.out.println("PostBox Number :"+postBoxRef.postboxNo);
		System.out.println("PostBox Address:"+postBoxRef.address);
		System.out.println("\n");
		
		
	    Key keyRef =new Key();
	    keyRef.numOfKeys=3;
		keyRef.address="shimoga";
		System.out.println("Number of keys :"+keyRef.numOfKeys);
		System.out.println("Location of Home:"+keyRef.address);
		System.out.println("=============================================");
		keyRef.numOfKeys=2;
		keyRef.address="Bangalore";
		System.out.println("Number of keys :"+keyRef.numOfKeys);
		System.out.println("Location of Home:"+keyRef.address);
		System.out.println("\n");
		
		
	    Tree treeRef =new Tree();
	    treeRef.treeName="Mango";
		treeRef.noOfTrees=30;
		System.out.println("Tree Name :"+treeRef.treeName);
		System.out.println("No of Trees:"+treeRef.noOfTrees);
		System.out.println("=============================================");
		treeRef.treeName="Coconut";
		treeRef.noOfTrees=20;
		System.out.println("Tree Name :"+treeRef.treeName);
		System.out.println("No of Trees:"+treeRef.noOfTrees);
		System.out.println("\n");
		
		
		
		
		
		
		System.out.println("\nEnd main in CopiesRunner\n");
		 

	}
}