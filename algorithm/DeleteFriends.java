package sevennationarmy;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteFriends {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTest = scan.nextInt();

		for (int k = 0; k < numTest; k++) {
			int numF = scan.nextInt();
			int numDel = scan.nextInt();
			boolean DeleteFriend = false;

			ArrayList<Integer> listF = new ArrayList<Integer>();
			for (int i = 0; i < numF; i++) {
				listF.add(scan.nextInt());
			}

			for (int i = 0; i < numDel; i++) {
				for (int j = 0; j < listF.size(); j++) {
					if (listF.get(j) < listF.get(j + 1)) {
						listF.remove(j);
						DeleteFriend = true;
						break;
					}
				}
			}
			if (DeleteFriend == false) {
				listF.remove(listF.size() - 1);
			}
			for (int i = 0; i < listF.size(); i++) {
				int out = listF.get(i);
				System.out.print(out + " ");
			}
			System.out.println();
		}

	}
}