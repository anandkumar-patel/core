package anand.learn.codilty.easy.tennis;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int machPlayed =obj.solution(10,50);
		System.out.println("Max Number of match get played :"+machPlayed);
	}
	public int solution(int players, int courts) {
		if(players<=0 || courts <=0)
			return 0;
		if(players/2>= courts)
			return courts;
		else
			return players/2;
	}
}
