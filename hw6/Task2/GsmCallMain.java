package hw6;

public class GsmCallMain {

	public static void main(String[] args) {
		GSM pesho = new GSM();
		GSM pusho = new GSM();
		pesho.insertSimCard("0855111222");
		pusho.insertSimCard("0866888777");
		System.out.println(pesho.simMobileNumber);
		System.out.println(pusho.simMobileNumber);

		pesho.call(pusho, 13);
		pesho.printInfoForTheLastOutgoingCall();
		pusho.printInfoForTheLastIncomingCall();
		pesho.removeSimCard();
	}

}
