package ru.geekbrains.Java2;

public class MainX {
    private static final int size = 10_000_000;
    private static final int h = size / 2;

    public static void main(String[] args) {
        System.out.println(noThreadArrayMethod());  // примерно 7 секунд
        System.out.println(withThreadArrayMethod());// примерно 2 секунды
        // вывод: многопоточность это круто :)
    }

    private static long noThreadArrayMethod() {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long timeFinish = System.currentTimeMillis();

        return timeFinish - timeStart;
    }

    private static long withThreadArrayMethod() {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        float[] ar1 = new float[h];
        final float[] ar2 = new float[h];

        long timeStart = System.currentTimeMillis();
        System.arraycopy(arr, 0, ar1, 0, h);
        System.arraycopy(arr, h, ar2, 0, h);
        // это идёт в основном потоке
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = (float) (ar1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        // а это уже в отдельном
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < ar2.length; i++) {
                    ar2[i] = (float) (ar2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        }).start();
        System.arraycopy(ar1, 0, arr, 0, h);
        System.arraycopy(ar2, 0, arr, h, h);
        long timeFinish = System.currentTimeMillis();

        return timeFinish - timeStart;


    }
        /*
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        Parameters
        src − This is the source array.
        srcPos − This is the starting position in the source array.
        dest − This is the destination array.
        destPos − This is the starting position in the destination data.
        length − This is the number of array elements to be copied.
        */

}
