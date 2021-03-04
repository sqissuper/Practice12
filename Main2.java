import java.util.*;

public class Main2 {
    //翻转图像
//    public static int[][] flipAndInvertImage(int[][] image) {
//        int[][] newArr = new int[image.length][image[0].length];
//        for(int i = 0; i < image.length; i++) {
//            int n = 0;
//            for(int j = image[i].length - 1; j >= 0; j--) {
//                newArr[i][n] = image[i][j];
//                if(newArr[i][n] == 0) {
//                    newArr[i][n] = 1;
//                } else {
//                    newArr[i][n] = 0;
//                }
//                n++;
//            }
//        }
//        return newArr;
//    }
//    public static int[][] flipAndInvertImage(int[][] image) {
//        int[][] newArr = new int[image.length][image[0].length];
//        for(int i = 0; i < image.length; i++) {
//            int n = 0;
//            for(int j = image[i].length - 1; j >= 0; j--) {
//                newArr[i][n] = image[i][j];
//                n++;
//            }
//        }
//        for(int i = 0; i < newArr.length; i++) {
//            for(int j = 0; j < newArr[i].length; j++) {
//                if(newArr[i][j] == 0) {
//                    newArr[i][j] = 1;
//                } else {
//                    newArr[i][j] = 0;
//                }
//            }
//        }
//        return newArr;
//    }

    //无重复字符的最长子串
//    public static int lengthOfLongestSubstring(String s) {
//        Map<Character,Integer> map = new HashMap<>();
//        int left = 0,right = 0,ret = 0;
//        while(right < s.length()) {
//            char c = s.charAt(right);
//            if(map.containsKey(c)) {
//                left = Math.max(map.get(c) + 1,left);
//            }
//
//            map.put(s.charAt(right),right++);
//            ret = Math.max(ret,right - left);
//
//        }
//        return ret;
//    }

    //常见单词
//    public static String mostCommonWord(String paragraph, String[] banned) {
//        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]"," ");
//        String[] paragraphs = paragraph.split("\\s+");
//        HashMap<String,Integer> map = new HashMap<>();
//        HashSet<String> set = new HashSet<>();
//
//        for (String s:banned) {
//            set.add(s);
//        }
//        for(int i = 0; i < paragraphs.length; i++) {
//            if(!set.contains(paragraphs[i])) {
//                if(map.containsKey(paragraphs[i])) {
//                    Integer num = map.get(paragraphs[i]);
//                    map.put(paragraphs[i],num + 1);
//                } else if(paragraphs[i].length() > 0) {
//                    map.put(paragraphs[i],1);
//                }
//            }
//        }
//        int max = 0;
//        String ret = "";
//        for(int i = 0; i < paragraphs.length; i++) {
//            if(map.containsKey(paragraphs[i])) {
//                max = Math.max(max,map.get(paragraphs[i]));
//            }
//        }
//        Set<Map.Entry<String,Integer>> tmp = map.entrySet();
//        for (Map.Entry<String,Integer> m:tmp) {
//            if(m.getValue() == max) {
//                ret = m.getKey();
//            }
//        }
//        return ret;
//    }


    //重建二叉树
//    public int preIndex = 0;
//    public TreeNode buildTree(int[] pre,int[] in,int s,int e) {
//        if(s > e) return null;
//        TreeNode root = new TreeNode(pre[preIndex]);
//        int index = findTravel(in,s,e,pre[preIndex]);
//        preIndex++;
//        root.left = buildTree(pre,in,s,index - 1);
//        root.right = buildTree(pre,in,index + 1,e);
//        return root;
//    }
//    public int findTravel(int[] in,int s,int e,int key) {
//        for(int i = s; i <= e; i++) {
//            if(in[i] == key) {
//                return i;
//            }
//        }
//        return -1;
//    }
//    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//        if(pre.length == 0 || in.length == 0) return null;
//        int s = 0,e = pre.length - 1;
//        return buildTree(pre,in,s,e);
//
//    }
    //斐波那契数
//    public static int Fibonacci(int n) {
//        int f1 = 0,f2 = 1,f3 = 0;
//        while(n - 1 != 0) {
//            f3 = f1 + f2;
//            f1 = f2;
//            f2 = f3;
//            n--;
//        }
//        return f3;
//    }

    //奇数放在偶数前边
//    public static int[] reOrderArray (int[] array) {
//        // write code here
//        int l = 0, r = array.length - 1;
//        while(l < r) {
//            if(array[l] % 2 != 0) {
//                l++;
//            } else if (array[r] % 2 == 0) {
//                r--;
//            } else if(array[r] % 2 != 0) {
//                int tmp = array[l];
//                array[l] = array[r];
//                array[r] = tmp;
//            }
//        }
//        return array;

//    int[] newArr = new int[array.length];
//    int k = 0;
//        Arrays.sort(array);
//        for(int i = 0; i < array.length; i++) {
//        if(array[i] % 2 != 0) {
//            newArr[k++] = array[i];
//        }
//    }
//        for(int i = 0; i < array.length; i++) {
//        if(array[i] % 2 == 0) {
//            newArr[k++] = array[i];
//        }
//    }
//        return newArr;
//    }
    public static void main(String[] args) {

//        int[] arr = {1,2,3,4};
//        System.out.println(Arrays.toString(reOrderArray(arr)));
//        int n = 4;
//        System.out.println(Fibonacci(n));
//        String paragraph = "Bob. hIt, baLl";
//        String[] banned = {"bob", "hit"};
//        System.out.println(paragraph);
//        System.out.println(mostCommonWord(paragraph, banned));

        //下厨房
//        Scanner sc = new Scanner(System.in);
//        HashSet<String> set = new HashSet<>();
//        while(sc.hasNextLine()) {
//            String s = sc.nextLine();
//            String[] ss = s.split(" ");
//            for (int i = 0; i < ss.length; i++) {
//                set.add(ss[i]);
//            }
//        }
//        System.out.println(set.size());

       // Fibonacci数列
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int f1 = 0;
//        int f2 = 1;
//        int f3 = 0;
//        while(f2 < n) {
//            f3 = f1 + f2;
//            f1 = f2;
//            f2 = f3;
//        }
//        if(Math.abs(n - f1) > Math.abs(f2 - n)) {
//            System.out.println(Math.abs(f2 - n));
//        } else {
//            System.out.println(Math.abs(n - f1));
//        }

//        String s = "pwwkew";
//        lengthOfLongestSubstring(s);

//        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
//        int[][] ret = flipAndInvertImage(arr);
//        System.out.println(Arrays.toString(ret));
    }
}
