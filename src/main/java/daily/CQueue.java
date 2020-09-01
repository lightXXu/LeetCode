package daily;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 题目：
 *
 * @author： lightXXu
 * 时间：2020-08-21 11:28
 */
public class CQueue {
	Deque<Integer> appendQueue = new LinkedList<>();
	Deque<Integer> deleteQueue = new LinkedList<>();

	public static void main(String[] args) {
		CQueue obj = new CQueue();
		obj.appendTail(5);
		obj.appendTail(2);
		int param_2 = obj.deleteHead();
		int param_3 = obj.deleteHead();

		System.out.println(param_3);
	}

	public CQueue() {

	}

	public void appendTail(int value) {
		appendQueue.push(value);
	}

	public int deleteHead() {
		if (deleteQueue.isEmpty() && appendQueue.isEmpty()) {
			return -1;
		}

		if (deleteQueue.isEmpty()) {
			while (!appendQueue.isEmpty()) {
				deleteQueue.push(appendQueue.pop());
			}
		}

		return deleteQueue.pop();
	}

}
