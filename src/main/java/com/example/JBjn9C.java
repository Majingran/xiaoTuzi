package com.example;

import java.util.*;

//设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。
//
// 请实现 KthLargest 类：
//
//
// KthLargest(int k, int[] nums) 使用整数 k 和整数流 nums 初始化对象。
// int add(int val) 将 val 插入数据流 nums 后，返回当前数据流中第 k 大的元素。
//
//
//
//
// 示例：
//
//
//输入：
//["KthLargest", "add", "add", "add", "add", "add"]
//[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
//输出：
//[null, 4, 5, 5, 8, 8]
//
//解释：
//KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
//kthLargest.add(3);   // return 4
//kthLargest.add(5);   // return 5
//kthLargest.add(10);  // return 5
//kthLargest.add(9);   // return 8
//kthLargest.add(4);   // return 8
//
//
//
//
// 提示：
//
//
// 1 <= k <= 104
// 0 <= nums.length <= 104
// -104 <= nums[i] <= 104
// -104 <= val <= 104
// 最多调用 add 方法 104 次
// 题目数据保证，在查找第 k 大元素时，数组中至少有 k 个元素
//
//
//
//
// 注意：本题与主站 703 题相同： https://leetcode-cn.com/problems/kth-largest-element-in-a-s
//tream/
// Related Topics 树 设计 二叉搜索树 二叉树 数据流 堆（优先队列）
// 👍 4 👎 0

public class JBjn9C {
    public static void main(String[] args) {
        int nums[] = {};
        KthLargest solution = new KthLargest(3, nums);
//        KthLargest2 solution2 = new KthLargest2(3, nums);
        System.out.println(solution.add(3));
        System.out.println(solution.add(5));
        for (int i = 0; i < 10000; i++) {
//            System.out.println(solution.add(3) == solution2.add(3));
//            System.out.println(solution.add(5)== solution2.add(5));
//            System.out.println(solution.add(10)== solution2.add(10));
//            System.out.println(solution.add(9)== solution2.add(9));
//            System.out.println(solution.add(4)== solution2.add(4));
            System.out.println(solution.add(3));
            System.out.println(solution.add(5));
//            System.out.println(solution2.add(3));
//            System.out.println(solution2.add(5));
//            System.out.println(solution.add(10)== solution2.add(10));
//            System.out.println(solution.add(9)== solution2.add(9));
//            System.out.println(solution.add(4)== solution2.add(4));
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class KthLargest {

        private int ktemp;

        private int[] numstemp;

        List<Integer> helpList = new ArrayList<>();

        public KthLargest(int k, int[] nums) {
            ktemp = k;
            numstemp = nums;
            for (int i = 0; i < numstemp.length; i++) {
                helpList.add(numstemp[i]);
            }


        }

        public int add(int val) {
            helpList.add(val);
            //||ktemp > 104 || helpList.size() > 104
            if (helpList.size() == 0) {
                return -1;
            }
            if (helpList.size() < ktemp) {
                Collections.sort(helpList);
                return helpList.get(0);
            }
            Comparator<Integer> cmp = new Comparator<Integer>() {
                public int compare(Integer e1, Integer e2) {
                    return e2 - e1;
                }
            };
            PriorityQueue<Integer> heap = new PriorityQueue<Integer>(cmp);
            for (int i : helpList) {
                heap.add(i);
            }
            int result = -1;
            for (int j = 0; j < ktemp; j++) {
                result = heap.poll();
            }
            return result;


        }
    }

    /**
     * Your KthLargest object will be instantiated and called as such:
     * KthLargest obj = new KthLargest(k, nums);
     * int param_1 = obj.add(val);
     */
//leetcode submit region end(Prohibit modification and deletion)


    static class KthLargest2 {
        PriorityQueue<Integer> pq;
        int k;

        public KthLargest2(int k, int[] nums) {
            this.k = k;
            pq = new PriorityQueue<Integer>();
            for (int x : nums) {
                add(x);
            }
        }

        public int add(int val) {
            pq.offer(val);
            if (pq.size() > k) {
                pq.poll();
            }
            return pq.peek();
        }
    }
}

