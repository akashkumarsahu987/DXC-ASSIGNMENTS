public class Onedcricket extends cricket {
	public Onedcricket(int targetScore) {
		super(targetScore, 50);
}
	double calcCurrentRunrate(int currentScore, int currentOver) {
		return currentScore/currentOver;
	}
	double calcReqdRunrate(int remainingRuns, int remainingOver) {
		return remainingRuns/remainingOver;
	}
	

}