public class IntArrayMethods{
    
    public static int arraySum(int[] a){
        int count = 0;
        for(int num:a){
            count+=num;
        }
        return count;
    }

    public static double arrayMean(int[] a){
        return (double)(arraySum(a))/(double)(a.length);
    }

    public static double arrayMin(int[] a){
        int count = a[0];
        for(int num:a){
            if(num<count){
                count = num;
            }
        }
        return count;
    }

    public static double arrayMax(int[] a){
        int count = a[0];
        for(int num:a){
            if(num>count){
                count = num;
            }
        }
        return count;
    }

    public static boolean[] arrayLocalMin(int[] a){
        boolean[] nums = new boolean[a.length];
        for(int i = 0; i<a.length; i++){
            if(i==0){
                nums[i] = a[i]<a[i+1];
            }else if(i==a.length-1){
                nums[i] = a[i]<a[i-1];
            }else{
                nums[i] = a[i]<a[i-1]&&a[i]<a[i+1];
            }
        }
        return nums;
    }

    public static boolean[] arrayLocalMax(int[] a){
        boolean[] nums = new boolean[a.length];
        for(int i = 0; i<a.length; i++){
            if(i==0){
                nums[i] = a[i]>a[i+1];
            }else if(i==a.length-1){
                nums[i] = a[i]>a[i-1];
            }else{
                nums[i] = a[i]>a[i-1]&&a[i]>a[i+1];
            }
        }
        return nums;
    }

    public static int arrayMode(int[] a){
        int b = 0;
        int count = 0;
        for(int num:a){
            if(arrayCount(a, num)>count){
                count = arrayCount(a, num);
                b = num;
            }
        }
        return b;
    }

    public static int arrayCount(int[] a, int b){
        int count = 0;
        for(int num:a){
            if(num==b){
                count++;
            }
        }
        return count;
    }

    public static boolean arrayContainsDuplicates(int[] a){
        for(int num:a){
            if(arrayCount(a, num)>1){
                return true;
            }
        }
        return false;
    }

    public static boolean arrayAllEqual(int[] a){
        if(arrayCount(a, a[0])==a.length){
            return true;
        }
        return false;
    }

    public static double[] arrayRollingAverage(int[] a, int b){
        double[] c = new double[a.length];
        for(int i = 0; i<a.length; i++){
            if(i-b+1<0){
                for(int j = i; j>=0; j--){
                    c[i]+=a[j];
                }
                c[i]/=i+1;
            }else{
                for(int j = i; j>i-b; j--){
                    c[i]+=a[j];
                }
                c[i]/=b;
            }
        }
        return c;
    }

    public static int[] arrayShift(int[] a, int b){
        int[] c = new int[a.length];
        for(int i = 0; i<a.length; i++){
            if(i-b<0){
                c[i]=a[a.length-b+i];
            }else{
                c[i] = a[i-b];
            }
        }
        return c;
    }

    public static int[] arrayReverse(int[] a){
        int[] c = new int[a.length];
        for(int i = 0; i<a.length; i++){
            c[i] = a[a.length-1-i];
        }
        return c;
    }
}