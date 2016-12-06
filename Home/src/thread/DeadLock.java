package thread;

public class DeadLock {
	static class Cats {
		private final String name;

		public Cats(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public synchronized void eat(Cats eater) {
			System.out.format("%s: %s" + " is eating%n", this.name, eater.getName());
			eater.eatMyBowl(this);
		}

		public synchronized void eatMyBowl(Cats eater) {
			System.out.format("%s: %s" + "is eating from other Bowl%n", this.name, eater.getName());
		}
	}

	public static void main(String[] args) {
		final Cats motja = new Cats("Motja");
		final Cats bagira = new Cats("Bagira");
		new Thread(new Runnable() {

			@Override
			public void run() {
				motja.eat(bagira);

			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				bagira.eat(motja);

			}
		}).start();
	}

}
