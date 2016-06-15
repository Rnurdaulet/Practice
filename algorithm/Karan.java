/*https://www.hackerearth.com/problem/algorithm/karan-and-trees/
 * Karan performed poorly in the Capillary Java Hiring Challenge because he did not know the concept of trees. After the contest, he asks you to help him out in the questions.

Given two nodes of a binary tree, you need to tell the lowest common ancestor.
The root node is 1 and the general form of left node is 2n and of right node is 2n+1, where n is the parent.
Input:
The first line contains the number of test cases T. Each test case contains two space separated integers, the nodes.
 * */


package sevennationarmy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Karan {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String[] inputs = br.readLine().split(" ");
			long node1 = Long.parseLong(inputs[0]);
			long node2 = Long.parseLong(inputs[1]);
			Set<Long> node1Parents = new HashSet<Long>();
			Set<Long> node2Parents = new HashSet<Long>();
			node1Parents.add(node1);
			node2Parents.add(node2);
			while (true) {
				if (node2Parents.contains(node1)) {
					System.out.println(node1);
					break;
				} else if (node1Parents.contains(node2)) {
					System.out.println(node2);
					break;
				}
				node1 = node1 / 2;
				node2 = node2 / 2;
				node1Parents.add(node1);
				node2Parents.add(node2);

			}
		}
	}
}