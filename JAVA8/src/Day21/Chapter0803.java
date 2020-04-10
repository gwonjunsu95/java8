package Day21;

public class Chapter0803 { // extends Thread{

//	int sum = 1;
//	int res;
//
//	public synchronized void run() {
//		for (int i = 0; i < 1_000_000; i++) {
//			i = sum * 9800;
//			res = 1_000_000 - i;
//			sum++;
//			if (res < 9800) {
//				System.out.println("9800원을 인출, 남은 잔액 : " + res);
//				System.out.println("잔액부족, 현재 잔액 : " + res + "인출 금액 : 9800");
//				System.out.println("총액은 : " + res);
//				break;
//			} else {
//				System.out.println("9800원을 인출, 남은 잔액 : " + res);
//			}
//		}
//	}
//
//	
//
//	public static void main(String[] args) {
//		Chapter0803 t1 = new Chapter0803();
//
//		t1.start();
//	}

//	// 선생님 답
//	public static void main(String[] args) {
//		Account account = new Account();
//		Customer[] cArr = new Customer[4];
//		for(int i = 0; i < 4; i++) {
//			cArr[i] = new Customer(account);
//			cArr[i].start();
//		}
//		for(int i = 0; i < 4; i++) {
//			try {
//				cArr[i].join();
//			} catch (InterruptedException e) {
//			}
//		}
//		System.out.println("총액은: " + account.getBalance());
//	}
//	class Account {
//
//		private int balance = 1_000_000;
//
//		synchronized void deposit(int money) {
//			if (balance - money < 0) {
//				Thread.currentThread().interrupt();
//			} else {
//				balance -= money;
//				System.out.println(money + "원을" + Thread.currentThread().getName() + "가 인출, 남은 잔액 : " + getBalance());
//			}
//		}
//
//		public int getBalance() {
//			return balance;
//		}
//
//	}
//
//	class Customer extends Thread {
//		private Account account;
//
//		public Customer(Account account) {
//			this.account = account;
//		}
//
//		@Override
//		public void run() {
//			while (true) {
//				account.deposit(9800);
//				if (interrupted()) {
//					break;
//				}
//			}
//		}
//	}

}
