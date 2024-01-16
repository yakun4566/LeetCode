package org.example;


import java.util.Arrays;

/**
 * 1480. 一维数组的动态和
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *
 * 请返回 nums 的动态和。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,6,10]
 * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 * 示例 2：
 *
 * 输入：nums = [1,1,1,1,1]
 * 输出：[1,2,3,4,5]
 * 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
 * 示例 3：
 *
 * 输入：nums = [3,1,2,10,1]
 * 输出：[3,4,6,16,17]
 *
 */
public class Test_1480 {

    public static void main(String[] args) {
        int[] results = new Test_1480().runningSum(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(results));
    }
    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            results[i] = results[Math.max(i - 1, 0)] + nums[i];
        }
        return results;
    }

    /**
     *
     作者：力扣官方题解
     链接：https://leetcode.cn/problems/running-sum-of-1d-array/solutions/962723/yi-wei-shu-zu-de-dong-tai-he-by-leetcode-flkm/
     来源：力扣（LeetCode）
     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param nums
     * @return
     */
    public int[] runningSum_(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
