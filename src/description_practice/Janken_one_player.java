package description_practice;

import java.util.Random;
import java.util.Scanner;

public class Janken_one_player {

	public static final int rock = 0;
	public static final int paper = 1;
	public static final int scissors = 2;

	public static final String[] hand = {"グー", "チョキ", "パー"};

	public static void main(String[] args) {

		System.out.println("じゃんけん開始");

		for (int i = 0; i < 3; i++) {
			System.out.println("じゃんけんの手を選択してください");
			System.out.println("1:グー\n2:チョキ\n3:パー");

			@SuppressWarnings("resource")
			Scanner scn = new Scanner(System.in);
			int myHand = scn.nextInt() - 1;

			boolean errFrag = false;
			if(myHand != rock && myHand != paper && myHand != scissors) {
                errFrag = true;
            }
			else if (errFrag) {
				System.out.println("もう一度1～3を入力してください！\n");
                i--;
			}
			else {
				Random rnd = new Random();
				int comHand = rnd.nextInt(3);

				System.out.println((i + 1) + "回戦目");
				System.out.println(hand[myHand] + " vs " + hand[comHand]);

				if (myHand == comHand) {
                    System.out.println("引き分けです！\n");
                } else if ((myHand == rock && comHand == scissors) || (myHand == scissors && comHand == paper)
                        || (myHand == paper && comHand == rock)) {
                    System.out.println("あなたが勝ちました！\n");
                } else {
                    System.out.println("あなたが負けました！\n");
                }
            }
		}
	}
}


