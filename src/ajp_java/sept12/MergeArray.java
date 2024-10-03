package ajp_java.sept12;

public class MergeArray {
    public static int[] merge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] ans = new int[n + m];

        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                ans[k++] = a[i++];
            } else {
                ans[k++] = b[j++];
            }
        }
        while (i < n) {
            ans[k++] = a[i++];
        }
        while (j < m) {
            ans[k++] = b[j++];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 16, 88, 98};
        int[] b = {3, 7, 78, 80, 100};

        int[] ans = merge(a, b);
        for(int num: ans){
            System.out.print(num+" ");
        }
    }
}
