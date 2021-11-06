package Stack.lesson3.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private InputStreamReader in = new InputStreamReader(System.in);
    private BufferedReader bufRead = new BufferedReader(in);
    void run() throws IOException {
        String inputString = getString();
        SwapString swapString = new SwapString(inputString);
        String outputString = swapString.swap();
        System.out.println("Swapped string: " + outputString);

        //qwerty
         // Swapped string: ytrewq
    }

    // принимаем строку в консоль
    String getString() throws IOException {
        return bufRead.readLine();
    }
}
