package thread;

public class ChikenVoice {
	static EggVoice mAnotherOpinion;

	public static void main(String[] args) {
		EggVoice mAnotherOpinion = new EggVoice();
		System.out.println("Спор начат!...");
		mAnotherOpinion.start();
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("курица!");

		}
		if (mAnotherOpinion.isAlive()) {
			try {
				mAnotherOpinion.join();
			} catch (InterruptedException e) {
			}
			System.out.println("первым появилось яйцо");

		} else {
			System.out.println("первой появилась курица");
		}
		System.out.println("спор закончен");
	}

}
