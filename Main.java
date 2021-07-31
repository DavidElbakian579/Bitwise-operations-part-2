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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1
        Степень двойки
        Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
        Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.
        */
        System.out.println(getPowerOfTwo(3));
        
        
    }
    
    public static int getPowerOfTwo(int power) {
        int result = 2;

        return result  << power-1;
    }
    
}
