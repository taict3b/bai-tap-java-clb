package bt;
import java.util.Scanner;
public class bt3_buoi3 {
	int msv=123;
	String ten="Trung Thu Banh";
	String que_quan;
	float diem_a1=9;
	float diem_a2=6;
	float diem_a3=8;
	float diem_thdc=10;
	float diem_ktlt=7;
	public static int chon;
public static void main(String[] args)
{
	bt3_buoi3 hs1= new bt3_buoi3();
	
	System.out.println("Diem ban dau:");
	System.out.println("ten:"+hs1.ten);
	System.out.println("ten:"+hs1.diem_a1);
	System.out.println("ten:"+hs1.diem_a2);
	System.out.println("ten:"+hs1.diem_a3);
	System.out.println("ten:"+hs1.diem_thdc);
	System.out.println("ten:"+hs1.diem_ktlt);
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("\t MENU");
	System.out.println("1.Viet hoa ten vua nhap");
	System.out.println("2.In ra man hinh diem cao nhat");
	System.out.println("3.In ra man hinh diem thap nhat");
	System.out.println("4.Sua diem mot mon bat ky");
	System.out.println("5.thoat!");
	System.out.println("Moi ban chon:");
	chon= sc1.nextInt();
	
	switch(chon)
	{
	
	case 1:
		{
			String ten=hs1.ten.toUpperCase();
			System.out.println(ten);
			break;
		}
	case 2:
		{
			float a=Math.max(hs1.diem_a1,hs1.diem_a2);
			float b=Math.max(hs1.diem_a3,hs1.diem_thdc);
			float ab=Math.max(a,b);
			float c=Math.max(ab,hs1.diem_ktlt);
			System.out.println("diem cao nhat la: "+c);	
			break;
		}
	case 3:
		{
			float a=Math.min(hs1.diem_a1,hs1.diem_a2);
			float b=Math.min(hs1.diem_a3,hs1.diem_thdc);
			float ab=Math.min(a,b);
			float c=Math.min(ab,hs1.diem_ktlt);
			System.out.println("diem thap nhat la: "+c);
			break;
		}
	case 4:
		{
			float a=Math.max(hs1.diem_a1,hs1.diem_a2);
			float b=Math.max(hs1.diem_a3,hs1.diem_thdc);
			float ab=Math.max(a,b);
			float c=Math.max(ab,hs1.diem_ktlt);
			hs1.diem_a1=5;
			if(hs1.diem_a1==c)
				hs1.diem_a1=2;
			if(hs1.diem_a2==c)
				hs1.diem_a2=2;
			if(hs1.diem_a3==c)
				hs1.diem_a3=2;
			if(hs1.diem_thdc==c)
				hs1.diem_thdc=2;
			if(hs1.diem_ktlt==c)
				hs1.diem_ktlt=2;
			System.out.println("ten:"+hs1.ten);
			System.out.println("ten:"+hs1.diem_a1);
			System.out.println("ten:"+hs1.diem_a2);
			System.out.println("ten:"+hs1.diem_a3);
			System.out.println("ten:"+hs1.diem_thdc);
			System.out.println("ten:"+hs1.diem_ktlt);
			System.out.println("da sua diem a1 thanh 5 va diem cao nhat thanh 2!");
			break;
		}
		
	case 5:
	{
		break;
	}
	}
}
}
