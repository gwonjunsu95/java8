package Day12;

public class TV {

	String company;
	int year;
	int inch;
	
	TV(String company, int year, int inch) {
		this.company = company;
		this.year =year;
		this.inch = inch;
	}

	void show() {
		System.out.println(company + "���� ����"+ year +"����" + inch +"��ġ TV");
	}

}
