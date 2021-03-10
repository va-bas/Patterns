package com.vabas.patterns.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression drink = getDrink();
        Expression eat = getEat();
        String menu = "beer go milkgo beer hi sausage chesbread";

        System.out.println("Eat in menu are bread and ches " + eat.interpret(menu));
        System.out.println("Drink in menu is beer or milk " + drink.interpret(menu));
    }

    public static Expression getDrink(){
        int count = 0;
        Expression beer = new TerminalExpression("beer");
        Expression water = new TerminalExpression("water");
        Expression milk = new TerminalExpression("milk");

        return new OrExpression(beer, milk);
    }

    public static Expression getEat(){
        Expression meat = new TerminalExpression("meat");
        Expression bread = new TerminalExpression("bread");
        Expression ches = new TerminalExpression("ches");
        Expression sausage = new TerminalExpression("sausage");

        return new AndExpression(bread, sausage);
    }
}
