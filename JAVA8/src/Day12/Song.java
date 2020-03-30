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
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}
