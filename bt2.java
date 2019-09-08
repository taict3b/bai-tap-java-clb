//main
package bt;

public class bt2 {
	public static void main(String[] args)
	{
		mat_hang mat_hang1= new mat_hang();
		mat_hang1.setMa_sp(1);
		mat_hang1.getMa_sp();
		mat_hang1.setTen_sp("banh trung thu");
		mat_hang1.getTen_sp();
		mat_hang1.setGia_mua(15000);
		mat_hang1.getGia_mua();
		mat_hang1.setGia_ban(20000);
		mat_hang1.getGia_ban();
		mat_hang1.setMa_sp(60);
		mat_hang1.getMa_sp();
		mat_hang1.setSo_luong(60);
		mat_hang1.getSo_luong();
		mat_hang1.setTien_lai();
		mat_hang1.getTien_lai();
		mat_hang1.setTien_lo();
		mat_hang1.getTien_lo();
		System.out.println("ma sp:"+ mat_hang1.getMa_sp());
		System.out.println("tien lai neu ba het:"+ mat_hang1.getTien_lai());
		System.out.println("tien lo neu ban duoc 2/3:"+ mat_hang1.getTien_lo());
	}
}
//class
package bt;

public class mat_hang {
	int ma_sp;
	String ten_sp;
	int gia_mua;
	int gia_ban;
	int so_luong;
	int tien_lai;
	int tien_lo;
		
	public int getMa_sp() {
		return ma_sp;
	}
	public void setMa_sp(int ma_sp) {
		this.ma_sp = ma_sp;
	}
	public String getTen_sp() {
		return ten_sp;
	}
	public void setTen_sp(String ten_sp) {
		this.ten_sp = ten_sp;
	}
	public int getGia_mua() {
		return gia_mua;
	}
	public void setGia_mua(int gia_mua) {
		this.gia_mua = gia_mua;
	}
	public int getGia_ban() {
		return gia_ban;
	}
	public void setGia_ban(int gia_ban) {
		this.gia_ban = gia_ban;
	}
	public int getSo_luong() {
		return so_luong;
	}
	public void setSo_luong(int so_luong) {
		this.so_luong = so_luong;
	}
	public int getTien_lai() {
		return tien_lai;
	}
	public void setTien_lai() {
		this.tien_lai = getGia_ban()*getSo_luong()-getGia_mua()*getSo_luong();
	}
	public int getTien_lo() {
		return tien_lo;
	}
	public void setTien_lo() {
		this.tien_lo =  -(2/3)*getGia_ban()*getSo_luong()+getGia_mua()*getSo_luong();
	}

	
}
