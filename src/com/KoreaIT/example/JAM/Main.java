package com.KoreaIT.example.JAM;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int lastArticleId = 0;

		while (true) {

			System.out.printf("명령어) ");
			String cmd = sc.nextLine().trim();

			if (cmd.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			if (cmd.equals("article write")) {
				int id = lastArticleId + 1;
				lastArticleId = id;
				
				System.out.printf("제목 : \n");
				String title = sc.nextLine();
				System.out.printf("내용 : \n");
				String body = sc.nextLine();

				System.out.printf("%d번 글이 생성되었습니다.\n", id);
				
			} else if (cmd.equals("article list")) {
				System.out.println("번호 / 제목");
				System.out.printf("%d / %s", id, title);
			}
		}

		sc.close();


	}
}
