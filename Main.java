import java.util.*;
public class Main {
    static Map<String, List<List<String>>> recipes = new HashMap<>();
    static Map<String, Integer> memo = new HashMap<>();
    public static int minOrbs(String potion) {
        if (memo.containsKey(potion)) {
            return memo.get(potion);
        }
        if (!recipes.containsKey(potion)) {
            memo.put(potion, 0);
            return 0;
        }
        int minCost = Integer.MAX_VALUE;
        for (List<String> recipe : recipes.get(potion)) {
            int cost = recipe.size() - 1;
            boolean valid = true;
            for (String ing : recipe) {
                int subCost = minOrbs(ing);
                if (subCost == Integer.MAX_VALUE) {
                    valid = false;
                    break;
                }
                cost += subCost;
            }
            if (valid) {
                minCost = Math.min(minCost, cost);
            }
        }
        memo.put(potion, minCost);
        return minCost;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("=");
            String potion = parts[0];
            String[] ingredients = parts[1].split("\\+");
            recipes.putIfAbsent(potion, new ArrayList<>());
            recipes.get(potion).add(Arrays.asList(ingredients));
        }
        String target = sc.nextLine().trim();
        int result = minOrbs(target);
        if (result == Integer.MAX_VALUE) {
            System.out.print(-1);  // no println, no extra spaces
        } else {
            System.out.print(result);
        }
        sc.close();
    }
}
