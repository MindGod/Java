package second;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int blokas = 7874;
		int luitas = blokas / 9;
		int batai = luitas * 4;
		int sarvai = luitas * 8;
		int salmas = luitas * 5;
		int kelnes = luitas * 7;
		int rezultatas = 0;

		boolean pabaiga = false;
		while (!pabaiga){
			System.out.println("Ko tu noretum?");
			String x = input.nextLine();
			if (x.equals("sarvu")) {
				rezultatas += sarvai;
			} else if (x.equals("batu")) {
				rezultatas += batai;
			} else if (x.equals("salmo")) {
				rezultatas += salmas;
			} else if (x.equals("kelniu")) {
				rezultatas += kelnes;
			}
			System.out.println("ar dar kasko noretum?");
			String z = input.nextLine();
			if (z.equals("taip")) {
				System.out.println("ko noretum");
			} else if (z.equals("ne")) {
				System.out.println("ok");
				break;
			}
			String h = input.nextLine();
			if (h.equals("sarvu")) {
				rezultatas += sarvai;
			} else if (h.equals("batu")) {
				rezultatas += batai;
			} else if (h.equals("salmo")) {
				rezultatas += salmas;
			} else if (h.equals("kelniu")) {
				rezultatas += kelnes;
			}
			System.out.println("ar dar kasko noretum?");
			String t = input.nextLine();
			if (t.equals("taip")) {
				System.out.println("ko noretum?");
			} else if (t.equals("ne")) {
				System.out.println("ok");
				break;
			}
			String r = input.nextLine();
			if (r.equals("sarvu")) {
				rezultatas += sarvai;
			} else if (r.equals("batu")) {
				rezultatas += batai;
			} else if (r.equals("salmo")) {
				rezultatas += salmas;
			} else if (r.equals("kelniu")) {
				rezultatas += kelnes;
			}
			System.out.println("ar dar kasko noretum?");
			String e = input.nextLine();
			if (e.equals("taip")) {
				System.out.println("ko noretum?");
			} else if (e.equals("ne")) {
				System.out.println("ok");
				break;
			}
			String w = input.nextLine();
			if (w.equals("sarvu")) {
				rezultatas += sarvai;
			} else if (w.equals("batu")) {
				rezultatas += batai;
			} else if (w.equals("salmo")) {
				rezultatas += salmas;
			} else if (w.equals("kelniu")) {
				rezultatas += kelnes;
			}
			pabaiga = true;
		}
			System.out.println("tavo visi sarvai svers: " + rezultatas);	
			System.out.println("kiek tu turi bloku savo inv?");
			int l = input.nextInt();
			System.out.println("ok");
	}
}	