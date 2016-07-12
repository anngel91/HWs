package hw6;

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String simMobileNumber) {
		if (simMobileNumber.length() == 10 && simMobileNumber.startsWith("08") == true) {
			this.simMobileNumber = simMobileNumber;
			hasSimCard = true;
		}
	}

	void removeSimCard() {
		hasSimCard = false;
		simMobileNumber = null;
		System.out.println("Sim card removed!");
	}

	void call(GSM receiver, int duration) {
		if (receiver.simMobileNumber.equals(this.simMobileNumber) == false) {
			if (duration >= 0) {
				if (receiver.hasSimCard == true && hasSimCard == true) {
					this.lastOutgoingCall = new Call();
					receiver.lastIncomingCall = new Call();
					this.lastOutgoingCall.receiver = receiver;
					receiver.lastIncomingCall.caller = this;
					this.lastOutgoingCall.duration = duration;
					receiver.lastIncomingCall.duration = duration;
					this.outgoingCallsDuration += duration;
					System.out.println("Your last outgoing call cost: " + getSumForCall());
				} else {
					System.out.println("Calling requires sim cards!");
				}
			} else {
				System.out.println("Duration can't be negative!");
			}
		} else {
			System.out.println("You can't call yourself!");
		}
	}

	double getSumForCall() {
		return lastOutgoingCall.duration * lastOutgoingCall.priceForAMinute;
	}

	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall != null) {
			System.out.println("You called: " + lastOutgoingCall.receiver.simMobileNumber);
			System.out.println("Duration was: " + lastOutgoingCall.duration);
		}

	}

	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall != null) {
			System.out.println("You were called by: " + lastIncomingCall.caller.simMobileNumber);
			System.out.println("Duration was: " + lastIncomingCall.duration);
		}
	}

}
