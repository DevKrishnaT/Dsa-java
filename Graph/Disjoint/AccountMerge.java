package Graph.Disjoint;

import java.util.*;

public class AccountMerge {

    class DSU {
        Map<String, String> parent = new HashMap<>();

        public String find(String x) {
            if (!parent.containsKey(x)) {
                parent.put(x, x);
            }
            if (!parent.get(x).equals(x)) {
                parent.put(x, find(parent.get(x)));
            }
            return parent.get(x);
        }

        public void union(String x, String y) {
            String px = find(x);
            String py = find(y);

            if (!px.equals(py)) {
                parent.put(py, px);
            }
        }

    }

    void main(String[] args) {


    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        DSU dsu = new DSU();
        Map<String, String> emailToName = new HashMap<>();
        for (List<String> account : accounts) {
            String name = account.get(0);
            String firstEmail = account.get(1);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                emailToName.putIfAbsent(email, name);
                dsu.union(firstEmail, email);
            }
        }

        Map<String, List<String>> groups = new HashMap<>();

        for (String email : emailToName.keySet()) {
            String root = dsu.find(email);

            groups.putIfAbsent(root, new ArrayList<>());

            groups.get(root).add(email);
        }
        List<List<String>> result = new ArrayList<>();
        for (String root : groups.keySet()) {
            List<String> emails = groups.get(root);
            Collections.sort(emails);
            List<String> merged = new ArrayList<>();
            merged.add(emailToName.get(root));
            merged.addAll(emails);
            result.add(merged);
        }

        return result;

    }

}
