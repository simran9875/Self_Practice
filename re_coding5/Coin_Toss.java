package re_coding5;

public class Coin_Toss {
	public static void coin(int n , String ans) {
		if(n==0) {
			System.out.println(ans);
			return ;
		}
		coin(n-1,ans+"H");
		coin(n-1,ans+"T");
	}

	public static void main(String[] args) {
		int n =3;
		coin(n,"");

	}

}
