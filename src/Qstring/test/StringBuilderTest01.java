package Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Ana Viana";
        nome.concat("Viana Dark");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" Viana Dark").append("Sublimação");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}