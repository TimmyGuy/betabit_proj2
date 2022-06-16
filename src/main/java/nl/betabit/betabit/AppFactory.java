package nl.betabit.betabit;

import java.util.HashMap;

public class AppFactory {
    private static HashMap<String, Object> items = new HashMap<>();

    public static void register(String name, Object object) {
        items.put(name, object);
    }

    public static Object get(String name) {
        return items.get(name);
    }
}
