# **Задача №1 Автор программы**

## **Цель**:

1. Создать программу, которая будет выводить в консоль имя разработчика.

### *Пример*:

``` Пример 1
Jane Dow 
```

``` Пример 2 
Иван Иванов
```

### **Моя реализация**:

1. Использовал ```StringBuilder``` в отдельном ```void``` методе, *copyrightPrint()*.

#### Метод *copyrightPrint()*:
``` java
    private static void copyrightPrint() {
        var stringBuilder = new StringBuilder();
        stringBuilder.append(Utils.ANSI_GREEN + "© " + Utils.ANSI_RESET);
        stringBuilder.append(Utils.ANSI_BLUE + "Eric \"Kotamadeo\" Temnitsky" + Utils.ANSI_RESET);
        System.out.println(stringBuilder);
    }
```

2. Дополнительно использовал кодирование цвета текста (ANSI).

#### Класс **Utils**:
``` java
public class Utils {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void printDelim() {
        System.out.println(ANSI_GREEN + "*********************************************" + ANSI_RESET);
    }
}
```

#### Метод *main()* в классе **Main**:
``` java
public class Main {
    public static void main(String[] args) {
        copyrightPrint();
    }
```

## *Вывод в консоль*:
``` 
© Eric "Kotamadeo" Temnitsky
```