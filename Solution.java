/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro9l6;

/**
 *
 * @author David-pc
 */
public class Solution {
    /* 2
        Флаги
        Реализуй методы:
        setFlag(int number, int flagPos) — устанавливает значение "1" биту под индексом flagPos числа number и возвращает новое значение.
        resetFlag(int number, int flagPos) — устанавливает значение "0" биту под индексом flagPos числа number и возвращает новое значение.
        checkFlag(int number, int flagPos) — проверяет значение бита под индексом flagPos числа number и возвращает true, если значение "1" и false, если "0".
        */
    
    public static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}
