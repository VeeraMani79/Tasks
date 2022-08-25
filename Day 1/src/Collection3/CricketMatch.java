package Collection3;

public class CricketMatch {

	private String matchType;
	private  String teamName;
	private boolean isIccMatch;
	private int winningPrice;
	private String manOfTheSeries;
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public boolean getIccMatch() {
		return isIccMatch;
	}
	public void setIccMatch(boolean isIccMatch) {
		this.isIccMatch = isIccMatch;
	}
	public int getWinningPrice() {
		return winningPrice;
	}
	public void setWinningPrice(int winningPrice) {
		this.winningPrice = winningPrice;
	}
	public String getManOfTheSeries() {
		return manOfTheSeries;
	}
	public void setManOfThePrice(String manOfThePrice) {
		this.manOfTheSeries = manOfThePrice;
	}
	public CricketMatch(String matchType, String teamName, boolean isIccMatch, int winningPrice, String manOfThePrice) {
		super();
		this.matchType = matchType;
		this.teamName = teamName;
		this.isIccMatch = isIccMatch;
		this.winningPrice = winningPrice;
		this.manOfTheSeries = manOfThePrice;
	}
	@Override
	public String toString() {
		return  matchType + ","+ teamName + "," + isIccMatch
				+ ","+ winningPrice + ","+ manOfTheSeries;
	}
	
}
