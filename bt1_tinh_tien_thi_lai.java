package java_clb;
import java.util.Scanner;


public class bt1_clbjv {

			int msv;
			String ten;
			String que_quan;
			float diem_a1;
			float diem_a3;
			float diem_nl1;
			float diem_tb;
			int tien1=0;
			int tien2=0;
			int tien3=0;
			float insert()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("nhap ma so sv:");
				this.msv= sc.nextInt();
				sc.nextLine();
				System.out.println("nhap ten sv:");
				this.ten= sc.nextLine();
				System.out.println("nhap que quan sv:");
				this.que_quan= sc.nextLine();
				System.out.println("nhap diem a1 sv:");
				this.diem_a1= sc.nextFloat();
				System.out.println("nhap diem a3 sv:");
				this.diem_a3= sc.nextFloat();
				System.out.println("nhap diem nguyen li 1 sv:");
				this.diem_nl1= sc.nextFloat();
				this.diem_tb=(diem_a1+diem_a3+diem_nl1)/3;
				
				System.out.println("Ban "+ this.ten + " co diem tb la:"+ this.diem_tb+"\n");
				return 0;
			}
			int tinh_tien()
			{
				if(this.diem_a1<4)
				{
					tien1=90;
				}
				if(this.diem_a3<4)
				{
					tien2=90;
				}
				if(this.diem_nl1<4)
				{
					tien3=90;
				}
				int tien=tien1+tien2+tien3;
				System.out.println("tong tien thi lai:" + tien);
				return tien1+tien2+tien3;
			}
			public static void main(String[] args)
			{
				bt1_clbjv dt1= new bt1_clbjv();
				dt1.insert();
				dt1.tinh_tien();
			}

		

	}

