package thread;

public class ProdCons {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		while (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException перехвачено");
			}
		System.out.println("Получено");
		valueSet = false;
		notify();
		return n;
	}
	synchronized void put(int n){
		while (valueSet){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException перехвачено");
			}
			this.n=n;
			valueSet=true;
			System.out.println("отправлено");
			notify();
		}
		
	}
	class Producer implements Runnable{
		ProdCons pc;
		Producer(ProdCons pc){
			this.pc=pc;
			new Thread(this, "поставщик").start();
		}
		public void run() {
		int i=0;
		while(true){
			pc.put(i);
		}

		}
		
	}
	class Consumer implements Runnable{
		ProdCons pc;
		Consumer(ProdCons pc){
			this.pc=pc;
			new Thread(this, "потребитель").start();
		}
		public void run(){
			while(true){
				pc.get();
			}
		}
	}
	class PCFixed{
		public void main (String args[]){
			ProdCons pc=new ProdCons();
			new Producer(pc);
			new Consumer(pc);
			System.out.println("для завершения ctrl+c");
		}
	}
}
