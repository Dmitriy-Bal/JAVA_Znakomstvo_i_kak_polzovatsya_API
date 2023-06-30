package org.example.HomeWork.DZ2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скобки: ");
        String text = sc.nextLine();
        sc.close();
        System.out.println(check(text));
    }

    /**
     * @param staples состоит только из круглых скобок '()[]{}'
     * @return true or false
     * @apiNote Учитывая строку, staples содержащую только символы '(', ')', '{' '}', '[' ']'
     * и определите, является ли введенная строка допустимой.
     */
    public static boolean check(String staples) {
        Deque<Character> list = new LinkedList<>();
        for (int i = 0; i < staples.length(); i++) {
            if (staples.charAt(i) == '(' ||
                    staples.charAt(i) == '[' ||
                    staples.charAt(i) == '{')
                list.add(staples.charAt(i));
            else {
                if (list.isEmpty())
                    return false;
                else if (staples.charAt(i) == ')' && list.getLast().equals('('))
                    list.pollLast();
                else if (staples.charAt(i) == ']' && list.getLast().equals('['))
                    list.pollLast();
                else if (staples.charAt(i) == '}' && list.getLast().equals('{'))
                    list.pollLast();
                else
                    return false;
            }
        }
        return list.isEmpty();
    }
}
