package bt;
import java.util.Scanner;
public class bt4 {
	int mtv;
	String ho_ten;
	String gioi_tinh;
	int nam_sinh;
	String team;
	String chuc_vu;
	
	
public static void main(String[] args)
{
	
	Scanner sc = new Scanner(System.in);
	int n;
	int chon;
	
	bt4[]  tv= new bt4[100 ];
	System.out.println("nhap so luong sv:");
	n= sc.nextInt();
	sc.nextLine();
	do {
		// menu
			System.out.println("\t\t MENU");
			System.out.println("1. Lập danh sách thành viên KIT\r\n" + 
			"2. Hiển thị danh sách thành viên\r\n" + 
			"3. Hiển thị danh sách các bạn nữ đủ tuổi lấy chồng\r\n" + 
			"4. Hiển thị danh sách các thành viên của Web/ Arduino.\r\n" + 
			"5. Thống kê số thành viên KIT sinh năm 2000\r\n" + 
			"6. Thoát");
	// het menu
		System.out.println("Moi ban chon:");
		chon= sc.nextInt();
		
		sc.nextLine();
		
switch(chon)
{
case 1:
{
		
	for (int i = 0; i < n; i++) 
		{
		
		
		System.out.println("nhap thanh vien thu "+ i);
		tv[i]=new bt4();
		
		System.out.println("nhap ma so sv:");
		tv[i].mtv= sc.nextInt();
		sc.nextLine();
		System.out.println("nhap ten sv:");
		tv[i].ho_ten= sc.nextLine();
		System.out.println("nhap gioi tinh sv:");
		tv[i].gioi_tinh= sc.nextLine();
		System.out.println("nhap nam sinh sv:");
		tv[i].nam_sinh= sc.nextInt();
		sc.nextLine();
		System.out.println("nhap team sv:");
		tv[i].team= sc.nextLine();
		System.out.println("nhap chuc vu sv:");
		tv[i].chuc_vu= sc.nextLine();
	}
	
	break;
}
case 2:
	{
		System.out.println("hien thi danh sach:");
		for (int i = 0; i < n; i++) 
		{
				System.out.println(tv[i].ho_ten);
		}
		
		break;
	}
case 3:
{
	for (int i = 0; i <n; i++) 
	{
		if( tv[i].gioi_tinh =="nu"&&tv[i].nam_sinh<=2000 )
		{
			System.out.println("tv[i].ho_ten");
		}
	}
	break;
}
case 4:
{
	for (int i = 0; i <n; i++) 
	{
		if( tv[i].team =="Web" )
		{
			System.out.println("tv[i].ho_ten");
		}
	}
	break;
}
case 5:
{
	for (int i = 0; i <n; i++) 
	{
		if(tv[i].nam_sinh==2000 )
		{
			System.out.println("tv[i].ho_ten");
		}
	}
	break;
}
case 6:
{
	System.out.println("BYE BYE");
	break;
}

}

	}while(chon!=6);
}

}

//int[] myArray = new int[5];
//Bài 4: Sử dụng kiến thúc về mảng, tạo danh sách thành viên KIT. Đối tượng thành viên KIT gồm các thuộc tính sau:
//- Mã thành viên
//- Họ và tên
//- Giới tính
//- Năm sinh
//- Ban/Team
//- Chức vụ.
//Tạo menu với các chức năng sau:
//1. Lập danh sách thành viên KIT
//2. Hiển thị danh sách thành viên
//3. Hiển thị danh sách các bạn nữ đủ tuổi lấy chồng
//4. Hiển thị danh sách các thành viên của Web/ Arduino.
//5. Thống kê số thành viên KIT sinh năm 2000
//6. Thoát
