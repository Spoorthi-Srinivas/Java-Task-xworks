class AadharNo{
	public static void main(String[] args)
	{
		
		System.out.println("Start main in AadharNo");
		String aadharNo1="560894084686";
		String aadharNo2="258542552257";
		String aadharNo3="283976026744";
		String aadharNo4="385983065279";
		String aadharNo5="894067992109";
		String aadharNo6="521330305149"; 
		String aadharNo7="934564605414"; 
		
		String[] aadharNos={aadharNo3,aadharNo2,aadharNo4,aadharNo2,aadharNo1,aadharNo6,aadharNo5};
		int length=aadharNos.length;
		System.out.println("Length of ArrayIndex:"+length);
		
		for(int num=0;num<7;num++);
		{
		String aadharNo=aadharNos[num];
		System.out.println("Aadhar Number: "+aadharNo);
		}
		
		
		System.out.println("End main in AadharNo");
	}
}
//4. Store 5 aadharNo and print the element refernce
