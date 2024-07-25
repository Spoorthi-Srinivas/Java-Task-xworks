class VehicleNo{
	public static void main(String[] args)
	{
		System.out.println("Start main in VehicleNo");
	    String Vno1="KA02AE69200";
		String Vno2="kA01AK5101";
		String Vno3="KA01AP5992";
		String Vno4="KA41MC7567";
		String Vno5="KA01MQ7000";
		String Vno6="TN70AF7170";
		String Vno7="KA01MQ7000";
		String Vno8="AP26CE1234";
		String Vno9="Pb08ET6725";
		String Vno10="KL13W1986";
		String Vno11="NL01b4591";
		String Vno12="KA01AK9618";
		String Vno13="KA51AH4790";
		String Vno14="TN25BS3022";
		String Vno15="KA01J03718";
		String Vno16="KA13C5980";
		String Vno17="KA57F3619";
		String Vno18="KA05AN6996";
		String Vno19="KA04MV8734";
		String Vno20="AR06B8246";
		
		String[] vehicleNos={Vno3,Vno1,Vno2,Vno4,Vno5,Vno6,Vno8,Vno9,Vno10,Vno11,Vno16,Vno13,Vno14,Vno15,Vno18,Vno10,Vno20,Vno12,Vno16,Vno15,Vno7,Vno17,Vno18,Vno19};
		int length=vehicleNos.length;
		System.out.println("Length of ArrayIndex:"+length);
		
		for(int num=0;num<20;num++)
		{
		String vehicleNo=vehicleNos[num];
			System.out.println("Vehicle Registration No: "+vehicleNo);
		}
		
		System.out.println("End main in VehicleNo");
									
									
	}
}
//5. Store 10 vehicle registration no and print the element refernce