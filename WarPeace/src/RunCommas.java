import java.util.concurrent.Callable;

public class RunCommas implements Callable<Integer> {

	private String text;

	public RunCommas(String text) {
		this.text = text;
	}

	@Override
	public Integer call() throws Exception {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ',') {
				count++;
			}
		}
		return count;
	}
}
