package description_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HitAndBlow {

	public static void main(String[] args) {

		String title = "***CodeBreaker***\n";
		String rule = "隠された3つの数字を当てる。\n"
		+ "1つの数字は1~6の間がある。\n"
		+ "3つの答えの中に同じ数字はない。\n"
		+"入力した数字の、位置と数字が当たっていたらヒット。\n"
		+"数字だけがあっていたらブローとカウントします。\n"
		+"全部当てたら(3つともヒットになったら終了する)\n";

		//回答
		int[] answer = new int[3];
		//予想
		int[] input = new int[3];

		//hitのカウント
		int hit = 0;
		//blowのカウント
		int blow = 0;
		//チャレンジ回数
		int count= 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(title);
		System.out.println(rule);

		for (int i = 0; i < answer.length; i++) {
			boolean flag = false;
			answer[i] = (int)(Math.random() * 6 + 1);
			do {
				flag = false;
				for (int j = i - 1; j >= 0 ; j--) {
					if(answer[i] == answer[j]) {
						flag = true;
						answer[i] = (int)(Math.random() * 6 + 1);
					}
				}
			} while (flag == true);
		}
		while(true) {
			count++;
			System.out.println("***" + count + "回目" + "***");
			for (int i = 0; i < input.length; i++) {
				System.out.println((i + 1) + "個目 :");
				try {
				input[i] = Integer.parseInt(br.readLine());
			}catch (NumberFormatException e) {
				System.err.println("数値のみ入力可：");
				i--;
			}catch (IOException e) {
				System.err.println("もう一度入力：");
				i--;
			}
		}
		hit = 0;
		blow = 0;
		for (int i = 0; i < answer.length; i++) {
			for (int j= 0; j < answer.length; j++) {
				if(i == j && input[i] == answer[j]) {
					hit++;
				}else if (input[i] == answer[j]) {
					blow++;
				}
			}
		}
				System.out.println("ヒット" + hit + "ブロー" + blow);
				if(hit == 3) {
					System.out.println("\n\t******おめでとう!!******");
					break;
				}else {
					System.out.println();
			}
		}
	}
}
