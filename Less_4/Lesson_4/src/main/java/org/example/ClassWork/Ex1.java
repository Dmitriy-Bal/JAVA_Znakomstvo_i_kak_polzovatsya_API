package org.example.ClassWork;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(random.nextInt(10));
        }
        System.out.println(integerLinkedList);
        sc.close();
        System.out.println(integerLinkedList.peek()); // возвращает 1-й элемент
        System.out.println(integerLinkedList.pop()); // удаляет 1-й элемент и возвращает (выводит) его
        integerLinkedList.addFirst(3);
        integerLinkedList.addLast(6);
        System.out.println(integerLinkedList);
        integerLinkedList.remove(3); // удаляет элемент под индексом 3
        System.out.println(integerLinkedList);
        integerLinkedList.remove((Integer) 4); // удаляет 1-й попавшийся элементы со значением 4
        System.out.println(integerLinkedList);
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//    public ListNode reverseList(ListNode head) {
//        ListNode pred = null;
//        ListNode current = head;
//        while (current != null) {
//            ListNode nextElem = current.next;
//            current.next = pred;
//            pred = current;
//            current = nextElem;
//        }
//        return pred;
//    }
//}



