
public class NetBanking {
	static int fund = 1245;
	static int transferAmount = 145;
public static void main(String args[]) {
	fundTransfer();
	
}
static void fundTransfer(){
	fundCheck();
}

static void fundCheck() {
	if(fund>= transferAmount) {
		System.out.println("Funds transferred successfully!");
	}
	else {
		System.out.println("Insufficient Funds!");
	}
}

}
