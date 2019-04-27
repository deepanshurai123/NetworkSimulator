import java.util.*;
import java.util.concurrent.TimeUnit;
class device{
	String mac="";
	int data;
	int id;
	// device(int data,int id){
 //     this.data =data;
 //     this.id =id;
	// }
}

class assign{
	public String get_mac()
	{
		Random rr= new Random();
		String m="";
		for(int i=0;i<48;i++)
		{
			int sm = rr.nextInt(2);
			String ss = Integer.toString(sm);
			m = m+ss;
		}
		int i=0;
		String mac="";
		//for(int i=0;i<13;i++)
		while(i<48)
		{
			String t=(m.substring(i,i+4));
			switch(t)	
            {
                case "0000":
                    mac = mac + "0";
                    break;
                case "0001":
                    mac = mac + "1";
                    break;
                case "0010":
                    mac = mac + "2";
                    break;
                case "0011":
                    mac = mac + "3";
                    break;
                case "0100":
                    mac = mac + "4";
                    break;
                case "0101":
                    mac = mac + "5";
                    break;
                case "0110":
                    mac = mac + "6";
                    break;  
                case "0111":
                    mac = mac + "7";
                    break;    
                case "1000":
                    mac = mac + "8";
                    break;
                case "1001":
                    mac = mac + "9";
                    break;    
                case "1010":
                    mac = mac + "A";
                    break;
                case "1011":
                    mac = mac + "B";
                    break;
                case "1100":
                    mac = mac + "C";
                    break;
                case "1101":
                    mac = mac + "D";
                    break;
                case "1110":
                    mac = mac + "E";
                    break;
                case "1111":
                    mac = mac + "F";
                    break;
            }
          //  if(((i+4)%8==0) && (i+4!=48))		
			i=i+4;
			if(i%8==0 && i!=48)
				mac = mac+ ":";			
		}
		return mac;



	}

}



class NetworkSimulator{

	public static void main(String args[])
	{
		System.out.println("Enter The Number of Devices");
		
		Scanner se = new Scanner(System.in);
		int no_of_device = se.nextInt();
		device[] arr= new device[no_of_device];
		assign ab= new assign();
		int idd=1;
		//device obj=new device();

		for(int i=0;i<no_of_device;i++)
		{
			String tt=ab.get_mac();
			arr[i] = new device();
			arr[i].mac=tt;
			arr[i].id=idd++;
			//System.out.println(tt);
		}
		System.out.println("Enter the Topology you want to select");
		int topology= se.nextInt();
		switch(topology)
		{
			case 1 : //
			{
				arr[r] = new device();
				arr[r].data=da;
			}
		}
		
               //satya
		
		
		
		




	}
}
