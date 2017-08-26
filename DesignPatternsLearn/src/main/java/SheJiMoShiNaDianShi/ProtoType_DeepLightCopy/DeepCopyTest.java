package SheJiMoShiNaDianShi.ProtoType_DeepLightCopy;

import java.util.ArrayList;

/**
 * Created by hjw on 16/8/31.
 */
public class DeepCopyTest implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<String>();

    public void add(String s) {
        arrayList.add(s);
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public DeepCopyTest clone() {
        try {
            // 深复制 复制对象
            //复制引用成员内容
            DeepCopyTest deepCopyTest = (DeepCopyTest) super.clone();
            deepCopyTest.arrayList = (ArrayList<String>) this.arrayList.clone();
            return deepCopyTest;

        } catch (CloneNotSupportedException e) {

        }
        return null;
    }

    public static void main(String[] args) {
        DeepCopyTest deepCopyTest = new DeepCopyTest();


        deepCopyTest.add("aa");
        deepCopyTest.add("bb");

        System.out.println("deepLightCopyTest:" + "[" + deepCopyTest.getArrayList() + "]");

        DeepCopyTest deepCopyTest2 = deepCopyTest.clone();

        deepCopyTest2.add("cc");
        System.out.println("deepLightCopyTest2:" + "[" + deepCopyTest2.getArrayList() + "]");

        System.out.println("deepLightCopyTest:" + deepCopyTest);
        System.out.println("deepLightCopyTest2:" + deepCopyTest2);


        System.out.println("deepLightCopyTest:" + "[" + deepCopyTest.getArrayList() + "]");


    }

}
