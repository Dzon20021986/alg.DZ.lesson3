package Stack.lesson3;


public class Expression {
    private String exp;

    public Expression(String exp) {
        this.exp = exp;
    }

    public boolean checkBracket() {     // метод проверки скобки.
        MyStack<Character> stack = new MyStack<>(exp.length());
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);     // извлекаем символ. возвращает значение char по указанному индексу
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // вставка элемента.
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {   // если стек остался пустой.
                    System.out.println("Error in " + i + " position");
                    return false;
                }
                char top = stack.pop();   // извлекаем самый верхний (top) и теперь сравниваем пара он или не пара.
                if (ch == ')' && top != '(' ||
                        ch == '}' && top != '}' ||
                        ch == ']' && top != '[') {
                    System.out.println("Error in " + i + " position: bracket doesn't match");  // ошибка в позиции скобка не совпадает.
                    return false;
                }
            }
        }
        if (!stack.isEmpty()){   // если стек остался не пустой
            System.out.println("Error: bracket doesn't match");  // скобка не совпадает.
            return false;
        }
        return true;
    }
}

