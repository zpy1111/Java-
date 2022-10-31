package zpy.method;


import java.util.ArrayList;
import java.util.Scanner;



public class lianXi {
    public static void main(String[] args) {
        //1.给一个数组，求最大最小值
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入数组大小");
//        int n=scanner.nextInt();
//        System.out.println("请输入数组元素");
//        int[] array1 =new int[n];
//        for (int i=0;i<n;i++){
//            System.out.print("输入第"+i+"个元素：");
//            array1[i]=scanner.nextInt();
//        }
//        int minnum=array1[0];
//        int maxnum=array1[0];
//        for (int i=1;i<array1.length;i++){
//            if (array1[i]<minnum) {
//                minnum=array1[i];
//            }
//            if (array1[i]>maxnum){
//                maxnum=array1[i];
//            }
//        }
//        System.out.println("最大值是："+maxnum);
//        System.out.println("最小值是："+minnum);


        //2.冒泡排序
        //a.外循环,循环次数
        //b.内循环,两相邻数字比较,前一个比后一个大,交换位置
//        for (int i = 0; i < array1.length-1; i++) {//控制比较的趟数
//            for (int j = 0; j < array1.length - 1 - i; j++) {//控制每趟比较的次数
//                if (array1[j + 1] < array1[j]) {//交换两个相邻元素的位置
//                    int temp = array1[j + 1];
//                    array1[j + 1] = array1[j];
//                    array1[j] = temp;
//                }
//            }
//        }

        //2.选择排序
        //3.插入排序

        //4.将数组中的元素去重
        //1.排序
        int[] array1 = {0, 5, 3, 0, 2, 7, 5};
        int[] result = new int[7];
            for (int i = 0; i < array1.length - 1; i++) {//控制比较的趟数
            for (int j = 0; j < array1.length - 1 - i; j++) {//控制每趟比较的次数
                if (array1[j + 1] < array1[j]) {//交换两个相邻元素的位置
                    int temp = array1[j + 1];
                    array1[j + 1] = array1[j];
                    array1[j] = temp;
                }
            }
        }

       boolean flag = false;
        int k=0;
        int x,y;
        for (x=0;x<array1.length;x++) {
            for (y=x+1;y<array1.length;y++){
                if (array1[x]!=array1[y]){
                    x=y-1;
                    flag=true;
                    break;
                }
                else
                    flag=true;
            }
            if (flag){
                result[k]=array1[x];
                k++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);}


            //5.打乱一个排序好的数组
            //洗牌算法，首先从所有元素中随机选取一个与第一个元素进行交换，然后在第二个之后选择一个元素与第二个交换，直到最后一个元素
//        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
//        int length = arr.length;
//        for (int i = 0; i < length; i++) {
//            int iRandNum = (int) (Math.random() * length);
//            int temp = arr[iRandNum];
//            arr[iRandNum] = arr[i];
//            arr[i] = temp;
//        }
//
//        //输出
//        for (int i = 0; i < length; i++) {
//            System.out.print(arr[i] + " ");
//        }


//        //6.整数数组nums，将该数组中的所有偶数元素排列到奇数元素前
//        int[] arr = {1, 2, 2, 3, 7, 4};
//        for (int i = 0; i < arr.length - 1; i++) {
//           for (int j = 0; j < arr.length-1-i; j++) {
//                if ((arr[j] % 2 != 0)&&(arr[j+1] % 2 == 0)) {
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                   arr[j] = temp;
//               }
//            }
//        }
//    for (int i=0;i<arr.length;i++){
//       System.out.println(arr[i]);
//    }


//        int[] result = new int[arr.length];
//        int start = 0 ;
//        int end = arr.length -1 ;//奇数位下标
//      // 从两边同时进入循环 ， 奇数加在末尾 ，偶数加在头
//        for (int i = 0 , j = arr.length -1 ; i < arr.length && j >= 0 ; i++ , j--) {
//            if (arr[i] % 2 == 0){ // 偶数 加在首位
//                result[start] = arr[i];
//                start++;
//            }
//            if (arr[j] % 2 == 1){ // 奇数 加在末位
//                result[end] = arr[j];
//                end--;
//            }
//        }

            //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
            //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
            //你可以按任意顺序返回答案。
//        int[]  arr={2,1,6,7,9};
//        int n=10;
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i] + arr[j]==n) {
//                    System.out.println("第一个下标："+i);
//                    System.out.println("第二个下标："+j);
//                }
//            }
//        }


        }


//选择排序
//    public static void selectionSort(int[] array){
//        for (int i = 0; i < array.length-1; i++) {//控制比较的趟数
//            int minIndex=i;
//            for (int j = i+1; j < array.length; j++) {//控制每趟比较次数
//                if(array[minIndex]>array[j]){//如果比minIndex的数小，则取出该下标作为minIndex
//                    minIndex=j;
//                }
//            }
//            if(minIndex!=i){//如果i位置不是最小值，则交换位置
//                int temp=array[i];
//                array[i]=array[minIndex];
//                array[minIndex]=temp;
//            }
//        }
//    }
        //3.插入排序
//    public static void insertionSort(int [] array){
//        int current;//当前要排序的数
//        for (int i = 1; i < array.length - 1; i++) {//控制比较的趟数
//            current=array[i];//取出要排序的数
//            int preIndex = i-1;//要排序的数的前一个的下标
//            while (preIndex>=0&&current<array[preIndex]) {//控制当前数与前面的数进行比较
//                array[preIndex+1]=array[preIndex];
//                preIndex--;
//            }
//            array[preIndex+1]=current;
//        }
//
//    }

//
    }
