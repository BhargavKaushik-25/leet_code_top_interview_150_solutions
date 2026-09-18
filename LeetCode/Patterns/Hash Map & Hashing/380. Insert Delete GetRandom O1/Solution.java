class RandomizedSet {
private List<Integer> list;                 // stores the values
    private Map<Integer, Integer> map;          // value -> index in list
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; // already present
        }
        // Add to end of list and record its index
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; // not present
        }

        int idx = map.get(val);              // index of element to remove
        int lastVal = list.get(list.size() - 1); // last element in list

        // Move last element to the place of the element to delete
        list.set(idx, lastVal);
        map.put(lastVal, idx);

        // Remove last element from list and the val from map
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        int idx = rand.nextInt(list.size());
        return list.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */