package Day12;

public class Song {

	String title, artist, country;
	int year;

	Song(int year, String country, String artist, String title) {
		this.artist = artist;
		this.country = country;
		this.title = title;
		this.year = year;
	}

	void show() {
		System.out.println(year + "�� " + country + "������ " + artist + "�� �θ� " + title);
	}
}
