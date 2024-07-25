class GiftBox{
	public static void sendGift(String name,double price,String date,boolean urgent)
	{
		System.out.println("Start sendGift in GiftBox");
		Assign.assign(name,price,date,urgent);
		System.out.println("End sendGift in GiftBox");
	}
}