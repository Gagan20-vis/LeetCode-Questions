class RandomizedSet {
    HashSet<Integer> set;
    Random random;

    public RandomizedSet() {
        set = new HashSet<Integer>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(set.contains(val))
            return false;
        else{ set.add(val); return true;}

    }

    public boolean remove(int val) {
        if(!set.contains(val))
            return false;
        else{
            set.remove(val);
            return true;
        }
    }

    public int getRandom() {
        Integer[] a = new Integer[set.size()];
        set.toArray(a);
        int i = random.nextInt(a.length);
        return a[i];
    }
}