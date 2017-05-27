/**
 * Created by ray on 17/5/27.
 */

import java.util.*;

public class Collection {

    /**
     *
     * Iterate Over Collection
     * @param args
     */
    public static void main(String[] args) {

        /**
         * array
         */
        String[] arr = new String [3];
        int[] arr1 = {0,1,2,3};

        arr[0] = "array_0_value";
        arr[1] = "array_1_value";
        arr[2] = "array_2_value";

        System.out.println("==========Array==========");
        for (int i = 0; i < arr1.length; i++ ) {
            System.out.printf("%d",arr1[i]);
        }
        System.out.println();
        for (String i : arr) {
            System.out.printf("%s ",i);
        }
        System.out.println();


        /**
         * list接口
         * 实现类:
         *      ArrayList
         *      LinkedList
         * list是有序集合, 也叫序列, 所以可以控制元素写入到List中的何处, 就是列表
         */
        String a = "A", b = "B", c = "C", d = "D";
        int na = 0, nb = 1, nc = 2, nd = 3;

        System.out.println("==========ArrayList==========");
        List<String> list = new ArrayList<>();
        ArrayList<Integer> alist = new ArrayList<>();

        list.add(a);
        list.add(b);
        list.add(b);
        alist.add(na);
        alist.add(nb);
        alist.set(0, nc);
        alist.set(1, nd);

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s", list.get(i));
        }
        System.out.println();
        for (String var : list) {
            System.out.printf("%s", var);
        }
        System.out.println();
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.printf("%s", itr.next());
        }
        System.out.println();


        /**
         *
         * set 接口
         * 实现类:
         *      HashSet
         *      LinkedHashSet
         *      TreeSet
         * set 不允许有重复元素, 就是一个集
         *
         */
        System.out.println("==========HashSet==========");
        Set<String> hashSet = new HashSet<>();
        hashSet.add(a);
        hashSet.add(b);
        hashSet.add(b);

        Iterator<String> its = hashSet.iterator();
        while (its.hasNext()) {
            System.out.printf("%s", its.next());
        }
        System.out.println();
        for (String var : hashSet) {
            System.out.printf("%s", var);
        }
        System.out.println();


        /**
         * map 接口
         * 实现类:
         *      HashMap
         *      Hashtable(很少用)
         *      TreeMap
         *      SortedMap
         *      LinkedHashMap
         *      WeakHashMap
         *
         *
         * key 不允许重复 否则即时覆盖
         * map 中的value 类似list, 可以重复, 每个元素可以根据key来查找, 类似:字典/关联数组
         * 只有迭代方式的遍历可以remove元素
         *
         *
         */
        System.out.println("==========HashMap==========");
        Map<String, Integer> map = new HashMap<>(16);
        map.put(a, na);
        map.put(c, nc);
        map.put(d, nc);
        map.put(d, nd);

        //用的较多
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s:%d ", entry.getKey(), entry.getValue());
        }
        System.out.println();

        //迭代+泛型
        Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            if (entry.getKey().equals(a)) {
                entries.remove();
            } else {
                System.out.printf("%s-%d ", entry.getKey(), entry.getValue());
            }
        }
        System.out.println();

        //迭代
        Iterator entries1 = map.entrySet().iterator();
        while (entries1.hasNext()) {
            Map.Entry entry = (Map.Entry) entries1.next();
            String k = (String) entry.getKey();
            Integer v = (Integer) entry.getValue();
            if (k.equals(c)) {
                entries1.remove();
            } else {
                System.out.printf("%s_%d ", k,v);
            }
        }
        System.out.println();

        //性能较高, 仅需要key或value时使用这种
        for (String k : map.keySet()) {
            System.out.printf("%s ", k);
        }
        for (Integer v : map.values()) {
            System.out.printf("%d ", v);
        }
        System.out.println();

        //效率低
        for (String k : map.keySet()) {
            System.out.printf("%s=%d ", k,map.get(k));
        }


    }
}
