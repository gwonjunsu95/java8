package Day16;

public class Util {

	public static <T> Box2<T> boxing(T t) {
		Box2<T> box = new Box2<>();
		box.set(t);
		return box;
	}
}
